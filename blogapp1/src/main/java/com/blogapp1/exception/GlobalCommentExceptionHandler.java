package com.blogapp1.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalCommentExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(CommentResourceNotFound.class)
    public ResponseEntity<String> handleCommentResourceNotFoundException(
            CommentResourceNotFound m
    ){
        return new ResponseEntity<>(m.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
