import org.testng.annotations.*;

import java.lang.reflect.Method;

public class Test_3 {

    @BeforeClass
    public void test_7() {
        System.out.println("BeforeClass");
    }

    @Test(invocationCount = 2, priority = 1)
    public void test_8() {
        System.out.println("Test");
    }

    @Test(dataProvider = "testDataProvider", dataProviderClass = Test_2.class, priority = 2)
    public void testMethod(Object O1) {
        System.out.println("Test");
        System.out.println("Test data: " + O1);
    }

    @Test(dataProvider = "testDataProvider_1", dataProviderClass = Test_2.class, priority = 3)
    public void testMethod_1(Object O1) {
        System.out.println("Test");
        System.out.println("Test data: " + O1);
    }

    @AfterMethod
    public void test_9(Method m) {
        if ("testMethod".equals(m.getName())) {
            System.out.println("AfterMethod");
        }
    }

    @AfterTest
    public void test_10() {
        System.out.println("AfterTest");
    }

    @AfterClass
    public void test_11() {
        System.out.println("AfterClass");
    }

    @AfterClass
    public void test_12() {
        System.out.println("AfterClass");
    }
}
