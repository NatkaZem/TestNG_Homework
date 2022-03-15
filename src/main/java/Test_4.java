import org.testng.annotations.*;

public class Test_4 {

    @BeforeTest
    public void test_14() {
        System.out.println("BeforeTest");
    }

    @Test
    public void test_15() {
        System.out.println("Test");
    }

    @AfterSuite
    public void test_16() {
        System.out.println("AfterSuite");
    }

    @AfterMethod
    public void test_17() {
        System.out.println("AfterMethod");
    }


    @AfterTest
    public void test_18() {
        System.out.println("AfterTest");
    }
}
