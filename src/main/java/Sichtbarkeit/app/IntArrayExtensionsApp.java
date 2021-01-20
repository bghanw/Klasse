package Sichtbarkeit.app;

import Sichtbarkeit.common.IntArrayExtensions;

import java.util.Arrays;

public class IntArrayExtensionsApp {

    public static void main(String[] args) {
        int[] tenRandomNumber = IntArrayExtensions.getRandomNumbersInRange(10, 0, 9);
        System.out.println("Zufällige Zahlen: " + Arrays.toString(tenRandomNumber));
        System.out.println("Kleinster Wert: " + IntArrayExtensions.getMin(tenRandomNumber));
        System.out.println("Grösster Wert: " + IntArrayExtensions.getMax(tenRandomNumber));
        System.out.println("Durchschnitt: " + IntArrayExtensions.getAverage(tenRandomNumber));
        System.out.println("rückwärts: " + Arrays.toString(IntArrayExtensions.reverse(tenRandomNumber)));
        System.out.println("sortiert: " + Arrays.toString(IntArrayExtensions.sort(tenRandomNumber)));
        System.out.println("sortiert und rückwärts: " + Arrays.toString(IntArrayExtensions.reverse(IntArrayExtensions.sort(tenRandomNumber))));
        System.out.println("sortiert und wieder gemischt: " + Arrays.toString(IntArrayExtensions.mix(IntArrayExtensions.sort(tenRandomNumber))));
    }
}
