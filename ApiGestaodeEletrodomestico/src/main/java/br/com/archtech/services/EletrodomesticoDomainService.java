package br.com.archtech.services;

import org.springframework.stereotype.Service;

import br.com.archtech.models.Eletrodomestico;

@Service
public interface EletrodomesticoDomainService {
void criarEletrodomestico(Eletrodomestico eletrodomestico);
}
