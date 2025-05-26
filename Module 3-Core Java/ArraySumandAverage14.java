import java.util.Scanner;

class ArraySumandAverage14{
    public static void main(String args[]){
        int n,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array size:");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements:-");
        for(int i=0;i<n;i++){arr[i]=sc.nextInt(); sum+=arr[i];}
        System.out.println("Sum="+sum+" and Average="+(float)sum/n);
    }
}