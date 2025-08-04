package SingletonDesignPattern;

public class SingletonExample {
    private static SingletonExample instance;
    private SingletonExample() {
        System.out.println("Singleton Example!");
    }
    public static SingletonExample getInstance() {
        if(instance == null) {
            instance =  new SingletonExample();
        }
        return instance;
    }
}

class Main {
    public static void main(String[] args) {
        SingletonExample obj1 = SingletonExample.getInstance();
        SingletonExample obj2 = SingletonExample.getInstance();
        System.out.println(obj1 == obj2);
    }
}