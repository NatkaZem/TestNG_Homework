import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Test_2 {

    @Test(priority = 1)
    public void test_5() {
        System.out.println("Test");
        System.out.println("Test data:1 2");
        Assert.assertTrue(true);
        System.out.println("AfterMethod");
    }


    @AfterMethod
    public void test_6() {
        System.out.println("AfterMethod");
    }

    @Test(priority = 2)
    public void test_7() {
        System.out.println("Test");
        System.out.println("Test data: three four");
    }

    @Test(priority = 3)
    public void test_8() {
        System.out.println("Test");
        System.out.println("Test data: true false");
    }
}
