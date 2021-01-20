package Sichtbarkeit;

public class SomeClass {
    public static void main(String[] args) {
        OtherClass.say();
        OtherClass.text = "Hallo";
        OtherClass.say();
    }
}
