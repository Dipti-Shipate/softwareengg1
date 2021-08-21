/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

//import static org.openqa.grid.common.SeleniumProtocol.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author DILIP
 */
public class Test1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        System.out.println("hi baby");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.gmail.com");
        driver.manage().window().maximize();
        driver.findElement(By.id("identifierId")).sendKeys("shipatedeepti@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.className("CwaK9")).click();
        String st=driver.getTitle();
        String at="gmail";
        driver.close();
        if(st.equalsIgnoreCase(at))
        {
            System.out.println(" Test Successful");
           
        }
        else
        {
            System.out.print("Test not successful");
        }
   
        
        
        
        
       
    }
    
}
