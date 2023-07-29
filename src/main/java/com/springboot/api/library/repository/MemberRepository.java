package com.springboot.api.library.repository;

import com.springboot.api.library.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member,Long> {
}
