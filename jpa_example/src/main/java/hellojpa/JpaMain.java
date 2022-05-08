package hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class JpaMain {

    public static void main(String[] args){

        EntityManagerFactory emf =  Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {
            /*  insert
            Member member = new Member();
            member.setId(2L);
            member.setName("jpaHello2");

            em.persist(member);
            */

            /* select
            Member findMember = em.find(Member.class,1L);
            System.out.println("getId : "+findMember.getId());
            System.out.println("getName : "+findMember.getName());*/

            /* delete
            Member findMember = em.find(Member.class,1L);
            em.remove(findMember);
            */

            /* update
            Member findMember = em.find(Member.class,2L);
            findMember.setName("updateName");
            */
/*
            List<Member> result =  em.createQuery("select m from Member as m",Member.class)
                    .setFirstResult(1)
                    .setMaxResults(10)  // 페이지네이션
                    .getResultList();
            for(Member member : result){
                System.out.println(member.getName());
            }*/

            tx.commit();
        }catch (Exception e){
            tx.rollback();

        }finally {
            em.close();
        }
        emf.close();
    }

}
