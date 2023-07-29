package br.com.apieletro.apieletro.models.interfaces;

import br.com.apieletro.apieletro.models.Eletrodomestico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EletrodomesticoRepository extends JpaRepository<Eletrodomestico,Long> {
}
