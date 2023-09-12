package com.springboot.api.library.auth.repository;

import com.springboot.api.library.auth.models.entity.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role,Long> {
}
