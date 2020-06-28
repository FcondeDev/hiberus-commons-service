package com.hiberus.commons.dto;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
public class CheckoutResponseDTO implements Serializable {
	private static final long serialVersionUID = 8746214173641048466L;
	@ApiModelProperty(notes = "The client name")
	private String name;
	@ApiModelProperty(notes = "The client id")
	private String identification;
	@ApiModelProperty(notes = "The bill id")
	private Long billId;
	@ApiModelProperty(notes = "The total amount which the client paid.")
	private Double totalPaid;
	@ApiModelProperty(notes = "The client payment method.")
	private String paymentMethod;
	@ApiModelProperty(notes = "The client payment method.")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "America/Bogota")
	private Date paymentDate;
	@ApiModelProperty(notes = "The quantity of products that the client bought.")
	private Integer totalProductsNumber;
	@ApiModelProperty(notes = "The date in which the products will be delivered.")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "America/Bogota")
	private Date deliveryDate;
	@ApiModelProperty(notes = "The address where the products will be delivered.")
	private String deliveryAddress;
	@ApiModelProperty(notes = "The id of the delivery in order to follow the delivery.")
	private Long deliveryId;
	@ApiModelProperty(notes = "rue if the provided coupon was valid and it was applied to the totalPaid.")
	private boolean couponWasApplied;

}
