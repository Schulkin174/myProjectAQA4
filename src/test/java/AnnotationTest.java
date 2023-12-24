import org.junit.jupiter.api.*;


@DisplayName("Тесты на JUnit") // даём нашим тестам читабельное название
public class AnnotationTest {

    @BeforeAll
    public static void beforeAll(){ // метод должен быть статичный, тк выполняется для класса, а не для методов
        System.out.println("@BeforeAll");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("@BeforeEach");
    }

    @Test
    public void test() {
        System.out.println("@Test");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("@AfterEach");
    }

    @Test
    @DisplayName("Тест 2")
    public void test2() {
        System.out.println("@Test2");
    }

    @Test
    @Disabled("тест отключен")
    public void test3() {
        System.out.println("@Test3");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("@AfterAll");
    }
}
