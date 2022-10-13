package com.project.hareexpress.domain.interfaces;

import com.project.hareexpress.domain.models.Pessoa;

import java.util.List;

public interface IPessoaService {

    List<Pessoa> listPessoas();
    Pessoa createPessoa(Pessoa pessoa);
    Pessoa updatePessoa(Pessoa pessoa);
    Boolean deletePessoas(Integer pessoaId);
}
