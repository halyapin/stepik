package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class LoginPage {

    public WebDriver driver;
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }

    //кнопка вход
    @FindBy(xpath = "//*[contains(@data-cerber-id, 'login_form::main::register_link')]")
    private WebElement btnSignUp;
    //кнопка войти с паролем
    @FindBy(xpath = "//*[contains(@id, 'login')]")
    private WebElement loginField;

    @FindBy(xpath = "//*[contains(@class, 'rui-Input-input -metrika-nokeys rui-Select-field rui-Select-darkPlaceholder rui-Input-filled')]")
    private WebElement typeDomain;

    @FindBy(xpath = "//*[contains(@class, 'rui-Relative-Overlay-content')]")
    private WebElement selectDomain;

    @FindBy(xpath = "//*[contains(@id, 'newPassword')]")
    private WebElement newPassword;

    @FindBy(xpath = "//*[contains(@id, 'confirmPassword')]")
    private WebElement confirmPassword;

    @FindBy(xpath = "//*[contains(@wfd-id, 'id4')]")
    private WebElement typeQuestion ;

    @FindBy(xpath = "//*[contains(@class, 'rui-Relative-Overlay-content')]")
    private WebElement selectQuestion;

    @FindBy(xpath = "//*[contains(@id, 'answer')]")
    private WebElement answerQuestion;

    @FindBy(xpath = "//*[contains(@id, 'checkbox')]")
    private WebElement capchaCheck;

    @FindBy(xpath = "//*[contains(@class='check')]")
    private WebElement checkCheck; //НЕ РАБОТАЕТ

    @FindBy(xpath = "//*[contains(@data-cerber-id, 'login_form::main::login_button')]")
    private WebElement btnLogin;

    @FindBy(xpath = "//*[contains(@data-cerber-id, 'registration_form::step_2::add_later')]")
    private WebElement btnAddLater;

//ЛОГИН В ПОЧТУ




    public void btnSignUp() {
        btnSignUp.click(); }


    public void inputLogin(String login) {
        loginField.sendKeys(login); }

    public void typeDomain() {
        typeDomain.click(); }

    public void selectDomain() {
        selectDomain.click(); }

    public void newPassword(String passwd) {
        newPassword.sendKeys(passwd); }

    public void confirmPassword(String passwd) {
        confirmPassword.sendKeys(passwd); }

    public void typeQuestion() {
        typeQuestion.click(); }

    public void selectQuestion() {
        selectQuestion.click(); }

    public void answerQuestion(String passwd) {
        answerQuestion.sendKeys(passwd); }

    public void capchaCheck() {
        capchaCheck.click(); }

    //Ожидание появления галочки checkCheck пока не работает
    public void btnLogin() {
        btnLogin.click(); }

    public void btnAddLater() {
        btnAddLater.click(); }



}
