package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

// go to fb.com
driver.get("https://www.facebook.com/");

//enter username
driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abracadabra");

//click on forgot password
 driver.findElement(By.xpath("//a[text()='Forgot password?']")).click();





    }
}
