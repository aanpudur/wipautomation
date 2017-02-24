package com.wip.training.excercise7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GithubLogin {

  public static void main(String[] args)  {
    
    String username = "username@gmail.com";
    String passwd = "passwd";
        
    System.setProperty("webdriver.gecko.driver", "/Users/aanvazhapilly/Downloads/geckodriver");     
    WebDriver driver = new FirefoxDriver();
    driver.get("https://github.com/");
    driver.findElement(By.linkText("Sign in"));
    //driver.get("https://github.com/login");
    WebElement signin = driver.findElement(By.name("login"));
    signin.sendKeys(username);
    WebElement password = driver.findElement(By.name("password"));
    password.sendKeys(passwd);
    driver.findElement(By.name("commit")).click();    
  }
}
