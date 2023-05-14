import java.util.Scanner;

public class Codemaker implements Runnable {

    private static int countOfLetters;

    public static int getCountOfLetters() {
        return countOfLetters;
    }

    @Override
    public void run() {

        Codemaker codemaker = new Codemaker();
        codemaker.writeEncryptedWord();

    }

    private void writeEncryptedWord() {
        System.out.println("Codemaker, input any sequence of letters");

        Scanner input = new Scanner(System.in);

        String inputCodemaker = input.next();

        countOfLetters = inputCodemaker.length();

        Letters.setEncryptedLetters(inputCodemaker);

    }
}
