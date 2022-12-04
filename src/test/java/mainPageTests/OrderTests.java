package mainPageTests;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import mainPage.Order;

import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Parameterized.class)
public class OrderTests {
    private final By orderButton;
    private WebDriver driver;
    private final String name;
    private final String surname;
    private final String address;
    private final By metroStation;
    private final String telephone;
    private final String whenBringScooter;
    private final By timeRent;
    private final By colourScooter;
    private final String commentForCourier;

    public OrderTests(By orderButton, String name,
                      String surname, String address,
                      By metroStation, String telephone,
                      String whenBringScooter,
                      By timeRent, By colourScooter,
                      String commentForCourier) {
        this.orderButton = orderButton;
        this.name  = name ;
        this.surname = surname;
        this.address = address;
        this.metroStation = metroStation;
        this.telephone = telephone;
        this.whenBringScooter = whenBringScooter;
        this.timeRent = timeRent;
        this.colourScooter = colourScooter;
        this.commentForCourier = commentForCourier;

    }

    @Parameterized.Parameters
    public static Object[][] getOrder() {
        return new Object[][]{

                {By.xpath(".//div[@class='Home_FinishButton__1_cWm']//*[text()='Заказать']"),
                        "Марти", "МкФлай", "ХилВэлли",
                        By.xpath(".//button[@value='2']"),
                        "89876543211",
                        "12.12.2022",
                        By.className("Dropdown-option"),
                        By.xpath("//*[@id='grey']"),
                        "Быстрее, мало времени"},

                {By.xpath(".//button[@class='Button_Button__ra12g']"),
                        "Эммет", "Браун", "ХилВэлли",
                        By.xpath(".//button[@value='1']"),
                        "+79876543210", "11.12.2022",
                        By.className("Dropdown-option"),
                        By.xpath("//*[@id='black']"),
                        "Не спишите, а то успеем"},
        };
    }

    @Test
    public void test() {
        driver = new ChromeDriver();
        Order order = new Order(driver);
        order.startPage();
        order.clickOrderButton(orderButton);
        order.setOneFormOrder(name, surname, address,
                metroStation, telephone);
        order.setTwoFormOrder(whenBringScooter, timeRent,
                colourScooter, commentForCourier);
        order.checkOderStatusCompleted();
    }
    @After
    public void teardown() {
        driver.quit();
    }
}