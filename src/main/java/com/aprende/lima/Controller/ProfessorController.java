package com.aprende.lima.Controller;


import com.aprende.lima.Model.Aluno;
import com.aprende.lima.Model.Professor;
import com.aprende.lima.Service.AlunoService;
import com.aprende.lima.Service.ProfessorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/professores")
public class ProfessorController {

    private final ProfessorService service;


    public ProfessorController(ProfessorService service) {
        this.service = service;
    }

    @GetMapping
    public List<Professor> buscarProfessores() {
        return service.listaDeProfessor();
    }

    @PostMapping
    public Professor criar(@RequestBody Professor novoProfessor) {
        return service.criarProfessor(novoProfessor);
    }

    @DeleteMapping("/{id}")
    public void excluirProfessor(@PathVariable Long id) {
        service.deletarProfessor(id);
    }


    @GetMapping("/{id}")
    public Professor buscarProfessorPorId(@PathVariable long id) {
        return service.buscarProfessorId(id);
    }

    @PutMapping("/{id}")
    public Professor atualizaProfessor(@PathVariable Long id, @RequestBody Professor alteraProfessor) {
        Professor atualizado = service.buscarProfessorId(id);
        if (atualizado == null) return null;

    atualizado.setNome(alteraProfessor.getNome());
    atualizado.setEmail(alteraProfessor.getEmail());
    atualizado.setTelefone(alteraProfessor.getTelefone());
    return service.criarProfessor(atualizado);
    }
}

