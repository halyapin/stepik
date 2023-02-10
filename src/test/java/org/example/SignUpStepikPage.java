package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SignUpStepikPage {

    public WebDriver driver;

    public SignUpStepikPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }


    @FindBy(xpath = "//*[contains(@class, 'search3__input mini-suggest__input')]")
    private WebElement searchYa;

    @FindBy(xpath = "//*[contains(@class, 'search3__button mini-suggest__button')]")
    private WebElement btnsearchYa;

    @FindBy(xpath = "//*[contains(@href, 'https://stepik.org/course/124505/promo')]")
    private WebElement clickCoursePromo;

    @FindBy(xpath = "//*[contains(@href, '/course/124505/promo?auth=registration')]")
    private WebElement btnSignUpStepik;

//всплывающее окно регистрации
    @FindBy(xpath = "//*[contains(@id, 'id_registration_full-name')]")
    private WebElement placeFullName;

    @FindBy(xpath = "//*[contains(@id, 'id_registration_email')]")
    private WebElement placeEmail;

    @FindBy(xpath = "//*[contains(@id, 'id_registration_password')]")
    private WebElement placePassword;

    @FindBy(xpath = "//*[contains(@class, 'sign-form__btn button_with-loader')]")
    private WebElement bntSubminStepik;









    public void inputLogin(String searchText) {
        searchYa.sendKeys(searchText); }

    public void btnsearchYa() {
        btnsearchYa.click(); }



    public void clickCoursePromo() {
        clickCoursePromo.click(); } // НЕ РАБОТАЕТ 2 ссылки не знаю как локализовать
    //Открывается новое окно? как перейти селениумом в него? Надо ли? или новый тест запустить
    //уже с указанной ссылки https://stepik.org/course/124505/promo

    public void btnSignUpStepik() {
        btnSignUpStepik.click(); }

    public void placeFullName(String FullName) {
        placeFullName.sendKeys(FullName); }

    public void placeEmail(String email) {
        placeEmail.sendKeys(email); }

    public void placePassword(String password) {
        placePassword.sendKeys(password); }

    public void bntSubminStepik() {
        bntSubminStepik.click(); }



}