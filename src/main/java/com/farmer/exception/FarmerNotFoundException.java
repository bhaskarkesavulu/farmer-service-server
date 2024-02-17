package com.farmer.exception;

import java.io.Serial;

public class FarmerNotFoundException extends RuntimeException{

    @Serial
    private static final long serialVersionUID = 1L;

    public FarmerNotFoundException() {
        super();
    }

    public FarmerNotFoundException(String customMessage) {
        super(customMessage);
    }
}
