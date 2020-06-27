package com.hiberus.commons.dto;

import java.io.Serializable;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
public class LogisticDTO implements Serializable {
	private static final long serialVersionUID = 1899754747980842423L;
	@NotNull
	@NotBlank
	private String address;
	@NotNull
	@Min(value = 1)
	private Integer totalNumberProducts;

}
