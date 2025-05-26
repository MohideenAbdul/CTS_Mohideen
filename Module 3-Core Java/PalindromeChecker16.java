import java.util.Scanner;
class PalindromeChecker16{
    public static void main(String args[]){
        String str;
        char temp;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string:");
        str=sc.nextLine();
        int i,n=str.length()-1;
        char[] strarr=str.toCharArray();
        for (i=0;i<=(n/2);i++){
            temp=strarr[i];
            strarr[i]=strarr[n-i];
            strarr[n-i]=temp;
        }
        String rstr=new String(strarr);
        if(str.equals(rstr)) System.out.println("It is a palindrome");
        else System.out.println("It is not a palindrome");
    }
}