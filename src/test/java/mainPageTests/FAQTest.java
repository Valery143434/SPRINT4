package mainPageTests;

import mainPage.FAQ;
import mainPage.Order;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FAQTest {

    private WebDriver driver;

    @Before
    public void CheckDropdownListInImportantQuestionsSection() {
        driver = new ChromeDriver();
        Order order = new Order(driver);
        order.startPage();
        FAQ faq = new FAQ(driver);
        faq.waitLoadFAQ();
    }
    @Test
    public void checkElementHowMuch() {
        FAQ faq = new FAQ(driver);
        faq.methotdCheckElementHowMuch();
    }

    @Test
    public void checkElementIWantSomeScooters() {
        FAQ faq = new FAQ(driver);
        faq.methotCheckElementIWantSomeScooters();
    }

    @Test
    public void checkElementHowCalculatedTime() {
        FAQ faq = new FAQ(driver);
        faq.methodCheckElementHowCalculatedTime();
    }
    @Test
    public void checkElementRentToday() {
        FAQ faq = new FAQ(driver);
        faq.methodCheckElementRentToday();
    }

    @Test
    public void checkElementExtendAndReturnEarlier() {
        FAQ faq = new FAQ(driver);
        faq.methodCheckElementExtendAndReturnEarlier();
    }

    @Test
    public void checkElementChargersWithScooter() {
        FAQ faq = new FAQ(driver);
        faq.methodCheckElementChargersWithScooter();
    }

    @Test
    public void checkElementCancelOrder() {
        FAQ faq = new FAQ(driver);
        faq.methodCheckElementCancelOrder();
    }

    @Test
    public void checkElementRentOutsideMoscowRing() {
        FAQ faq = new FAQ(driver);
        faq.methodCheckElementRentOutsideMoscowRing();
    }

    @After
    public void teardown() {
        driver.quit();
    }
}
