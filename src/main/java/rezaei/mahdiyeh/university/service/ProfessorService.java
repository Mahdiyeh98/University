package rezaei.mahdiyeh.university.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import rezaei.mahdiyeh.university.entity.Professor;
import rezaei.mahdiyeh.university.exception.ConflictException;
import rezaei.mahdiyeh.university.exception.NotFoundException;
import rezaei.mahdiyeh.university.repository.ProfessorRepository;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class ProfessorService {
    private final ProfessorRepository professorRepository;

    public Professor save(Professor professor) {
        Optional<Professor> optionalProfessor;

        optionalProfessor = professorRepository.findByCode(professor.getCode());
        if (optionalProfessor.isPresent())
            throw new ConflictException("Professor has existed.");

        optionalProfessor = professorRepository.findByNationalCode(professor.getNationalCode());
        if (optionalProfessor.isPresent())
            throw new ConflictException("National Code already exists.");

        optionalProfessor = professorRepository.findByUsername(professor.getUsername());
        if (optionalProfessor.isPresent())
            throw new ConflictException("Username already exists. Please try another one.");

        return optionalProfessor.get();
    }

    public Professor update(Professor professor){
        findById(professor.getId());
        return professorRepository.save(professor);
    }

    public void deleteById(Long id){
        findById(id);
        professorRepository.deleteById(id);
    }

    public List<Professor> findAll(){
        return professorRepository.findAll();
    }

    public Professor findById(Long id) {
        Optional<Professor> professor = professorRepository.findById(id);
        if (professor.isEmpty())
            throw new NotFoundException("404! Professor doesn't exist.");
        return professor.get();
    }
}
