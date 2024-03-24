import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class SeleniumDemo {


    public static void main(String[] args) throws InterruptedException {
        // System.setProperty("webdriver.chrome.driver","/pathof driver)
        //create new instance of Chromedriver
        WebDriver driver=new ChromeDriver();
       // driver.get("https://www.rahulshettyacademy.com/locatorspractice/");
        //driver.get("https://formy-project.herokuapp.com/keypress");
//        driver.get("https://formy-project.herokuapp.com/autocomplete");
//
//        WebElement autocomplete=driver.findElement(By.id("autocomplete"));
//        autocomplete.sendKeys("1555 Park Blvd, Palo Alta, CA");
//        Thread.sleep(1000);
//        //use mouse input to click
       // driver.get("https://formy-project.herokuapp.com/scroll");
        //Scrolling, scroll down to the text field
//        WebElement name=driver.findElement(By.id("name"));
//        //move to element using actions class
//        Actions actions=new Actions(driver);
//        actions.moveToElement(name);
//        name.sendKeys("Andy Lam");

//        WebElement date=driver.findElement(By.id("date"));
//        date.sendKeys("01/01/2020");

        //switch to active window,frames, alert

        //driver.get("https://formy-project.herokuapp.com/switch-window");
//        WebElement newTabbutton=driver.findElement(By.id("new-tab-button"));
//        newTabbutton.click();
//
//        //get window handle
//        String orginialHandle= driver.getWindowHandle();
//        //use a for loop to iterate throught the windows
//        for(String handle1: driver.getWindowHandles()){
//            driver.switchTo().window(handle1);
//        }
//        //switch back to originial handle
//        driver.switchTo().window(orginialHandle);

        //opening/switching/ then closing the alert
//        WebElement alertbutton=driver.findElement(By.id("alert-button"));
//        alertbutton.click();
//
//        //alert class
//        Alert alert=driver.switchTo().alert();
//        alert.accept();


        //Executing Javascripts commands via JavascriptExecutor Methods
        //executeAsyncScript
        //executeScript
        /*
        Uses of javascriptExecuter
        when webdriver fails to click on any element
        To trigger actions on a page
        To perform movement on a page
         */

//        driver.get("https://formy-project.herokuapp.com/modal");
//        WebElement modalButton=driver.findElement(By.id("modal-button"));
//        modalButton.click();
//
//        WebElement modalCloseButton=driver.findElement(By.id("close-button"));
//        //using javascript executor
//        JavascriptExecutor js=(JavascriptExecutor) driver;
//        js.executeScript("arguments[0].click();",modalCloseButton);



        //dragAndDrop

//        driver.get("https://formy-project.herokuapp.com/dragdrop");
//        WebElement image=driver.findElement(By.id("image"));
//        WebElement box= driver.findElement(By.id("box"));
//        //action class
//        Actions actions=new Actions(driver);
//        actions.dragAndDrop(image,box).build().perform();
//        Thread.sleep(1000);


        /*
        driver.switchTo().window("windowName");
        driver.switchTo().frame("frameName");
        driver.switchTo().alert();
         */

        /* various to find elements
        CSS selector
        Xpath
        name
        id
        classname
        tagname
        linktext
        partialLinkText


        Best locators are unique, best descriptive, and static
        Avoid using link text, tagname, xpath
        Prefer using ID, class, name,CSS selector

        CSS selector
        find by ID
        '#q'
        find by class
        '.q'
        driver.findElement(By.cssSelector("input[name='q']));

        CSS selector
        find based on a substring or string
        wildcards
        child/ sibling nodes


        combine multiple attributes
        different combination
        Tag and class
        <input class="q" type="text>
        driver.findElement(By.cssSelector("input.q");

        Tag and ID
        <input id="q" type="text">
        driver.findElement(By.cssSelector("input#q"));

        Tag and attribute
        <input type="radio" value="radio button">
        driver.findElement(By.cssSelector("input[type='radio']));
        driver.findElements(By.cssSelector("input[type='radio button']));

        Multiple classes
        driver.findElement(By.cssSelector(".btn.btn-lg.btn-success"));

        Text matching via by value and wildcard
        By value
        driver.findElement(By.cssselector("<tagname>[type='value']));
        By wildcard

        Prefix
        ex: a[id^='id_prefix']
        <div id="textField_randomId>
        driver.findElement(By.cssSelector("div[id^='textField']));

        Suffix
         <div id="textField_randomId>
        ex: a[id$='id_suffix']
        driver.findElement(By.cssSelector("div[id$='randomId']"));

        SubString
        ex: a[id*='id_pattern']
        <div id="123_textField_randomId">
        driver.findElement(By.cssSelector("div[id*='textField']"));

        Exact match
        ex: a[id='id']
        <div id="textField">
        driver.findElement(By.cssSelector("div[id='textField']"));


        Find Child nodes
        Child
        <div id="parent">
        <a id="child href="/child>Child</a></div>
        driver.findElement(By.cssSelector("div#parent a"));

        Nth-child
        <ull id="list">
        <li>One</li>
        <li>Two</li>
        <li>Three</li>
        </ul>

        driver.findELement(By.cssSelector("#list li:nth-child(Two)"));


            Tips and tricks to automate
            Radio buttons
            Check boxes
            Date pickers
            Drop-down menus
            File download

         */

        //Radio buttons

//        driver.get("https://formy-project.herokuapp.com/radiobutton");
//        WebElement radioBtn1=driver.findElement(By.id("radio-button-1"));
//        radioBtn1.click();
//        WebElement radioBtn2=driver.findElement(By.cssSelector("input[value='option2']"));
//        radioBtn2.click();
//        WebElement radioBtn3=driver.findElement(By.xpath("/html/body/div/div[3]/input"));
//        radioBtn3.click();

        //checkboxes
//        driver.get("https://formy-project.herokuapp.com/checkbox");
//        WebElement checkbox1= driver.findElement(By.id("checkbox-1"));
//        checkbox1.click();
//        WebElement checkbox2= driver.findElement(By.id("checkbox-2"));
//        checkbox2.click();
//        WebElement checkbox3= driver.findElement(By.id("checkbox-3"));
//        checkbox3.click();

        //Datepicker
//        driver.get("https://formy-project.herokuapp.com/datepicker");
//        WebElement datepicker= driver.findElement(By.id("datepicker"));
//        //we can sendkey or click on a date
//        datepicker.sendKeys("04/04/2024");
//        //close the date picker
//        datepicker.sendKeys(Keys.RETURN);


        //dropdown
//        driver.get("https://formy-project.herokuapp.com/dropdown");
//        WebElement dropdownBtn=driver.findElement(By.id("dropdownMenuButton"));
//        dropdownBtn.click();
//        //select an option from the list
//        WebElement autocomplete=driver.findElement(By.id("autocomplete"));
//        autocomplete.click();


        //file upload
//        driver.get("https://formy-project.herokuapp.com/fileupload");
//        WebElement chooseBtn=driver.findElement(By.id("file-upload-field"));
//        //have a file in your test folder. ex: file-to-upload.png
//        chooseBtn.sendKeys("file-to-upload.png");







        //driver.findElement(By.id("inputUsername")).sendKeys("rahul");
//        driver.findElement(By.name("inputPassword")).sendKeys("hello123");
//        driver.findElement(By.className("signInBtn")).click();





        //keyboard and mouse test
//        WebElement element=driver.findElement(By.id("name"));
//        element.click();
//        element.sendKeys("Andy Lam");
//
//        WebElement button=driver.findElement(By.id("button"));
//        button.click();

        //close the driver
        driver.quit();

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

        /*
        Sychronization issues
        Using implicit and explicit waits
        Implicit waits - waits for a specified amount of time before throwing a no such element exception
        Implicit wait is a global setting that applies to all elements in a selenium script
        it waits for a specified time before throwing an exception if the element is not found
        Default wait time is 0
        doesn't depend on element state, just time
        driver.manage().timeouts().implicitlyWait(TimeOut, TimeUnit.SECONDS);

        Explicit waits- wait for a specified amount of time for a certain condition to be true
        if the condition is not met in time, an exception is thrown
        waits for dynamically located elements

        WebDriverWait=wait=new WebDriverWait(driver,10);
        WebElement element=wait.unitl(ExpectedConditions.visibilityOfElementLocated(By.id("element");


         */
    }
    }

