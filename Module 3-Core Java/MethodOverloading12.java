class MethodOverloading12{
    static int add(int a,int b){
        return a+b;
    }
    static double add(double a,double b){
        return a+b;
    }
    static int add(int a,int b, int c){
        return a+b+c;
    }
    public static void main(String args[]){
        System.out.println("add with 2 integers,2 & 3 : "+add(2,3));
        System.out.println("add with 2 doubles, 2.0 & 3.0 : "+add(2.0,3.0));
        System.out.println("add with 3 integers, 2,3 & 4 : "+add(2,3,4));
    }
}