package com.vw.core.handling.handler;

import com.vw.core.handling.constants.HttpStatusCodeConstants;
import com.vw.core.handling.dto.ResponseDto;
import com.vw.core.handling.exception.RecordNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class EcommerceExceptionHandler {

    public ResponseEntity<ResponseDto> handleRecordNotFoundException(RecordNotFoundException exception){
        return new ResponseEntity<>(new ResponseDto(HttpStatusCodeConstants.NOT_FOUND, null, exception.getMessage()), HttpStatus.NOT_FOUND);
    }
}
