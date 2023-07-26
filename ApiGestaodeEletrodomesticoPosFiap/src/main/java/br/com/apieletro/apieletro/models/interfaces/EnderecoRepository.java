package br.com.apigestaoconsumo.apigestaoconsumo.models.interfaces;

import br.com.apigestaoconsumo.apigestaoconsumo.models.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<Endereco,Long> {}
