package com.blue.bridge.roles.service;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.blue.bridge.exceptions.NotFoundException;
import com.blue.bridge.res.Response;
import com.blue.bridge.roles.entity.Role;
import com.blue.bridge.roles.repo.RoleRepo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RoleServiceImp implements RoleService {

    private final RoleRepo roleRepo;

    @Override
    public Response<Role> createRole(Role roleRequest) {

        Role saveRole = roleRepo.save(roleRequest);

        return Response.<Role>builder()
                .statusCode(200)
                .message("Role saved successfully.")
                .data(saveRole)
                .build();
    }

    @Override
    public Response<Role> updateRole(Role roleRequest) {

        Role role = roleRepo.findById(roleRequest.getId())
                .orElseThrow(() -> new NotFoundException("Role not found"));
        role.setName(roleRequest.getName());

        Role updateRole = roleRepo.save(role);

        return Response.<Role>builder()
                .statusCode(201)
                .message("Role updated successfully.")
                .data(updateRole)
                .build();
    }

    @Override
    public Response<List<Role>> getAllRoles() {

        List<Role> roles = roleRepo.findAll();

        return Response.<List<Role>>builder()
                .statusCode(200)
                .message("Roles retreived successfully")
                .data(roles)
                .build();
    }

    @Override
    public Response<?> deleteRole(Long id) {
        
        if (!roleRepo.existsById(id)) {
            throw new NotFoundException("Role not found");
        }

        roleRepo.deleteById(id);
        
        return Response.<Role>builder()
            .statusCode(HttpStatus.OK.value())
            .message("Role deleted successfully.")
            .build();
    }
}
