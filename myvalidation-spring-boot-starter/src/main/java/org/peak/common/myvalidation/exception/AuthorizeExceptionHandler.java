package org.peak.common.myvalidation.exception;

import org.peak.common.myvalidation.errormessage.ErrorMessage;
import org.peak.common.token.AuthorizeException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.validation.ValidationException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestControllerAdvice
public class AuthorizeExceptionHandler {

    @Autowired
    ErrorMessage errorMessage ;


    @ExceptionHandler({AuthorizeException.class})
    @ResponseBody
    //public ResponseEntity<List> processUnmergeException(final MethodArgumentNotValidException ex) {
    public ResponseEntity<List> processUnmergeException(final AuthorizeException ex){

        String error = ErrorMessage.toLocale(ex.getMessage()) ;
        ex.printStackTrace() ;
        return new ResponseEntity<>((new ArrayList<String>(Arrays.asList(error))), HttpStatus.UNAUTHORIZED);
    }


}
