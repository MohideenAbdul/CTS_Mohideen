import java.util.Scanner;
class StringReversal15{
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
        str=new String(strarr);
        System.out.println("Reversed:"+str);
    }
}