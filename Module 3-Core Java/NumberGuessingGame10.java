import java.util.Scanner;
import java.util.Random;
public class NumberGuessingGame10 {
    public static void main(String args[]){
        int a;
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        int r1=r.nextInt(100);
        while(true) {
            System.out.print("Guess the number(0-100):");
            a = sc.nextInt();
            if (r1<a) System.out.println("Guess lower");
            else if (r1>a) System.out.println("Guess higher");
            else{
                System.out.println("You guessed it!");
                break;
            }
        }
    }
}