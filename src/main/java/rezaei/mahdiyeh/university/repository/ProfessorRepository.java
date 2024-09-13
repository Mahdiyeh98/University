package rezaei.mahdiyeh.university.repository;

import org.springframework.stereotype.Repository;
import rezaei.mahdiyeh.university.entity.Professor;

import java.util.Optional;

@Repository
public interface ProfessorRepository extends UserRepository<Professor> {
    Optional<Professor> findByCode(int code);
}
