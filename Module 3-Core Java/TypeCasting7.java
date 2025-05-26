public class TypeCasting7 {
    public static void main(String[] args) {
        double doub=9.75;
        System.out.println("Original double value: "+doub);
        int Int=(int) doub;
        System.out.println("After casting to int: "+Int);
        doub=(double) Int;
        System.out.println("After casting again to double: "+doub);
    }
}
