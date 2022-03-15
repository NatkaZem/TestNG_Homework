import org.testng.annotations.*;

public class Test_3 {

    @BeforeClass
    public void test_9() {
        System.out.println("BeforeClass");
    }

    @Test
    public void test_10() {
        System.out.println("Test");
        new Test_1().test_1();
        new Test_2().test_5();
        new Test_2().test_7();
        new Test_2().test_8();
    }

    @AfterTest
    public void test_11() {
        System.out.println("AfterTest");
    }

    @AfterClass
    public void test_12() {
        System.out.println("AfterClass");
    }

    @AfterClass
    public void test_13() {

        System.out.println("AfterClass");
    }
}
