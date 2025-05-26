import java.util.Scanner;

class InvalidAgeException extends Exception{
    InvalidAgeException(){
        super();
    }
}
class CustomException20{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter age:");
        int a=sc.nextInt();
        if(a<18){
            try{
                throw new InvalidAgeException();
            }
            catch (InvalidAgeException e){
                System.out.println("Age is invalid");
            }}
            else {
                System.out.println("Age is valid");
            }

    }
}