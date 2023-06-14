package br.com.archtech.services;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import br.com.archtech.dtos.EletrodomesticoPostDto;
import br.com.archtech.dtos.EletrodomesticoResponseDTO;
import br.com.archtech.models.Eletrodomestico;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EletrodomesticoServiceImpl implements EletrodomesticoAppService{
	
	
	private final EletrodomesticoDomainService domainService;
	
	@Override
	public EletrodomesticoResponseDTO criarEletrodomestico(EletrodomesticoPostDto dto) {
		
		
		ModelMapper modelMapper= new ModelMapper();
		Eletrodomestico eletrodomestico= modelMapper.map(dto, Eletrodomestico.class);
		domainService.criarEletrodomestico(eletrodomestico);
		
		EletrodomesticoResponseDTO responseDTO 
		=modelMapper.map(eletrodomestico, EletrodomesticoResponseDTO.class);
		responseDTO.setMensagem("Eletrodomestico Cadastrado com Sucesso!");
		
		return responseDTO;
	}

}
