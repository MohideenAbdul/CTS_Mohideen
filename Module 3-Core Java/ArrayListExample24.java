import java.util.ArrayList;
import java.util.Scanner;

class ArrayListExample24{
    public static void main(String args[]){
        ArrayList<String> names=new ArrayList<String>();
        Scanner sc=new Scanner(System.in);
        String name,c;
        while (true){
            System.out.print("Enter name:");
            name=sc.nextLine();
            names.add(name);

            System.out.print("Another name(y/n):");
            c=sc.nextLine();
            if(c.charAt(0)=='y') continue;
            else if (c.charAt(0)=='n') break;
            else {
                System.out.println("Wrong decision entered");
                System.exit(0);
            }
        }
        System.out.print("The names entered:");
        for (String i: names) System.out.print(i+",");
    }
}