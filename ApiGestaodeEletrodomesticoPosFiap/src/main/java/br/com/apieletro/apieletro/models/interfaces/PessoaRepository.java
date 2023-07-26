package br.com.apigestaoconsumo.apigestaoconsumo.models.interfaces;

import br.com.apigestaoconsumo.apigestaoconsumo.models.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa,Long> {}
