package com.spe.workwise.customModel;

import com.spe.workwise.bean.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserModel {

    private Long userId;
    private String username;

    private String email;
    private String phone;
    private String name;
    private String businessTitle;

    private Set<Role> roles;

}
