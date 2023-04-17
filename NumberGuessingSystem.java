import java.util.*;

public class NumberGuessingSystem {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("A number is chosen between the range from 1 to 100 , guess a number within the 5 trails");
       int trails=5;
       int number = 1 + (int)(100* Math.random());
       int i, guessNumber;
       for(i=0;i<trails;i++)
       {
        System.out.println("Guess the number");
        guessNumber=sc.nextInt();
        if(number==guessNumber)
        {
            System.out.println("You guessed the number");
            break;
        }
        else if(number>guessNumber && i!=trails)
        {
            System.out.println("The number is greater"+ guessNumber);
        }
        else if(number<guessNumber && i!=trails)
        {
            System.out.println("The number is lesser"+ guessNumber);
        }
       }
       if(i==trails)
       {
        System.out.println("You have exhausted the trails");

        System.out.println("Number is "+ number);
       }
    }
}
