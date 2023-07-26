package br.com.archtech.services;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.archtech.dtos.EletrodomesticoDto;
import br.com.archtech.dtos.EletrodomesticoResponseDto;
import br.com.archtech.entities.Eletrodomestico;

@Service
public class EletrodomesticoServiceImpl implements EletrodomesticoAppService{
	@Autowired
	EletrodomesticoDomainService domainService;


	@Override
	public EletrodomesticoResponseDto criarEletro(EletrodomesticoDto dto) {
		ModelMapper modelMapper= new ModelMapper();
		Eletrodomestico eletrodomestico= modelMapper.map(dto, Eletrodomestico.class);
		domainService.criarEletrodomestico(eletrodomestico);
		
		EletrodomesticoResponseDto responseDto=modelMapper.map(eletrodomestico, EletrodomesticoResponseDto.class);
		responseDto.setMensagem("Eletrodomestico Cadastrado com Sucesso!");
		
		
		return responseDto;
		
	}
}
