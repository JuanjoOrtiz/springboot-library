package com.springboot.api.library.services;

import com.springboot.api.library.entity.Member;
import com.springboot.api.library.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberRepository memberRepository;

    @Override
    public List<Member> findAll() {

        return memberRepository.findAll();
    }

    @Override
    public Optional<Member> findById(Long id) {

        return memberRepository.findById(id);
    }

    @Override
    public Member save(Member member) {

        return memberRepository.save(member);

    }

    @Override
    public void delete(Long id) {
        memberRepository.deleteById(id);
    }
}
