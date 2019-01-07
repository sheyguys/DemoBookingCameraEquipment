package sut.sa.g16.Repository;

import org.springframework.web.bind.annotation.CrossOrigin;
import sut.sa.g16.Entity.Member;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
@CrossOrigin(origins = "http://localhost:4200")
public interface MemberRepository extends JpaRepository<Member, Long> {
    Member findByMemberId(Long memberId);
    Member findByName(String name);
    Member findByUsernameAndPassword(String username,String password);
}
