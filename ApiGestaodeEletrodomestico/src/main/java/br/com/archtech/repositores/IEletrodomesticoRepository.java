package br.com.archtech.repositores;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.archtech.models.Eletrodomestico;

@Repository
public interface IEletrodomesticoRepository extends JpaRepository<Eletrodomestico, Long>{

}
