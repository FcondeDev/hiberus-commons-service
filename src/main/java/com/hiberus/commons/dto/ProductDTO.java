package com.hiberus.commons.dto;

import java.io.Serializable;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
public class ProductDTO implements Serializable {
	private static final long serialVersionUID = 893056867092523645L;
	private Long id;
	@NotNull
	@Min(value = 1)
	private Integer quantity;
	@NotNull
	@Min(value = 1)
	private Double cost;

}
