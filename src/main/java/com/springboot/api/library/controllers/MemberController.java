package com.springboot.api.library.controllers;




import com.springboot.api.library.entity.Member;
import com.springboot.api.library.services.MemberServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
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

    @PostMapping("/member")
    public ResponseEntity<?> save(@Valid @RequestBody Member member) {

        return ResponseEntity.status(HttpStatus.CREATED).body(memberService.save(member));

    }

    @PutMapping("/member/{id}")
    public ResponseEntity<?> update(@Valid @RequestBody Member member, @PathVariable Long id){
        Optional<Member> o =  memberService.findById(id);
        if(o.isPresent()){
            Member memberDb = o.get();
            memberDb.setMemberShipNumber(member.getMemberShipNumber());
            memberDb.setName(member.getName());
            memberDb.setNif(member.getNif());
            memberDb.setBrithdayDate(memberDb.getBrithdayDate());
            memberDb.setMobile(memberDb.getMobile());
            memberDb.setEmail(member.getEmail());
            memberDb.setProvince(member.getProvince());
            return ResponseEntity.status(HttpStatus.CREATED).body(memberService.save(memberDb));
        }
        return ResponseEntity.notFound().build();
    }


    @DeleteMapping("/member/{id}")
    public void delete(@PathVariable Long id){
        memberService.delete(id);
    }


}
