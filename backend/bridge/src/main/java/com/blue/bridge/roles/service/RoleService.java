package com.blue.bridge.roles.service;

import java.util.List;

import com.blue.bridge.res.Response;
import com.blue.bridge.roles.entity.Role;

public interface RoleService {

    Response<Role> createRole(Role roleRequest);

    Response<Role> updateRole(Role roleRequest);

    Response<List<Role>> getAllRoles();
    
    Response<?> deleteRole(Long id);
}
