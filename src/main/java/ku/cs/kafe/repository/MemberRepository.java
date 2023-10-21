// Prompan Uechanwech 6410451172
package ku.cs.kafe.repository;

import ku.cs.kafe.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface MemberRepository extends JpaRepository<Member, UUID> {
    // SELECT * FROM Member where username = 'username'
    Member findByUsername(String username);
}
