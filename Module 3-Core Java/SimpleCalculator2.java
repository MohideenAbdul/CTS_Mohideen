import java.util.Scanner;
public class SimpleCalculator2 {
    public static void main(String args[]){
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        a=sc.nextInt();
        System.out.print("Enter another number:");
        b=sc.nextInt();
        System.out.println("1.Add\n2.Subtract\n3.Multiply\n4.Divide");
        System.out.print("Enter your choice:");
        c=sc.nextInt();
        if(c==1) System.out.println(a+"+"+b+"="+(a+b));
        if(c==2) System.out.println(a+"-"+b+"="+(a-b));
        if(c==3) System.out.println(a+"*"+b+"="+(a*b));
        if(c==4) System.out.println(a+"/"+b+"="+(a/b));
    }
}