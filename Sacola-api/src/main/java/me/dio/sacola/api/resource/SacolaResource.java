package me.dio.sacola.api.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import me.dio.sacola.api.model.Item;
import me.dio.sacola.api.service.SacolaService;

@RestController
@RequestMapping("/ifood-devweek/sacolas")
public class SacolaResource {
	
	@Autowired
	private SacolaService sacolaService;
	
	@PostMapping
	public Item incluirItemNaSacola(@RequestBody ItemDto itemDto) {
		
		return sacolaService.incluirItemNaSacola(itemDto);
		
	}

}
