package com.aprende.lima.Interface;

import com.aprende.lima.Model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository <Aluno, Long> {


}
