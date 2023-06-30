package br.com.archtech.services;

import org.springframework.stereotype.Service;

import br.com.archtech.dtos.EletrodomesticoDto;
import br.com.archtech.dtos.EletrodomesticoResponseDto;

@Service
public interface EletrodomesticoAppService {
	EletrodomesticoResponseDto criarEletro(EletrodomesticoDto dto);
}
