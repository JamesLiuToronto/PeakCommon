package org.peak.common.token;

public class TokenExpiredException extends Exception{

    static String MESSAGE = "Token has been expired !" ;
    public TokenExpiredException(String errorMessage) {
        super(errorMessage);
    }
}
