package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.ZonedDateTime;

@ControllerAdvice
public class ApiExceptionHandler {

    @ExceptionHandler(value = ApiRequestException.class)
    public ResponseEntity<Object> handleApiRequestException(
            ApiRequestException e
    ) {
        HttpStatus httpStatus = HttpStatus.BAD_REQUEST;

        return getObjectResponseEntity(e, httpStatus);
    }

    @ExceptionHandler(value = NotFoundException.class)
    public ResponseEntity<Object> handleApiRequestException(
            NotFoundException e
    ) {
        HttpStatus httpStatus = HttpStatus.NOT_FOUND;

        return getObjectResponseEntity(e, httpStatus);
    }

    private ResponseEntity<Object> getObjectResponseEntity(RuntimeException e, HttpStatus httpStatus) {
        ApiException apiException = new ApiException(
                e.getMessage(),
                e,
                httpStatus,
                ZonedDateTime.now()
        );

        return new ResponseEntity<>(
                apiException,
                httpStatus);
    }
}
