package hello.core.member;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class MemoryMemberRepository implements MemberRepository {

    private static Map<Long, Member> store = new HashMap<>();

    /**
     * 회원저장
     * @param member
     */
    @Override
    public void save(Member member) {
        store.put(member.getId(), member);
    }

    /**
     * 아이디로 회원찾기
     * @param memberId
     * @return
     */
    @Override
    public Member findById(Long memberId) {
        return store.get(memberId);
    }

}