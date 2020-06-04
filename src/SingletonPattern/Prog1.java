package SingletonPattern;

public class Prog1 {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingletonInstance();
//        Singleton singleton1 = Singleton.getSingletonInstance();
        Thread t1 = new Thread(()->{
            Singleton singleton1 = Singleton.getSingletonInstance();
            while (true){
                if (singleton == singleton1){
                    System.out.println(singleton1.myId);
                    singleton1.doSomething();
                }
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        singleton.doSomething();
    }
}
