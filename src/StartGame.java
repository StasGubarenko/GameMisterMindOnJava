public class StartGame {
    public static void main(String[] args) {

        Codemaker codemaker = new Codemaker();
        codemaker.run();

        Codebreaker codebreaker = new Codebreaker();
        codebreaker.run();

        Checker checker = new Checker();
        checker.run();

    }
}
