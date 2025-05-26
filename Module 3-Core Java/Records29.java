import java.util.*;
import java.util.stream.Collectors;
public class Records {
    public record Person(String name, int age){

    }
    public static void main(String args[]){
        Person p1 = new Person("xxx", 19);
        Person p2 = new Person("yyy",24);
        Person p3 = new Person("zzz",12);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        List<Person> person = List.of(p1,p2,p3);
        List<Person> adults = person.stream()
                                    .filter(p -> p.age >=18)
                                    .collect(Collectors.toList());
        System.out.println(adults);
    }
}
