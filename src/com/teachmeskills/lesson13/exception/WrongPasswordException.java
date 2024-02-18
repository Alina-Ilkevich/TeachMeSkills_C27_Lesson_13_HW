package com.teachmeskills.lesson13.exception;

/**
 * This class creates an exception for the case when the user enters an incorrect password
 */
public class WrongPasswordException extends Exception{
    private int wrongPasswordExceptionCode;

    public WrongPasswordException(String message, int wrongPasswordExceptionCode) {
        super(message);
        this.wrongPasswordExceptionCode = wrongPasswordExceptionCode;
    }
}
