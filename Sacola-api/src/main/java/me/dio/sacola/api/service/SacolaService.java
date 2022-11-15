package me.dio.sacola.api.service;

import me.dio.sacola.api.model.Item;
import me.dio.sacola.api.model.Sacola;
import me.dio.sacola.api.resource.ItemDto;

public interface SacolaService {
	
	Item incluirItemNaSacola(ItemDto itemDto);
	Sacola verSacola(Long id);
	Sacola fecharSacola(Long id, int formaPagamento);
}
