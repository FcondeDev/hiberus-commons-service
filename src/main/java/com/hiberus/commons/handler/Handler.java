package com.hiberus.commons.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.hiberus.commons.dto.ApiErrorDTO;
import com.hiberus.commons.error.ErrorEnum;
import com.hiberus.commons.exception.CustomException;
import com.hiberus.commons.exception.NotFoundException;

import feign.FeignException;
import lombok.extern.java.Log;

@RestControllerAdvice
@Log
public class Handler {

	@ResponseBody
	@ExceptionHandler(value = MethodArgumentNotValidException.class)
	public ResponseEntity<ApiErrorDTO> handleException(MethodArgumentNotValidException exception) {

		for (FieldError fieldError : exception.getBindingResult().getFieldErrors()) {

			log.info(String.format("--- EL PARAMETRO NO CUMPLE CON LOS REQUITOS : %s ---", fieldError.getField()));

		}
		return new ResponseEntity<>(new ApiErrorDTO(ErrorEnum.INVALID_PARAMETER.code, ErrorEnum.INVALID_PARAMETER.title,
				ErrorEnum.INVALID_PARAMETER.description), HttpStatus.BAD_REQUEST);
	}

	@ResponseBody
	@ExceptionHandler(value = CustomException.class)
	public ResponseEntity<ApiErrorDTO> handleException(CustomException exception) {
		log.info(String.format("--- OCURRIO ALGO INESPERADO  : %s ---", exception.getMessage()));
		return new ResponseEntity<>(new ApiErrorDTO(exception.getErrorEnum().code, exception.getErrorEnum().title,
				exception.getErrorEnum().description), HttpStatus.BAD_REQUEST);
	}

	@ResponseBody
	@ExceptionHandler(value = NotFoundException.class)
	public ResponseEntity<ApiErrorDTO> handleException(NotFoundException exception) {
		log.info(String.format("--- EL RECURSO NO PUDO SER ENCONTRADO : %s ---", exception.getResourceNotFound()));
		return new ResponseEntity<>(
				new ApiErrorDTO(ErrorEnum.NOT_FOUND_EXCEPTION.code, ErrorEnum.NOT_FOUND_EXCEPTION.title,
						String.format(ErrorEnum.NOT_FOUND_EXCEPTION.description, exception.getResourceNotFound())),
				HttpStatus.NOT_FOUND);
	}

	@ResponseBody
	@ExceptionHandler(value = Exception.class)
	public ResponseEntity<ApiErrorDTO> handleException(Exception exception) {
		log.info(String.format("--- ERROR NO CONTROLADO : %s ---", exception.getMessage()));
		return new ResponseEntity<>(new ApiErrorDTO(ErrorEnum.DEFAULT_EXCEPTION.code, ErrorEnum.DEFAULT_EXCEPTION.title,
				ErrorEnum.DEFAULT_EXCEPTION.description), HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ResponseBody
	@ExceptionHandler(value = FeignException.class)
	public ResponseEntity<ApiErrorDTO> handleException(FeignException exception) {
		log.info(String.format("--- HUBO UN ERROR EN LA PETICION A TRAVES DEL FEIGN : %s ---", exception.getMessage()));
		return new ResponseEntity<>(new ApiErrorDTO(ErrorEnum.FEIGN_EXCEPTION.code, ErrorEnum.FEIGN_EXCEPTION.title,
				ErrorEnum.FEIGN_EXCEPTION.description), HttpStatus.SERVICE_UNAVAILABLE);
	}

}
