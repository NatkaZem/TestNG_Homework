import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class Test_2 {

    @DataProvider(name = "testDataProvider")
    public static Object[][] dataProviderMethod() {
        return new Object[][]{
                {"1 2"}};
    }

    @DataProvider(name = "testDataProvider_1")
    public static Object[][] dataProviderMethod_1() {
        return new Object[][]{
                {"three four"},
                {"true false"}};
    }

    @Test(dataProvider = "testDataProvider")
    public void testMethod(Object O1) {
        System.out.println("Test");
        System.out.println("Test data: " + O1);
    }

    @Test(dataProvider = "testDataProvider_1")
    public void testMethod_1(Object O1) {
        System.out.println("Test");
        System.out.println("Test data: " + O1);

    }

    @AfterMethod()
    public void test_5() {
        System.out.println("AfterMethod");
    }

    @AfterMethod()
    public void test_6(Method m) {
        if ("testMethod".equals(m.getName())) {
            System.out.println("AfterMethod");
        }
    }
}
