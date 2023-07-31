package com.springboot.api.library.services;


import com.springboot.api.library.entity.Member;

import java.util.*;


public interface MemberService {
    List<Member> findAll();
    Optional<Member> findById(Long id);
    Member save(Member member);
    void delete(Long id);
}
