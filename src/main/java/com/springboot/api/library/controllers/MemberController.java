package com.springboot.api.library.controllers;



import com.springboot.api.library.entity.Member;
import com.springboot.api.library.services.MemberServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class MemberController {

    @Autowired
    private MemberServiceImpl memberService;

    @GetMapping("/member")
    public List<Member> findAll(){
        return memberService.findAll();
    }

    @GetMapping("/member/{id}")
    public Optional<Member> findById(@PathVariable Long id){
        return memberService.findById(id);
    }

    @DeleteMapping("/member/{id}")
    public void delete(@PathVariable Long id){
        memberService.delete(id);
    }


}
