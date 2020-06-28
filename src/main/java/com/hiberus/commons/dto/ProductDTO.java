package com.hiberus.commons.dto;

import java.io.Serializable;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonInclude;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
public class ProductDTO implements Serializable {
	private static final long serialVersionUID = 893056867092523645L;
	@ApiModelProperty(notes = "The product id", example = "1")
	private Long id;
	@NotNull
	@Min(value = 1)
	@ApiModelProperty(notes = "The total number of products", example = "4")
	private Integer quantity;
	@NotNull
	@Min(value = 1)
	@ApiModelProperty(notes = "The cost of the product", example = "10000")
	private Double cost;

}
