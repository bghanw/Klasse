package Sichtbarkeit.common;

public class StringExtensions {

    public static void main(String[] args) {
        String text = "Hallo Welt!";
        System.out.println("reversed: " + reverse(text));

        String zahl = "12345";
        System.out.println(quersum(zahl)); // Quersumme
    }

    public static String reverse(String text) {
        char[] array = new char[text.length()];
        int z = 0;
        for (int i = text.length() - 1; i >= 0; i--) {
            array[z] = text.charAt(i);
            z++;
        }
        String revText = "";
        for (int j = 0; j <= text.length() - 1; j++) {
            revText = revText.concat(String.valueOf(array[j]));

        }
        return revText;
    }

    public static int quersum(String zahl) {
        int sum = 0;
        char ch;
        int n;

        for (int i = 0; i < zahl.length(); i++) {
            ch = zahl.charAt(i);
            if (Character.isDigit(ch)) {
                n = Character.getNumericValue(ch);
                sum += n;
            }

        }
        return sum;
    }
}