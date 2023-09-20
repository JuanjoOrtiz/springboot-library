package com.springboot.api.library.services;

import com.springboot.api.library.entity.Member;
import com.springboot.api.library.exceptions.GeneralServiceException;
import com.springboot.api.library.exceptions.NoDataFoundException;
import com.springboot.api.library.exceptions.ValidateServiceException;
import com.springboot.api.library.repository.MemberRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Slf4j
@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberRepository memberRepository;

    @Override
    public List<Member> findAll() {
        try {
            return memberRepository.findAll();
        } catch (ValidateServiceException | NoDataFoundException e) {
            log.info(e.getMessage(), e);
            throw e;
        } catch (Exception e) {
            log.info(e.getMessage(), e);
            throw new GeneralServiceException(e.getMessage(), e);
        }


    }

    @Override
    public Optional<Member> findById(Long id) {
        try {
            return Optional.ofNullable(memberRepository.findById(id)
                    .orElseThrow(() -> new NoDataFoundException("El socio no existe")));
        } catch (ValidateServiceException | NoDataFoundException e) {
            log.info(e.getMessage(), e);
            throw e;
        } catch (Exception e) {
            log.info(e.getMessage(), e);
            throw new GeneralServiceException(e.getMessage(), e);

        }

    }

    @Transactional
    @Override
    public Member save(Member member) {
        try {

            if (Objects.isNull(member)) {
                Member newMember = memberRepository.save(member);
                return newMember;
            }

            Member exitMember = memberRepository.findById(member.getId())
                    .orElseThrow(() -> new NoDataFoundException("El socio no existe"));

            exitMember.setMemberShipNumber(member.getMemberShipNumber());
            exitMember.setName(member.getName());
            exitMember.setNif(member.getNif());
            exitMember.setBrithdayDate(member.getBrithdayDate());
            exitMember.setMobile(member.getMobile());
            exitMember.setAddress(member.getAddress());
            exitMember.setEmail(member.getEmail());
            exitMember.setProvince(member.getProvince());

            memberRepository.save(exitMember);

            return  exitMember;

        } catch (ValidateServiceException | NoDataFoundException e) {
            log.info(e.getMessage(), e);
            throw e;
        } catch (Exception e) {
            log.info(e.getMessage(), e);
            throw new GeneralServiceException(e.getMessage(), e);

        }
    }

    @Override
    public void delete(Long id) {
        try {
            Member member = memberRepository.findById(id).orElseThrow(() -> new NoDataFoundException("El socio no existe"));
            memberRepository.delete(member);

        } catch (ValidateServiceException | NoDataFoundException e) {
            log.info(e.getMessage(), e);
            throw e;
        } catch (Exception e) {
            log.info(e.getMessage(), e);
            throw new GeneralServiceException(e.getMessage(), e);

        }
    }
}
