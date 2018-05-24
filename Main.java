/**
 * Created by iyasuwatts on 10/17/17.
 */
 import java.util.*;

public class TooBigTooSmall {
  int guess;
  int rand;
  int min;
  int max;


  public TooBigTooSmall(int scan){
    guess = scan;
    rand = 0;
    min = 1;
    max = 20;
  }
  public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Guess which number I am holding")
        int guess = scan.nextInt();
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min +1) + min);
        if(guess = randomNum){
          System.out.println("correct guess");
        }
        if(guess > randomNum){
          System.out.println("too large");
        }
        else (guess < randomNum){
          System.out.println("too small");
        }


    }
}
