package com.hiberus.commons.service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.hiberus.commons.dto.ClientDTO;
import com.hiberus.commons.dto.JsonDTO;

public interface ClientServiceFeignClient {

	@GetMapping("clients/{id}")
	public ResponseEntity<JsonDTO<ClientDTO>> index(@PathVariable Long id);

}
