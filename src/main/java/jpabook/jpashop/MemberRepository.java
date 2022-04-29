package jpabook.jpashop;

import jpabook.jpashop.domain.Member;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class MemberRepository {

    @PersistenceContext
    private EntityManager em;

    public Long save(Member member){
        em.persist(member);
        return member.getId();          //멤버로 반환하면 되는데?id만 반환하는이유 커맨드랑쿼리를 분리해라
    }
    public Member find(Long id){
        return em.find(Member.class, id);
    }
}