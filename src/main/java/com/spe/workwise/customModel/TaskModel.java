package com.spe.workwise.customModel;

import com.spe.workwise.bean.TaskStatusLu;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TaskModel {

    private Long taskId;

    private String taskName;

    private String description;

    private TaskStatusLu statusLu;
    private UserModel user;

}
