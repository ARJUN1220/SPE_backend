package com.spe.workwise.service.user;

import com.spe.workwise.bean.User;
import com.spe.workwise.customModel.UserModel;

import java.util.List;
import java.util.Map;

public interface UserService {
    User generateToken(Map<String, String> payload);

    UserModel saveUser(Map<String, String> payload);

    User findOne(String username);

    List<User> findAll();
}
