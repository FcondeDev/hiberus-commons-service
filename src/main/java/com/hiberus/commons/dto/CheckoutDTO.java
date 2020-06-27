package com.hiberus.commons.dto;

import java.io.Serializable;
import java.util.List;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
public class CheckoutDTO implements Serializable {
	private static final long serialVersionUID = -8540426382876912020L;
	@NotNull
	private Long clientId;
	@NotNull
	private Long paymentMethod;
	private String coupon;
	private List<ProductDTO> products;

}
