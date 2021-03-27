package io.zipcoder;

import java.util.Scanner;

public class Console {


    public static String getStringInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        String userInput = scanner.nextLine();
        return userInput;
    }


    public Integer isInteger(String prompt){
        Integer result = 0;
        boolean check = true;
        do {
            String newString = getStringInput(prompt);
            try {
                result = Integer.parseInt(newString);
                check = false;
            } catch (NumberFormatException e) {
                System.out.println("Please enter valid amount!");
            }
        } while(check);
        return result;
    }





}
