package com.spe.workwise;

import com.spe.workwise.service.init.AddAdminImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WorkwiseApplication {
    public static void main(String[] args) {
        SpringApplication.run(WorkwiseApplication.class, args);
        AddAdminImpl addAdmin = new AddAdminImpl();
        try{
            addAdmin.postToApi();
        }
        catch(Exception e){
            System.out.println("e = " + e);
        }
    }
}
