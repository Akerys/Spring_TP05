package fr.diginamic.spring.TP05.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ClientException {

	@ExceptionHandler(value = {ClientNotFoundException.class})
	public ResponseEntity<String> onClientNotFound(ClientNotFoundException exception)
	{
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("client non trouvé : "+exception.getMessage());
	}

}
