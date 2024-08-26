package inshining.applydemo.repository;

import inshining.applydemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJPARepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
}
