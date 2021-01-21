package WhiteBoardAuftrag;

public class App {

    public static void main(String[] args) {

        Dog dog = new Dog("A");
        foo(dog);
        System.out.println(dog.getName());
    }

    private static void foo(Dog dog){
        dog.SetName("B");
        dog = new Dog("C");
    }
}
