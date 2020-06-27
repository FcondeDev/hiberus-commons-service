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
public class BillResponseDTO implements Serializable {
	private static final long serialVersionUID = 5847780836634590163L;
	private Long billId;
	private Double totalPaymentAmount;
	@JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss", timezone = "America/Bogota")
	private Date paymentDeadline;
	private Integer totalProductsNumber;

}
