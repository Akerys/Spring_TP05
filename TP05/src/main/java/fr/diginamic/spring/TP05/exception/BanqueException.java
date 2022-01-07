package fr.diginamic.spring.TP05.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class BanqueException {

	@ExceptionHandler(value = {BanqueNotFoundException.class})
	public ResponseEntity<String> onClientNotFound(BanqueNotFoundException exception)
	{
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("compte non trouvée : "+exception.getMessage());
	}
}
