package Klassen;

import java.util.Arrays;
import java.util.Random;

public class IntArrayExtensions {

    public static void main(String[] args) {
        int[] tenRandomNumber = getRandomNumbersInRange(10, 0, 9);
        System.out.println("Zufällige Zahlen: " + Arrays.toString(tenRandomNumber));
        System.out.println("Kleinster Wert: " + getMin(tenRandomNumber));
        System.out.println("Grösster Wert: " + getMax(tenRandomNumber));
        System.out.println("Durchschnitt: " + getAverage(tenRandomNumber));
        System.out.println("rückwärts: " + Arrays.toString(reverse(tenRandomNumber)));
        System.out.println("sortiert: " + Arrays.toString(sort(tenRandomNumber)));
        System.out.println("sortiert und rückwärts: " + Arrays.toString(reverse(sort(tenRandomNumber))));
        System.out.println("sortiert und wieder gemischt: " + Arrays.toString(mix(sort(tenRandomNumber))));
    }

    /**
     * Creates an array with random number.*/
    /* @param size The size of the array.
     * @param min The smallest possible generated number.
     * @param max The biggest possible generated number.
     * @return the generated int array.
     */
    static int[] getRandomNumbersInRange(int size, int min, int max){
        Random random = new Random();
        return random.ints(size, min, max).toArray();
    }

    static int getMax(int[] elements)
    {  // TODO
        int calc =0;
        for (int i = 0; i <= elements.length -1; i++){
            calc = Math.max(calc, elements[i]);
        }
        return calc;
    }
    static int getMin(int[] elements)
    {  // TODO
        int calc = 10;
        for (int i = 0; i <= elements.length -1; i++){
            calc = Math.min(calc, elements[i]);
        }
        return calc;
    }


    static double getAverage(int[] elements)
    { // TODO
        double total = 0;
        double avg = 0;
        for (int i = 0; i < elements.length; i++){
            total = total + elements[i];
        }
        avg = total/elements.length;
        return avg;
    }

    static int[] sort(int[] elements)
    { // TODO
        for (int i = 1; i < elements.length; i++) {
            for (int j = i; j > 0; j--) {
                if (elements[j] < elements [j - 1]) {
                    int temp = elements[j];
                    elements[j] = elements[j - 1];
                    elements[j - 1] = temp;
                }
            }
        }
        return elements;
    }

    static int[] reverse(int[] elements)
    { // TODD
        for (int i = 0; i < elements.length/2; i++){
            int temp = elements[i];
            elements[i] = elements[elements.length-i -1];
            elements[elements.length-i -1] = temp;
        }
       /*

       int[] arr = new int[elements.length];
        int j = 0;
        for(int i = elements.length-1; i >= 0; i--) {
            arr[j] = elements[i];
            j++;
        }
       *****OR****
       int last = elements.length-1;
        int middle = elements.length/2;

        for (int i = 0; i <= middle; i++ )
        {
            int temp = elements[i];
            elements[i] = elements[last - i];
            elements[last - i] = temp;

        } */

        return elements;
    }
    static int[] mix(int[] elements)
    { // TODO
        Random rand = new Random();
        int range = elements.length;
        for (int i = 0; i <= elements.length -1; i++)
        {
           elements[i] = rand.nextInt(range);
        }
        return elements;
    }
}