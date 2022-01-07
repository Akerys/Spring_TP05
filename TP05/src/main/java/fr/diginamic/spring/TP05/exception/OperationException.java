package fr.diginamic.spring.TP05.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class OperationException {

	@ExceptionHandler(value = {OperationNotFoundException.class})
	public ResponseEntity<String> onClientNotFound(OperationNotFoundException exception)
	{
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Opération non trouvé : "+exception.getMessage());
	}
}
