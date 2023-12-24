

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class GetTextFromAvitoPage  {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Алекс\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize(); // при необходимости развернуть окно браузера
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // создаем неявное ожидание, т.е. общее ожидание
        driver.get("https://www.avito.ru/sankt-peterburg/transport"); // открыть страницу

        WebElement findElement = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div[2]/div[1]/div/h1"));
        // поиск элемента
        //     String par = findElement.getAttribute("href"); // указываем какой аттрибут нам необходим, напр, ссылка и забираем (get) инфу
        String par = findElement.getText(); // при необходимосты вывести текст
        // String par = findElement.getCssValue("display"); // пример для стилей css
        System.out.println(par); // выводим инфу в консоль

        driver.quit();
    }
}
