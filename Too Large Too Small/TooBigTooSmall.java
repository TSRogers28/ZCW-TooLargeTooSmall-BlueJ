
/**
 * Write a description of class TooBigTooSmall here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.*;
public class TooBigTooSmall
{
    int guess;
    int rand;

    /**
     * Constructor for objects of class TooBigTooSmall
     */
    public TooBigTooSmall(int scan){
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */

    public static void main(String[] args){
        Random rand = new Random();
        int randomNum = rand.nextInt((10)+1);
        int count = 0;
        int guessP =0;
        Scanner scan = new Scanner(System.in);
        while (count <= 10){
            System.out.println("Guess a number between 1 and 10");
            int guess = scan.nextInt();

            
            if(guess == randomNum){
                count ++;
                System.out.println("correct guess was on attempt # "+ count);
                break;
            }
            else if(guess > randomNum){
                if(guess != guessP){
                    count ++;
                }
                guessP = guess;
                System.out.println("too large");
            }
            else if (guess < randomNum){
                if(guess != guessP){
                    count ++;
                }
                guessP = guess;
                System.out.println("too small");
            }
        }
    }
}
