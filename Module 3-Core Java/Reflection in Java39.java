import java.lang.reflect.*;

public class ReflectionDemo {
    public void sayHello() {
        System.out.println("Hello via reflection");
    }

    public static void main(String[] args) throws Exception {
        Class<?> cls = Class.forName("ReflectionDemo");
        Object obj = cls.getDeclaredConstructor().newInstance();
        Method[] methods = cls.getDeclaredMethods();
        for (Method m : methods) {
            System.out.println("Method: " + m.getName());
        }
        Method sayHello = cls.getMethod("sayHello");
        sayHello.invoke(obj);
    }
}
