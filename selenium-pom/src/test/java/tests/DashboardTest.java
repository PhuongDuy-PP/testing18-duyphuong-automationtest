package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;

public class DashboardTest extends BaseTest{

    @Test(description = "Find locators")
    public void findLocators() throws InterruptedException {
//        pre-condition
        LoginPage loginPage = new LoginPage(driver, wait);
        loginPage.open();
        loginPage.login("Admin", "admin123");

//        vi tu page login -> dashboard se cos khoang thoi gian
//        doi cac element xuat hieen tren dashboard
//        tim dieu kien de waiting
//        Thread.sleep(10_000);
        wait.until(ExpectedConditions.urlContains("dashboard"));
//        doi xuat hien 1 trong cac element thi bypass
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//a[@href='/web/index.php/admin/viewAdminModule']")
        ));

        DashboardPage dashboardPage = new DashboardPage(driver, wait);
        Assert.assertTrue(dashboardPage.isElementPresnt());
    }
}
