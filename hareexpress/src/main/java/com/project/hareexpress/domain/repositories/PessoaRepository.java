package com.project.hareexpress.domain.repositories;

import com.project.hareexpress.domain.models.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {

}
