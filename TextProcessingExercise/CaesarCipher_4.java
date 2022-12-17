package TextProcessingExercise;

import java.util.Scanner;

public class CaesarCipher_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        StringBuilder encryptedText = new StringBuilder();

        for (char symbol : text.toCharArray()) {
            char encryptSymbol = (char)(symbol + 3);
            encryptedText.append(encryptSymbol);
        }

        System.out.println(encryptedText);
    }
}

//public class CaesarCipher_4 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String text = scanner.nextLine(); //първоначалния текст: "Programming is cool!"
//
//        for (char symbol : text.toCharArray()) {
//            System.out.print((char)(symbol + 3));
//        }
//    }
//}