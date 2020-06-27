package com.hiberus.commons.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
public class ClientDTO implements Serializable {

	private static final long serialVersionUID = -5035061132342805404L;
	private Long id;
	private String firstName;
	private String lastName;
	private String address;
	private String identification;
}
