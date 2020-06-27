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
public class CheckoutResponseDTO implements Serializable {
	private static final long serialVersionUID = 8746214173641048466L;
	private String name;
	private String identification;
	private Long billId;
	private Double totalPaid;
	private String paymentMethod;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "America/Bogota")
	private Date paymentDate;
	private Integer totalProductsNumber;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "America/Bogota")
	private Date deliveryDate;
	private String deliveryAddress;
	private Long deliveryId;	
	private boolean couponWasApplied;

}
