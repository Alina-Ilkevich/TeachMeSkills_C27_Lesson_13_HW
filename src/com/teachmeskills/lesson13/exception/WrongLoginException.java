package com.teachmeskills.lesson13.exception;

/**
 * This class creates an exception for the case when the user enters an incorrect login
 */
public class WrongLoginException extends Exception{
    private int wrongLoginExceptionCode;
    public WrongLoginException(String message, int wrongLoginExceptionCode) {
        super(message);
        this.wrongLoginExceptionCode = wrongLoginExceptionCode;
    }
}
