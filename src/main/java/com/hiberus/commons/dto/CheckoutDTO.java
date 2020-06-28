package com.hiberus.commons.dto;

import java.io.Serializable;
import java.util.List;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonInclude;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
public class CheckoutDTO implements Serializable {
	private static final long serialVersionUID = -8540426382876912020L;
	@NotNull
	@ApiModelProperty(notes = "The client id", example = "1")
	private Long clientId;
	@NotNull
	@ApiModelProperty(notes = "The paymentMethod", example = "1")
	private Long paymentMethod;
	@ApiModelProperty(notes = "The coupon to be applied", example = "HAPPYDISCOUNT")
	private String coupon;
	@ApiModelProperty(notes = "The list of products to be purchased")
	private List<ProductDTO> products;

}
