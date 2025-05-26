class Animal{
    void makeSound(){
        System.out.println("Sounds");
    }
}
class Dog extends Animal{
    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}
class InheritanceExample18{
    public static void main(String args[]){
        Animal a=new Animal();
        Dog d=new Dog();
        a.makeSound();
        d.makeSound();
    }
}