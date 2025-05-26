class T1 extends Thread{
    public void run(){
    for (int i=0;i<10;i++){
        System.out.println("Thread 1 is running");
    }}
}
class T2 extends Thread{
    public void run(){
        for (int i=0;i<10;i++){
        System.out.println("Thread 2 is running");
    }}
}
class ThreadCreation26{
    public static void main(String args[]){
       T1 t1=new T1();
       T2 t2=new T2();
       t1.start();
       t2.start();
    }
}