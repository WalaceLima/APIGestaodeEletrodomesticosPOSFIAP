package br.com.archtech.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.archtech.entities.Eletrodomestico;

@Repository
public interface EletrodomesticoRepository extends JpaRepository<Eletrodomestico, Integer> {}
