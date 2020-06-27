package com.hiberus.commons.error;

public enum ErrorEnum {

	NOT_FOUND_EXCEPTION(1, "Not Found", "The resource : %s cannot be found"),
	INVALID_PARAMETER(2, "Invalid Param",
			"Any of the input parameters does not accomplish with the requirements or was not sent"),
	DEFAULT_EXCEPTION(3, "Error", "Try later or contact your administrator"),
	FEIGN_EXCEPTION(4, "Error getting resource", "There was a error trying to connect another service"),
	INVALID_PAYMENT_METHOD(5, "Invalid Payment Method", "The input payment method is not supported");

	public final int code;
	public final String title;
	public final String description;

	ErrorEnum(int code, String title, String description) {
		this.code = code;
		this.title = title;
		this.description = description;
	}

}
