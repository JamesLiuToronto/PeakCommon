package org.peak.common.myvalidation.exception;

public class TooManyCallsException extends RuntimeException {

    public TooManyCallsException(String errorCode) {
        super(errorCode);
    }
}
