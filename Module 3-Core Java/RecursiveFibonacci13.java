import java.util.Scanner;
class RecursiveFibonacci13{
     static int fibonacci(int a){
        int f;
        if(a==1) f=0;
        else if(a==2) f=1;
        else return (fibonacci(a-1)+fibonacci(a-2));
        return f;
     }
    public static void main(String args[]){
         int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        n=sc.nextInt();
        System.out.println("FIbonacci number of "+n+" is "+fibonacci(n));
    }
}