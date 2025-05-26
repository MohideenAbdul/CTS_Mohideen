import java.util.*;
public class LambdaExpression{
    public static void main(String args[]){
        List<String> list = Arrays.asList("JavaScript","Java","Mysql","HTML","CSS","Bootstrap");
        Collections.sort(list, (a,b) -> a.compareTo(b));
        for(String entries : list){
            System.out.println(entries);
        }
    }
}
