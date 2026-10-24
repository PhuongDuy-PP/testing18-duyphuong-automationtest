package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage{
//    <input
//        data-v-1f99f73c=""
//        class="oxd-input oxd-input--active"
//        name="username" placeholder="Username" autofocus="">
//    xpath: rule de tim locator tren website
//    //input => tim tat ca cac the input trong page
//    //input[@name='username'] => tim tat ca cac the input co
//    thuoc tin name voi value la username
//    //input[@name='username']
    private static final By INPUT_USERNAME = By.xpath("//input[@name='username']");
    private static final By INPUT_PASSWORD = By.xpath("//input[@name='password']");
//    private static final By LOGIN_BTN = By.xpath("//button[@type='submit']");
//    private static final By LOGIN_BTN = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']");
//    truong hop muon tim 1 class trong nhieeu class nam => contain
    private static final By LOGIN_BTN = By.xpath("//button[contains(@class, 'oxd-button')]");
//    css selector => By.cssSelector("button.oxd-button")")
    public LoginPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

//    step 1: truy cap vao page login
    public void open() {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//        fix thêm cho case web hien thị lâu
//        đợi có điều kiện => đợi xuất hiện thẻ input
        wait.until(ExpectedConditions.visibilityOfElementLocated(INPUT_USERNAME));
    }

//    step 2: login
//    enterUsername, enterPassword, clickLoginBtn
//    2 cach viet
//    c1: tach tung step thanh tung function
//    UU DIEM: de dang them log kiem tra, de sua
//    c2: gom cac step chung 1 function

    public void login(String username, String password) throws InterruptedException {
        WebElement usernameInput = driver.findElement(INPUT_USERNAME);
        usernameInput.sendKeys(username);

        Thread.sleep(2000);

        WebElement passwordInput = driver.findElement(INPUT_PASSWORD);
        passwordInput.sendKeys(password);

        Thread.sleep(2000);
        WebElement loginBtn = driver.findElement(LOGIN_BTN);
        loginBtn.click();

    }
}
