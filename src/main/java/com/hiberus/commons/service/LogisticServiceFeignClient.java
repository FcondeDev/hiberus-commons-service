package com.hiberus.commons.service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.hiberus.commons.dto.JsonDTO;
import com.hiberus.commons.dto.LogisticDTO;
import com.hiberus.commons.dto.LogisticResponseDTO;

public interface LogisticServiceFeignClient {
	@PostMapping("logistics")
	public ResponseEntity<JsonDTO<LogisticResponseDTO>> store(@RequestBody LogisticDTO logisticDTO);
}
