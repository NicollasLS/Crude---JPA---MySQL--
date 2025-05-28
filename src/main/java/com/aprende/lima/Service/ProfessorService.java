package com.aprende.lima.Service;

import com.aprende.lima.Interface.AlunoRepository;
import com.aprende.lima.Interface.ProfessorRepository;
import com.aprende.lima.Model.Aluno;
import com.aprende.lima.Model.Professor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessorService {

    private final ProfessorRepository repository;

    public ProfessorService(ProfessorRepository repository) {
        this.repository = repository;
    }

    public List<Professor> listaDeProfessor() {
        return repository.findAll();
    }

    public Professor criarProfessor(Professor professores) {
        return repository.save(professores);
    }

    public void deletarProfessor(Long id){
        repository.deleteById(id);
    }

    public Professor buscarProfessorId (Long id) {
        return repository.findById(id).orElse(null);
    }
}

