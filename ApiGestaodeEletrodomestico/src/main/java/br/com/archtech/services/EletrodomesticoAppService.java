package br.com.archtech.services;

import org.springframework.stereotype.Service;

import br.com.archtech.dtos.EletrodomesticoPostDto;
import br.com.archtech.dtos.EletrodomesticoResponseDTO;

@Service
public interface EletrodomesticoAppService {
	
	EletrodomesticoResponseDTO criarEletrodomestico(EletrodomesticoPostDto dto);
}
