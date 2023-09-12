package com.springboot.api.library.auth.repository;

import com.springboot.api.library.auth.models.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
