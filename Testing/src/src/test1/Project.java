/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author DILIP
 */
public class Project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        
        String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        String pass="^[0-9]";
      //return email.matches(regex);
        System.setProperty("webdriver.chrome.driver","F:\\netbeans-projects\\Test1\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("file:///C:/Users/DILIP/Desktop/web/boot-me.html");
        driver.manage().window().maximize();
        String email="diptishipate@gmail.com";
        String password="^[0-9]{4}";
        String p="1234";
        // test case 1 match the regular expression.
        if(email.matches(regex)&& p.matches(password))
        {  
        driver.findElement(By.id("username")).sendKeys(email);
          
            driver.findElement(By.id("pwd")).sendKeys(p);
                Thread.sleep(2000);
              driver.findElement(By.id("b1")).click();
                Thread.sleep(2000);
              System.out.println("Test case passed");
            // driver.navigate().forward();
             driver.findElement(By.id("d1")).click();
             driver.navigate().back();
             Thread.sleep(2000);
             driver.findElement(By.id("d2")).click();
             driver.navigate().back();
             Thread.sleep(2000);
             System.out.println(" The test case 1.3 passed");
          }
        
        
        else
        {
            System.out.print(" test case 1 failed");
        }
        driver.navigate().back();
       // WebDriver d=new ChromeDriver();
        // d.get("file:///C:/Users/DILIP/Desktop/web/boot-me.html");
        String g="gmail";
        Thread.sleep(2000);
        driver.findElement(By.id("link1")).click();
        driver.findElement(By.id("identifierId")).sendKeys("shipatedeepti@gmail.com");
        String t=driver.getTitle();
        if(g.equalsIgnoreCase(t))
        {
            System.out.print("Test case 2 passed");
        }
       else
        {
            System.out.println(" the test case 2 failed");
        }
        driver.navigate().back();
        Thread.sleep(2000);
          String f="facebook";
        driver.findElement(By.id("l")).click();
        String f1=driver.getTitle();
        if(f.equalsIgnoreCase(f1))
        {
            System.out.println("The test case 3 has passed");
        }
        else
        {
            System.out.println("\n the test 3 has not passed");
        }
        
    }
   
}
