package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
//    thuộc tính giúp tương tác trên website như:
//    truy cập page, fill value, click, checkbox,...
    protected WebDriver driver;

//    thuộc tính giúp tìm kiếm locator dễ dàng hơn, tránh trường
//    hop flaky test
    protected WebDriverWait wait;

//    thuộc tính để chèn code javascript giúp tương tác trên website:
//    highlight, scroll, double click,...
    protected JavascriptExecutor js;

    public BasePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
        this.js = (JavascriptExecutor) driver;
    }
}
