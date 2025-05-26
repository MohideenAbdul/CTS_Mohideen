import java.util.Scanner;
public class LeapYearChecker4 {
    public static void main(String args[]){
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a year:");
        a=sc.nextInt();
        while(true){
            System.out.print("Enter a year:");
            a=sc.nextInt();
        if((((a%4)==0)&&((a%100)!=0))||((a%400)==0)) System.out.println(a+" is leap year");
        else System.out.println(a+" is not a leap year");
    }}
}