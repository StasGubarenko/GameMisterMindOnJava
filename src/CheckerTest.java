import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class CheckerTest {
    @DisplayName("Test 1")
    @Test
    public  void testOne(){
        Checker checker = new Checker();

        char[] a = {1,2,3,4};
        char[] b = {5,1,6,7};

        Assertions.assertEquals(1, checker.countMatchLetters(a,b));

    }

    @DisplayName("Test 2")
    @Test
    public  void testTwo(){
        Checker checker = new Checker();

        char[] a = {1,2,3,4};
        char[] b = {1,3,2,4};

        Assertions.assertEquals(4, checker.countMatchLetters(a,b));

    }
    @DisplayName("Test 3")
    @Test
    public  void testThree(){
        Checker checker = new Checker();

        char[] a = {1,2,3,4};
        char[] b = {1,1,1,1};

        Assertions.assertEquals(1, checker.countMatchLetters(a,b));

    }
    @DisplayName("Test 4")
    @Test
    public  void testFour(){
        Checker checker = new Checker();

        char[] a = {1,1,1,1};
        char[] b = {1,2,3,4};

        Assertions.assertEquals(1, checker.countMatchLetters(a,b));
    }

    @DisplayName("Test 5")
    @Test
    public  void testFive(){
        Checker checker = new Checker();

        char[] a = {1,1,2,2};
        char[] b = {2,2,1,1};

        Assertions.assertEquals(2, checker.countMatchLetters(a,b));
    }
}