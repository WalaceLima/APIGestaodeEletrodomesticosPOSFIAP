package br.com.apieletro.apieletro.models.interfaces;

import br.com.apieletro.apieletro.models.Eletrodomestico;
import br.com.apieletro.apieletro.models.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa,Long> {}
