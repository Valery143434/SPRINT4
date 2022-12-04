package mainPage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.junit.Assert.assertEquals;

public class FAQ {
    private WebDriver driver;
    private By element1 = By.xpath(".//div[@class='accordion']//div[@id='accordion__heading-0']");
    private By textElement1 = By.xpath(".//div[@class='accordion']//div[@aria-labelledby='accordion__heading-0']");
    private By element2 = By.xpath(".//div[@class='accordion']//div[@id='accordion__heading-1']");
    private By textElement2 = By.xpath(".//div[@class='accordion']//div[@aria-labelledby='accordion__heading-1']");
    private By element3 = By.xpath(".//div[@class='accordion']//div[@id='accordion__heading-2']");
    private By textElement3 = By.xpath(".//div[@class='accordion']//div[@aria-labelledby='accordion__heading-2']");
    private By element4 = By.xpath(".//div[@class='accordion']//div[@id='accordion__heading-3']");
    private By textElement4 = By.xpath(".//div[@class='accordion']//div[@aria-labelledby='accordion__heading-3']");
    private By element5 = By.xpath(".//div[@class='accordion']//div[@id='accordion__heading-4']");
    private By textElement5 = By.xpath(".//div[@class='accordion']//div[@aria-labelledby='accordion__heading-4']");
    private By element6 = By.xpath(".//div[@class='accordion']//div[@id='accordion__heading-5']");
    private By textElement6 = By.xpath(".//div[@class='accordion']//div[@aria-labelledby='accordion__heading-5']");
    private By element7 = By.xpath(".//div[@class='accordion']//div[@id='accordion__heading-6']");
    private By textElement7 = By.xpath(".//div[@class='accordion']//div[@aria-labelledby='accordion__heading-6']");
    private By element8 = By.xpath(".//div[@class='accordion']//div[@id='accordion__heading-7']");
    private By textElement8 = By.xpath(".//div[@class='accordion']//div[@aria-labelledby='accordion__heading-7']");

    private String textExpected1="Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
    private String textExpected2="Пока что у нас так: один заказ — один самокат. " +
            "Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
    private String textExpected3="Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. " +
            "Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. " +
            "Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
    private String textExpected4="Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
    private String textExpected5="Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
    private String textExpected6="Самокат приезжает к вам с полной зарядкой. " +
            "Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
    private String textExpected7="Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
    private String textExpected8="Да, обязательно. Всем самокатов! И Москве, и Московской области.";

    public FAQ(WebDriver driver) {
        this.driver = driver;
    }
    public void waitLoadFAQ(){
        WebElement element = driver.findElement(By.className("accordion"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
    }
    public void methotdCheckElementHowMuch(){
        driver.findElement(element1).click();
        assertEquals(textExpected1, driver.findElement(textElement1).getText());
    }
    public void methotCheckElementIWantSomeScooters(){
        driver.findElement(element2).click();
        assertEquals(textExpected2, driver.findElement(textElement2).getText());
    }
    public void methodCheckElementHowCalculatedTime(){
        driver.findElement(element3).click();
        assertEquals(textExpected3, driver.findElement(textElement3).getText());
    }
    public void methodCheckElementRentToday(){
        driver.findElement(element4).click();
        assertEquals(textExpected4, driver.findElement(textElement4).getText());
    }
    public void methodCheckElementExtendAndReturnEarlier(){
        driver.findElement(element5).click();
        assertEquals(textExpected5, driver.findElement(textElement5).getText());
    }
    public void methodCheckElementChargersWithScooter(){
        driver.findElement(element6).click();
        assertEquals(textExpected6, driver.findElement(textElement6).getText());
    }
    public void methodCheckElementCancelOrder(){
        driver.findElement(element7).click();
        assertEquals(textExpected7, driver.findElement(textElement7).getText());
    }
    public void methodCheckElementRentOutsideMoscowRing(){
        driver.findElement(element8).click();
        assertEquals(textExpected8, driver.findElement(textElement8).getText());
    }
}