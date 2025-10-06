package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Main {
    public static void main(String[] args) {
       // System.setProperty("webdriver.chrome.driver", "C:\\Browser driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://automationexercise.com/login");
        //Signing up
        driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Teju");
        driver.findElement(By.cssSelector("input[data-qa='signup-email']")).sendKeys("kalyan@gmail.com");
        driver.findElement(By.cssSelector("button[data-qa='signup-button']")).click();
        //Entered first webpage and entering salutation and password
        driver.findElement(By.id("uniform-id_gender2")).click();
        driver.findElement(By.id("password")).sendKeys("OyeHoye");
        //dropdown for selecting day
        WebElement staticDropdown = driver.findElement(By.id("days"));
        Select dropdown = new Select(staticDropdown);
        dropdown.selectByVisibleText("19");
        //dropdown for selecting month
        WebElement months = driver.findElement(By.id("months"));
        Select monthsSelect = new Select(months);
        monthsSelect.selectByVisibleText("July");
        //dropdown for selecting year
        WebElement years = driver.findElement(By.id("years"));
        Select yearsSelect = new Select(years);
        yearsSelect.selectByVisibleText("2002");
        //dropdown for entering FirstName, lastName, company, address1 and address2.
        driver.findElement(By.id("first_name")).sendKeys("Teju");
        driver.findElement(By.id("last_name")).sendKeys("Pandhare");
        driver.findElement(By.id("company")).sendKeys("Tata Consultancy Services");
        driver.findElement(By.id("address1")).sendKeys("Civil Lines");
        driver.findElement(By.id("address2")).sendKeys("Toronto");
        //dropdown for selecting country
        WebElement country = driver.findElement(By.id("country"));
        Select countrySelect = new Select(country);
        countrySelect.selectByVisibleText("Canada");
        //Entering city, state, country and zipcode
        driver.findElement(By.id("state")).sendKeys("Toronto");
        driver.findElement(By.id("city")).sendKeys("Toronto");
        driver.findElement(By.id("zipcode")).sendKeys("440030");
        driver.findElement(By.id("mobile_number")).sendKeys("8788746623");
        //Create account button
        driver.findElement(By.cssSelector("button[data-qa='create-account']")).click();
    }
}