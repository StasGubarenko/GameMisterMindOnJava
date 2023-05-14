import java.util.Arrays;
import java.util.LinkedList;

public class Checker implements Runnable {
    @Override
    public void run() {

        boolean switcher = true;

        while (switcher)
            if (compareTwoWords()) {
                System.out.println("Congratulations! You have guessed!");
                switcher = false;
            } else {
                inputResult();
                Codebreaker codebreaker = new Codebreaker();
                codebreaker.run();
            }

    }

    public void inputResult() {

        //Преобразуем String в char
        char[] convertedEncryptedLetters = Letters.getEncryptedLetters().toCharArray();
        char[] convertAssumeLetters = Letters.getAssumeLetters().toCharArray();

        System.out.println("The number of matching characters is " + countMatchLetters(convertedEncryptedLetters, convertAssumeLetters));
    }

    int countMatchLetters(char[] encryptedWord, char[] assumeWord) {
        //размер массива char
        int size = assumeWord.length;

        //количество совпадающих символов
        int countMatchLetter = 0;

        LinkedList<Character> linkedList = new LinkedList<>();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (encryptedWord[i] == assumeWord[j]) {

                    if (linkedList.size() == 0) {
                        linkedList.add(assumeWord[j]);
                        countMatchLetter++;
                        break;
                    }

                    if (linkedList.contains(assumeWord[j])) {
                        break;
                    }
                    linkedList.add(assumeWord[j]);
                    countMatchLetter++;
                }
            }
        }
        return countMatchLetter;
    }

    public boolean compareTwoWords() {

        char[] convertedEncryptedWord = Letters.getEncryptedLetters().toCharArray();
        char[] convertAssumeWord = Letters.getAssumeLetters().toCharArray();

        return Arrays.equals(convertedEncryptedWord, convertAssumeWord);
    }

}
