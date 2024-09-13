package rezaei.mahdiyeh.university.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.Optional;

@NoRepositoryBean
public interface UserRepository<T> extends JpaRepository<T, Long> {
    Optional<T> findByNationalCode(Long nationalCode);
    Optional<T> findByUsername(String username);
}
