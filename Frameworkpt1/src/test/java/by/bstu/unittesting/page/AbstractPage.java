package by.bstu.unittesting.page;

import org.openqa.selenium.WebDriver;

public abstract class AbstractPage {

   // protected static final int SECONDS_TO_LOAD = 30;

    protected WebDriver driver;

    protected AbstractPage(WebDriver driver) {
        this.driver = driver;
    }
}
