package com.spe.workwise.service.role;

import com.spe.workwise.bean.Role;

public interface RoleService {
    Role findByName(String name);
}
