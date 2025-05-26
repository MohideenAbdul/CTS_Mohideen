public class PatternMatching{
    public static void main(String args[]){
        testObject(85);
        testObject(39.994);
        testObject("java");
        testObject(null);
    }
    public static void testObject(Object obj){
        switch(obj){
            case Integer i -> System.out.println("It is an Integer Object : " + i);
            case Double d -> System.out.println("It is a Double Object : " + d);
            case String s -> System.out.println("It is a String Object : " + s);
            case null -> System.out.println("It is null");
            default -> System.out.println("Unknown Object : " + obj);
        }
    }
}
