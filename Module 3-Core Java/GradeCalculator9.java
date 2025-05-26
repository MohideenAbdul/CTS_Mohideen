import java.util.Scanner;

class GradeCalculator9{
    public static void main(String args[]){
        int a;
        while(true){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter mark:");
        a=sc.nextInt();
        if((a<101)&&(a>89)) System.out.println("A grade");
        else if((a<90)&&(a>79)) System.out.println("B grade");
        else if((a<80)&&(a>69)) System.out.println("C grade");
        else if((a<70)&&(a>59)) System.out.println("D grade");
        else if((a<60)&&(a>=0)) System.out.println("F grade");
        else System.out.println("It is not a valid mark");

    }}
}