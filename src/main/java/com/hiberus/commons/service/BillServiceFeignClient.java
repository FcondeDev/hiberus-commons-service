package com.hiberus.commons.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.hiberus.commons.dto.BillResponseDTO;
import com.hiberus.commons.dto.JsonDTO;
import com.hiberus.commons.dto.ProductDTO;

public interface BillServiceFeignClient {

	@PostMapping("bills")
	public ResponseEntity<JsonDTO<BillResponseDTO>> store(@RequestBody List<ProductDTO> products);
}
