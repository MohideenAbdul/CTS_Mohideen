interface Playable{
    void play();
}
class Guitar implements Playable{
    public void play() {
        System.out.println("Strings");
    }
}
class Piano implements Playable{
    public void play() {
        System.out.println("Keys");
    }
}
public class InterfaceImplementation19{
    public static void main(String args[]){
        Guitar g=new Guitar();
        Piano p=new Piano();
        g.play();
        p.play();
    }
}