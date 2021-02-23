package calculatorApp_test;
import calculatorApp.Calculator;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CalculatorTest {
    @BeforeTest
    public void beforeTest(){
        System.out.println("Do something before running all the tests");
    }

    /**
     * Write some code to test add() from Calculator class
     * 1. 2 + 4 =6 --> Test Passed
     * 2. -2 + 3 = 1 -->
     * 3. 5 + 5 (10) we are going to compare with 11, if it is not same 10 != 11, test is passed .
     * */
    @Test
    public static void addTest(){
        Calculator calculator = new Calculator();
        int actualResult =  calculator.add(2,4);
        int expectedResult = 6;

        Assert.assertEquals(actualResult, expectedResult); // Test Passed
        System.out.println("Test Passed");
    }

    /**
     * Write some code to test deduct() from Calculator class
     *
     * */
    @Test
    public static void addNegativeTest(){
        Calculator calculator = new Calculator();
        int actualResult =  calculator.add(2,4);
        int expectedResult = 5;

        Assert.assertNotEquals(actualResult, expectedResult); // 6 != 5 true
        System.out.println("Test Passed");
    }

    /**
     * Write test cases for deduct()
     *
     * */

    @AfterTest
    public void afterTest(){
        System.out.println("Run some clean up activities");
    }
}
