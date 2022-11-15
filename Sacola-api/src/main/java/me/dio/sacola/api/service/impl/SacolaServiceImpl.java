package me.dio.sacola.api.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.dio.sacola.api.model.Item;
import me.dio.sacola.api.model.Sacola;
import me.dio.sacola.api.repository.SacolaRepository;
import me.dio.sacola.api.resource.ItemDto;
import me.dio.sacola.api.service.SacolaService;

@Service
public class SacolaServiceImpl implements SacolaService {

	@Autowired
	private SacolaRepository sacolaRepository;
	
	@Override
	public Item incluirItemNaSacola(ItemDto itemDto) {

		return null;
	}

	@Override
	public Sacola verSacola(Long id) {

		return sacolaRepository.findById(id).orElseThrow(
				() ->  {
					throw new RuntimeException("Essa sacola não existe!");
				}
				);
	}

	@Override
	public Sacola fecharSacola(Long id, int formaPagamento) {

		return null;
	}

}
