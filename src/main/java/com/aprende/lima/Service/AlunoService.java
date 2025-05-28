package com.aprende.lima.Service;

import com.aprende.lima.Interface.AlunoRepository;
import com.aprende.lima.Model.Aluno;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {

    private final AlunoRepository repository;

    public AlunoService(AlunoRepository repository) {
        this.repository = repository;
    }

    public List<Aluno> listaDeAluno() {
        return repository.findAll();
    }

    public Aluno criarAluno(Aluno alunos) {
        return repository.save(alunos);
    }

    public void deletarAluno(Long id){
        repository.deleteById(id);
    }

    public Aluno buscarAlunoId (Long id) {
        return repository.findById(id).orElse(null);
    }
}

