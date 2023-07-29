package br.com.apieletro.apieletro.models.interfaces;

import br.com.apieletro.apieletro.models.Eletrodomestico;
import br.com.apieletro.apieletro.models.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<Endereco,Long> {}
