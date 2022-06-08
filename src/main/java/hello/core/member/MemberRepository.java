package hello.core.member;

public interface MemberRepository {

    /**
     * 회원저장
     * @param member
     */
    void save(Member member);

    /**
     * 아이디로 회원찾기
     * @param memberId
     * @return
     */
    Member findById(Long memberId);
}
