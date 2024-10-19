package com.vw.core.handling.exception;

public class RecordNotFoundException extends  RuntimeException{

    public RecordNotFoundException(String message) {
        super(message);
    }
}
