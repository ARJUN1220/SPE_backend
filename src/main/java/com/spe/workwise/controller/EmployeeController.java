package com.spe.workwise.controller;

import com.spe.workwise.bean.Project;
import com.spe.workwise.bean.Task;
import com.spe.workwise.customModel.ProjectModel;
import com.spe.workwise.customModel.TaskModel;
import com.spe.workwise.service.Employee.EmployeeService;
import com.spe.workwise.utils.Constant;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@CrossOrigin("*")
@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private static final Logger logger = LogManager.getLogger("workwise");

    @Autowired
    private EmployeeService employeeService;

    @PreAuthorize("hasAuthority('EMPLOYEE')")
    @GetMapping("/getAllProjects")
    public ResponseEntity<?> getAllProjects()
    {
        try {
            UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
            String username = userDetails.getUsername();
            List<Project> projects = employeeService.getAllProjects(username);
            List<ProjectModel> projectModels = new ArrayList<>();
            projects.forEach(project -> {
                projectModels.add(Constant.getModelMapper().map(project, ProjectModel.class));
            });
            logger.error("[EmployeeController] - [Get All Projects by Employee]");
            return ResponseEntity.ok(projectModels);
        }catch (Exception e){
            logger.error("[EmployeeController] - [Error in Get All Projects]");
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PreAuthorize("hasAuthority('EMPLOYEE')")
    @GetMapping("/getTaskByProject")
    public ResponseEntity<?> getAllTaskByProjectByUser(@RequestParam Map<String,String> param)
    {
        try {
            UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
            String username = userDetails.getUsername();
            List<Task> res = employeeService.getAllTaskByProjectByUser(param, username);
            List<TaskModel> taskModels = new ArrayList<>();
            res.forEach(task -> {
                taskModels.add(Constant.getModelMapper().map(task, TaskModel.class));
            });
            logger.info("[EmployeeController] - [Get All Task By Project By User]");
            return ResponseEntity.ok(taskModels);
        }catch (Exception e){
            logger.error("[EmployeeController] - [Error in Get All Task By Project By User]");
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PreAuthorize("hasAuthority('EMPLOYEE')")
    @PostMapping("/updateTaskStatus")
    public ResponseEntity<?> updateTaskStatus(@RequestBody Map<String,String> payload)
    {
        try {
            UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
            String username = userDetails.getUsername();
            List<Task> res = employeeService.updateTaskStatus(payload, username);
            List<TaskModel> taskModels = new ArrayList<>();
            res.forEach(task -> {
                taskModels.add(Constant.getModelMapper().map(task, TaskModel.class));
            });
            logger.info("[EmployeeController] - [Update Task Status]");
            return ResponseEntity.ok(taskModels);
        }catch (Exception e){
            logger.error("[EmployeeController] - [Error in Update Task Status]");
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
