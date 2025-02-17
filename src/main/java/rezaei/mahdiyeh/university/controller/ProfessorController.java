package rezaei.mahdiyeh.university.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import rezaei.mahdiyeh.university.entity.Professor;
import rezaei.mahdiyeh.university.service.ProfessorService;

import java.util.List;

@RestController
@RequestMapping("professor/v1/")
@RequiredArgsConstructor
public class ProfessorController {
    private final ProfessorService professorService;

    @PostMapping("save")
    @ResponseStatus(HttpStatus.CREATED)
    public Professor save(@RequestBody Professor professor){
        return professorService.save(professor);
    }

    @PutMapping("update")
    @ResponseStatus(HttpStatus.OK)
    public Professor update(@RequestBody Professor professor){
        return professorService.update(professor);
    }

    @DeleteMapping("delete/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        professorService.deleteById(id);
    }

    @GetMapping("find/{id}")
    public Professor findById(@PathVariable Long id){
        return professorService.findById(id);
    }

    @GetMapping("list")
    public List<Professor> findAll(){
        return professorService.findAll();
    }

}
