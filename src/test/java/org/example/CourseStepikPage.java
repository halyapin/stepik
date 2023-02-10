package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CourseStepikPage {


    public WebDriver driver;

    public CourseStepikPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }


    //Нажать просмотр видео
    //Нажать хочу пройти курс и поступить на курс
    //найти несколько других курсов и тоже на них поступить
    //сделать цикл прощелкивания всего курса
    // и выбор из 4х курсов - 2 случайных чтобы вместе с нашим проходить
    //поставить реакцию на каждый урок
    //написание отзыва по окончании курса их массива с отзывами с яндекса спиздить










}