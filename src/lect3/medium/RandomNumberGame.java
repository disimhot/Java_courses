package lect3.medium;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGame {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(10000)+1;
        System.out.println(randomNumber);
        int guessNumber;

        do {
            Scanner myScanner = new Scanner(System.in);
                System.out.println("Попробуй угадать число от 1 до 10 000. Введи свой вариант ");
                guessNumber = myScanner.nextInt();

                if(guessNumber < randomNumber){
                    System.out.println("You're too low");
                }
                else if(guessNumber > randomNumber){
                    System.out.println("You're too high");
                }
                else
                System.out.println("Right!");
        } while (!(guessNumber == randomNumber));
    }
}

