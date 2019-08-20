package com.QA;


public class BlackJackGame {


    public static int blackJackGameTesting(int number1, int number2) {
// If both numbers are greater than 21 - end game
        if (number1 > 21 && number2 > 21) {
            return 0;
// if either number is less than 0 - end game
        } else if (number1 < 0 && number2 < 0) {
            return 0;
        }

        // Check which number is closer to 21
        int result1 = 21 - number1;
        int result2 = 21 - number2;

        if (result1 < result2) {
            if (number1 > 21) {
                return number2;
            }
            return number1;
        } else {
            if (number2 > 21) {
                return number1;
            }
            return number2;
        }
    }
}
