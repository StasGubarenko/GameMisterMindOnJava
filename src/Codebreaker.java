import java.util.Scanner;

public class Codebreaker implements Runnable {
    @Override
    public void run() {

        Codebreaker codebreaker = new Codebreaker();
        codebreaker.writeAssumedWord();
    }

    private void writeAssumedWord(){
        System.out.println("Codebreaker, input any sequence of letters consisting of " + Codemaker.getCountOfLetters());

        Scanner input = new Scanner(System.in);

        boolean flag = true;

        while (flag){
            String inputCodebreaker = input.next();
            int size = inputCodebreaker.length();

            if(size == Codemaker.getCountOfLetters()){
                Letters.setAssumeLetters(inputCodebreaker);
                flag = false;
            }
            if(size != Codemaker.getCountOfLetters()) {
                System.out.println("You were mistaken. You should input letters consisting of " + Codemaker.getCountOfLetters() + ", yours is " + size);
            }
        }
    }
}

