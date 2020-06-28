package com.hiberus.commons.dto;

import java.io.Serializable;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonInclude;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
public class LogisticDTO implements Serializable {
	private static final long serialVersionUID = 1899754747980842423L;
	@NotNull
	@NotBlank
	@ApiModelProperty(notes = "The client address", example = "Street 1 # 2")
	private String address;
	@NotNull
	@Min(value = 1)
	@ApiModelProperty(notes = "The total number of products to deliver ", example = "10")
	private Integer totalNumberProducts;

}
