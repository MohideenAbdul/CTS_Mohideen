import java.util.Scanner;
public class FactorialCalculator11 {
    public static void main(String args[]){
        while(true){int a,fact=1;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a positive number:");
        a=sc.nextInt();
        for(int i=1;i<=a;i++) fact*=i;
        System.out.println(a+"! = "+fact);
    }}
}