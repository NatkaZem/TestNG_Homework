import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Test_1 {

    @Test
    public void test_1() {
        System.out.println("Test");
    }

    @BeforeSuite
    public void test_2() {
        System.out.println("BeforeSuite");
    }

    @BeforeClass
    public void test_3() {
        System.out.println("BeforeClass");
    }

    @AfterMethod
    public void test_4() {
        System.out.println("AfterMethod");
    }
}



