package org.example;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {


       // System.setProperty("")
        //create new instance of Chromedriver
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys("rahul");
        driver.findElement(By.name("inputPassword")).sendKeys("hello123");
        driver.findElement(By.className("signInBtn")).click();

        /*
        Css Selector
        class - tagname.classname
        Id - tagname#id -> input#inputUsername
         */



//        //find the text input element by its name
//        WebElement element=driver.findElement(By.name("q"));
//
//        //Enter something to search for
//        element.sendKeys("Cheese!");
//
//        //submit the form
//        element.submit();
//
//        //close the browser
//        driver.quit();

        /*
        ways to find an element
        Classname
        CssSelector
        Xpath
        ID
        Name
        linktext
        partiallinktext
        Tagname


        Other common actions
        click
        dragAndDrop
        KeyDown
        MoveToElement
         */
    }
}