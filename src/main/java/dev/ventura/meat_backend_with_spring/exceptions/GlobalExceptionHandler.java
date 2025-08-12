package dev.ventura.meat_backend_with_spring.exceptions;

import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

  // @ExceptionHandler(NotFoundResourceException.class)
  // public ResponseEntity<Object>
  // hendleNotFoundResource(NotFoundResourceException ex) {
  // Map<String, Object> body = new LinkedHashMap<>();
  // body.put("timestamp", LocalDateTime.now());
  // }
}
