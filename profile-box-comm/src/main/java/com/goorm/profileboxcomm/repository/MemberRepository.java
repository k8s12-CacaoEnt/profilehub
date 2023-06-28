package com.goorm.profileboxcomm.repository;

import com.goorm.profileboxcomm.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
    Boolean existsByMemberEmail(@Param("memberEmail") String email);
    Member findMemberByMemberEmailAndMemberPassword(@Param("memberEmail") String email, @Param("memberPassword") String password);
    Member findMemberByMemberId(@Param("memberId") Long memberId);
}
