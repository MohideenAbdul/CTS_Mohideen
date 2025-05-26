import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class HashMapExample25{
    public static void main(String args[]){
        HashMap<Integer,String> names=new HashMap<Integer,String>();
        Scanner sc=new Scanner(System.in);
        String name,c;
        int id;
        while (true){
            System.out.print("Enter ID:");
            id=sc.nextInt();
            sc.nextLine();
            System.out.print("Enter name:");
            name=sc.nextLine();
            names.put(id,name);

            System.out.print("Another name(y/n):");
            c=sc.nextLine();
            if(c.charAt(0)=='y') continue;
            else if (c.charAt(0)=='n') break;
            else {
                System.out.println("Wrong decision entered");
                System.exit(0);
            }
        }
        System.out.print("Search for id:");
        id= sc.nextInt();
        if(names.get(id)==null) System.out.println("No such ID present");
        else System.out.println("The name is "+names.get(id));
    }
}