import java.util.Scanner;

class TryCatchExample20 {
    public static void main(String args[]){
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        a=sc.nextInt();
        System.out.print("Enter another number:");
        b=sc.nextInt();
        try {
            int r = a / b;
            System.out.println("Answer="+r);
        } catch (Exception e) {
            System.out.println("Cannot divide by zero");
        }
    }
}