package com.teachmeskills.lesson13.service;

import com.teachmeskills.lesson13.validator.CheckingInputData;
import com.teachmeskills.lesson13.exception.WrongLoginException;
import com.teachmeskills.lesson13.exception.WrongPasswordException;

/**
 * This class contains a method for verifying the correctness of the input data for user registration
 */
public class UserRegistrationService {
    public static void registerUser(String login, String password, String confirmPassword){
        try {
            CheckingInputData.checkInputData(login, password, confirmPassword);
        } catch (WrongLoginException|WrongPasswordException e){
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println("Another error");
        }
        try {
            if (CheckingInputData.checkInputData(login, password, confirmPassword)) {
                System.out.println("The user has been successfully registered!");
            }
        } catch (WrongLoginException|WrongPasswordException e){
        }
    }
}
