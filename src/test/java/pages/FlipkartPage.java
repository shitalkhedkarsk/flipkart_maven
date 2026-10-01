package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FlipkartPage {

    private WebDriver driver;

    public FlipkartPage(WebDriver driver) {
        this.driver = driver;
    }
    

    private By electronics = By.xpath("//h1[normalize-space()='Electronics']");
    private By camera = By.xpath("//div[contains(text(),'Camera')]");
    private By cameraLens = By.xpath("//a[contains(.,'Camera Lens')]");
    private By closeLoginPopup = By.xpath("//span[@role='button']");
    


    public void closeLoginPopup() {
    driver.findElement(closeLoginPopup).click();
    }
    public void closeLoginPopupmainPage() {
    driver.findElement(By.tagName("body")).sendKeys(Keys.ESCAPE);
}
    public void clickElectronics() {
        driver.findElement(electronics).click();
    }

    public void clickCamera() {
        driver.findElement(camera).click();
    }

    public void clickCameraLens() {
        driver.findElement(cameraLens).click();
    }

    public int getCameraLensImageCount() {
        List<WebElement> images = driver.findElements(By.tagName("img"));
        return images.size();
    }
}
