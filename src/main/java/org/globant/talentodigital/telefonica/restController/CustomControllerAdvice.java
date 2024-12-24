package org.globant.talentodigital.telefonica.restController;

import lombok.Builder;
import org.springframework.http.HttpStatus;
import org.springframework.jdbc.datasource.init.DataSourceInitializer;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.hibernate.TransientObjectException;
import org.springframework.dao.InvalidDataAccessApiUsageException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.servlet.resource.NoResourceFoundException;

import java.time.LocalDate;

@ControllerAdvice
@Builder
public class CustomControllerAdvice {

    @ExceptionHandler(NoResourceFoundException.class)
    public ResponseEntity<ExceptionMessage> handleResourceNotFoundException(NoResourceFoundException ex) {
        ExceptionMessage exceptionMessage = new ExceptionMessage();
        exceptionMessage.setStatusCode(ex.getStatusCode().value());
        exceptionMessage.setTimestamp(LocalDate.now());
        exceptionMessage.setMessage(ex.getMessage());

        return new ResponseEntity<>(exceptionMessage, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(TransientObjectException.class)
    public ResponseEntity<ExceptionMessage> handleTransientObjectException(TransientObjectException ex) {
        ExceptionMessage exceptionMessage = new ExceptionMessage();
        exceptionMessage.setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
        exceptionMessage.setTimestamp(LocalDate.now());
        exceptionMessage.setMessage(ex.getMessage());

        return new ResponseEntity<>(exceptionMessage, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(InvalidDataAccessApiUsageException.class)
    public ResponseEntity<ExceptionMessage> handleInvalidDataAccessApiUsageException(InvalidDataAccessApiUsageException ex) {
        ExceptionMessage exceptionMessage = new ExceptionMessage();
        exceptionMessage.setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
        exceptionMessage.setTimestamp(LocalDate.now());
        exceptionMessage.setMessage(ex.getMessage());

        return new ResponseEntity<>(exceptionMessage, HttpStatus.NOT_FOUND);
    }
}

