package sevenvalley.sevenvalleyspring.service;

import sevenvalley.sevenvalleyspring.domain.Member;
import sevenvalley.sevenvalleyspring.dao.MemberRepository;
import sevenvalley.sevenvalleyspring.dao.MemoryMemberRepository;

public class MemberService {

    private final MemberRepository memberRepository = new MemoryMemberRepository();

    public Long join(Member member) {

        extracted(member);

        memberRepository.save(member);
        return member.getId();
    }

    private void extracted(Member member) {
        memberRepository.findByName(member.getName())
            .ifPresent(m -> {
            throw new IllegalStateException("이미 존재하는 회원입니다.");
        });
    }

}
