/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author DILIP
 */
public class FlipkartTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
       System.setProperty("webdriver.chrome.driver","C:\\Users\\DILIP\\Desktop\\sel\\chromedriver_win32\\chromedriver.exe");
          WebDriver driver = new ChromeDriver();
          driver.get("http://www.amazon.com/");
          driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Dell");
         driver.findElement(By.xpath("//input[@value='Search']")).click();
          
          
          
          
    }
    
}
