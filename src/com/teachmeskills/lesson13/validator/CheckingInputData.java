package com.teachmeskills.lesson13.validator;

import com.teachmeskills.lesson13.consts.Consts;
import com.teachmeskills.lesson13.exception.WrongLoginException;
import com.teachmeskills.lesson13.exception.WrongPasswordException;

/**
 * This class contains a method for checking the correctness of the input data
 */
public class CheckingInputData {
    public static boolean checkInputData(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {
        if (login.length() > Consts.LOGIN_LENGTH){
            throw new WrongLoginException("The login must contain less than 20 characters", 100);
        }
        if (login.contains(" ")){
            throw new WrongLoginException("The login must not contain a space", 101);
        }
        if (password.length() > Consts.PASSWORD_LENGTH){
            throw new WrongPasswordException("The password must contain less than 20 characters", 200);
        }
        char[] chars = password.toCharArray();
        int count = 0;
        for (char a : chars){
            if (a == ' '){
                throw new WrongPasswordException("The password must not contain a space", 201);
            }
            if (Character.isDigit(a)){
                count++;
            }
        }
        if (count == 0){
            throw new WrongPasswordException("The password must contain at least one digit", 202);
        }
        if (!password.equals(confirmPassword)){
            throw new WrongPasswordException("Passwords must be the same",203);
        }
        return true;
    }
}
