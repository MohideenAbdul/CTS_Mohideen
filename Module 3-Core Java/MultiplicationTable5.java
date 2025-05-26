import java.util.Scanner;
public class MultiplicationTable5 {
    public static void main(String args[]){
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        a=sc.nextInt();
        for(int i=1;i<11;i++) System.out.println(a+"x"+i+"="+(a*i));
    }
}