Создать xml сюит и 4 класса, после запуска которых мы получим следующий вывод в консоль:


BeforeSuite   
BeforeClass   
Test   
AfterMethod   
Test   
Test data: 1 2   
AfterMethod   
AfterMethod   
Test   
Test data: three four   
AfterMethod   
Test   
Test data: true false   
AfterMethod   
BeforeClass   
Test   
Test   
Test   
Test data: 1 2   
AfterMethod   
Test   
Test data: three four   
Test   
Test data: true false   
AfterClass   
AfterClass   
AfterTest   
BeforeTest   
Test   
AfterMethod   
AfterTest   
AfterSuite   

Условия:
1. Каждый метод должен содержать только 1 принт, который соответствует его аннотации.
2. У тестовых методов может быть дополнительный принт с тестовыми данными
3. Нельзя использовать циклы