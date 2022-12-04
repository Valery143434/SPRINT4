package mainPage;
import org.openqa.selenium.*;

public class Order {
    private static WebDriver driver;
    //Локаторы:
    //Согласие с Coockie
    private By buttonCoockie = By.className("App_CookieButton__3cvqF");
    //Имя
    private By name = By.xpath("//input[@placeholder='* Имя']");
    //Фамилия
    private By surname = By.xpath("//input[@placeholder='* Фамилия']");
    //Адрес
    private By address = By.xpath("//input[@placeholder='* Адрес: куда привезти заказ']");
    //Станция метро
    private By metroField = By.xpath("//input[@placeholder='* Станция метро']");
    //Телефон
    private By telephone = By.xpath("//input[@placeholder='* Телефон: на него позвонит курьер']");
    //Кнопка "Далее"
    private By buttonFurther = By.xpath("//button[text()='Далее']");

    //Когда привезти самокат
    private By whenBringScooter = By.xpath("//input[@placeholder='* Когда привезти самокат']");
    //Поле "срок аренды"
    private By RentField = By.className("Dropdown-placeholder");
    //Комментарий курьеру
    private By сommentForCourier = By.xpath("//input[@placeholder='Комментарий для курьера']");
    //Кнопка "заказать"
    private By buttonOrderOnForm = By.className("Order_Buttons__1xGrp");
    //Кнопка подтверждения заказа
    private By buttonOrderAcceptedOnForm = By.xpath("//button[text()='Да']");

    //Подтверждение формления заказа
    private By orderStatusCompleted = By.xpath("//*[contains(text(), 'Заказ оформлен')]");

    public Order(WebDriver driver) {
        this.driver = driver;
    }
    //Метод для перехода на страницу "ЯндексСамокат"
    public static void startPage() {
        driver.get("https://qa-scooter.praktikum-services.ru/");;
    }

    public void clickOrderButton(By OrderButton){
        WebElement element = driver.findElement(OrderButton);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(OrderButton).click();
    }
    public void setOneFormOrder(String newName, String newSurname,
                                String newAddress, By metroStation, String newTelephone) {
        driver.findElement(buttonCoockie).click();
        driver.findElement(name).sendKeys(newName);
        driver.findElement(surname).sendKeys(newSurname);
        driver.findElement(address).sendKeys(newAddress);
        driver.findElement(telephone).sendKeys(newTelephone);
        driver.findElement(metroField).click();
        driver.findElement(metroStation).click();
        driver.findElement(buttonFurther).click();
    }
    public void setTwoFormOrder(String newWhenBringScooter, By timeRent,
                                By colourScooter, String newCommentForCourier) {
        driver.findElement(whenBringScooter).sendKeys(newWhenBringScooter);
        WebElement textbox = driver.findElement(whenBringScooter);
        textbox.sendKeys(Keys.ENTER);
        driver.findElement(RentField).click();
        driver.findElement(timeRent).click();
        driver.findElement(colourScooter).click();
        driver.findElement(сommentForCourier).sendKeys(newCommentForCourier);
        driver.findElement(buttonOrderOnForm).click();
        driver.findElement(buttonOrderAcceptedOnForm).click();
    }
    public void checkOderStatusCompleted() {
        driver.findElement(orderStatusCompleted).isEnabled();
    }

}
