package SingletonPattern;

public class Prog2 {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingletonInstance();
        System.out.println(singleton.myId);
    }
}
