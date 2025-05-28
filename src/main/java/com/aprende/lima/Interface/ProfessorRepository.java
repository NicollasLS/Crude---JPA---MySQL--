package com.aprende.lima.Interface;

import com.aprende.lima.Model.Aluno;
import com.aprende.lima.Model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository <Professor, Long> {


}
