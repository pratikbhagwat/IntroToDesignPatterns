package SingletonPattern;

public class Singleton {
    private static Singleton singleton;
    public int myId = 0;
    private Singleton(){
    }

    public static synchronized Singleton getSingletonInstance(){
        if (singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
    public void doSomething(){
        while (true){
            myId+=1;
        }
    }
}
