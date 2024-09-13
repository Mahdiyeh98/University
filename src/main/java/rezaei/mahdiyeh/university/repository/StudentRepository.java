package rezaei.mahdiyeh.university.repository;

import org.springframework.stereotype.Repository;
import rezaei.mahdiyeh.university.entity.Student;

import java.util.Optional;

@Repository
public interface StudentRepository extends UserRepository<Student>{
    Optional<Student> findByStdNumber(long stdNumber);
}
