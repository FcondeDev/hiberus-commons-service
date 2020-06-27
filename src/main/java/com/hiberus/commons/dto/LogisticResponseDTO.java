package com.hiberus.commons.dto;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
public class LogisticResponseDTO implements Serializable {
	private static final long serialVersionUID = 5858042856885950151L;
	@JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss", timezone = "America/Bogota")
	private Date deliveryDate;
	private String address;
	private Long deliveryId;

}
