import java.util.Random;
import java.util.Scanner;

public class GuessInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println ("What is your name?");
        String name = input.nextLine();
        System.out.println("Nice to meet you "name" .");
    }


    double x = Math.random();
        int num = (int) (x * 10 + 1); // make sure that before you submit you change this DEA //
        Scanner guesser = new Scanner(System.in);
        System.out.println("Chose a random number from 1 -100.");
        int numguess = guesser.nextInt();
        int count = 0;

        while ( numguess != num)
        {
            if (numguess != num)
            {
                System.out.println("Pick again!");
                numguess = guesser.nextInt();
                count ++;
            }
        }
        System.out.println("Good job! You guessed correctly!");
        System.out.println("It took you " + count + " guesses.");
    }
}



