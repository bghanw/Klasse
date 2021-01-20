package Sichtbarkeit;

import Sichtbarkeit.OtherClass.OtherClass;

public class SomeClass {
    public static void main(String[] args) {
        OtherClass.say();
        OtherClass.text = "Hallo";
        OtherClass.say();
        OtherClass.say();
    }
}

/***** OR without import *****/

/*
public class SomeClass {
    public static void main(String[] args) {
        Sichtbarkeit.OtherClass.OtherClass.say();
        Sichtbarkeit.OtherClass.OtherClass.text = "Hallo";
        Sichtbarkeit.OtherClass.OtherClass.say();
    }
}

*/
