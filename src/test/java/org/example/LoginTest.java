package org.example;


import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;
public class LoginTest {
    public static LoginPage loginPage;
    //public static ProfilePage profilePage;
    public static WebDriver driver;

    /**
     * осуществление первоначальной настройки
     */
    @BeforeClass
    public static void setup() {
        //определение пути до драйвера и его настройка
        System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromedriver"));
        //создание экземпляра драйвера
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        //profilePage = new ProfilePage(driver);
        //окно разворачивается на полный экран
        driver.manage().window().maximize();
        //задержка на выполнение теста = 10 сек.
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //получение ссылки на страницу входа из файла настроек

    }

    /**
     * тестовый метод для осуществления аутентификации
     */
    @Test
    public void loginTest() throws InterruptedException {
        //получение доступа к методам класса LoginPage для взаимодействия с элементами страницы
        //значение login/password берутся из файла настроек по аналогии с chromedriver
        //и loginpage
        driver.get(ConfProperties.getProperty("loginpageRambler"));
        //нажимаем кнопку входа
        loginPage.btnSignUp();
        loginPage.inputLogin(ConfProperties.getProperty("login"));
        //вводим пароль
        loginPage.newPassword(ConfProperties.getProperty("password"));
        loginPage.confirmPassword(ConfProperties.getProperty("password"));

        TimeUnit.SECONDS.sleep(10);
        //loginPage.clickLoginBtn();

    }


    @Test
    public void stepikSignUpTest() throws InterruptedException {

        driver.get(ConfProperties.getProperty("yandexSearchLink"));


    }


}