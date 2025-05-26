class Car{
    String make,model;
    int year;
    Car (String ma,String mo,int y){
        make=ma;model=mo;year=y;
    }
    void displayDetails(){
        System.out.println("Details:"+make+","+model+","+year);
    }
}
class ClassandObjectCreation17{
    public static void main(String args[]){
        Car c=new Car("German","i20",2025);
        c.displayDetails();
    }
}