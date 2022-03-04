package org.peak.common.token;

public class AuthorizeException extends RuntimeException {

    public AuthorizeException(String errorCode) {
        super(errorCode);
    }
}
