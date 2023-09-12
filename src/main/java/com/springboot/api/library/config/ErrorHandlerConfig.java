package com.springboot.api.library.config;

import com.springboot.api.library.exceptions.NoDataFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@Slf4j
@ControllerAdvice
public class ErrorHandlerConfig extends ResponseEntityExceptionHandler {

    @ExceptionHandler(NoDataFoundException.class)
    public ResponseEntity<?> noDataFoundException(NoDataFoundException e, WebRequest request){
        log.info(e.getMessage(), e);
        return new ResponseEntity<>( HttpStatus.NOT_FOUND);
    }


}
