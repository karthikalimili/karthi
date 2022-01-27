package Script;



import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class Script1 {

	WebDriver d1;
	@Given("Open chrome browser and url of application")
	public void open_chrome_browser_and_url_of_the_application() {
	// Write code here that turns the phrase above into concrete actions
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\alimili.karthik\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

	d1=new ChromeDriver();
	d1.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3F_encoding%3DUTF8%26ref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");

	System.out.println("Given done");
	}



	@When("Enter ap_email,continue,ap_password and click on signin button")
	public void enter_ap_email_continue_ap_password_and_click_on__signin_button() throws AWTException, IOException {
	// Write code here that turns the phrase above into concrete actions
    d1.findElement(By.name("email")).sendKeys("akkarthik281@gmail.com");
    d1.findElement(By.id("continue")).click();
    d1.findElement(By.id("ap_password")).sendKeys("Karthik1@");
    d1.findElement(By.id("signInSubmit")).click();
	d1.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
	d1.findElement(By.id("nav-search-submit-button")).click();
	d1.findElement(By.linkText("Apple iPhone X, 64GB, Space Gray - Fully Unlocked (Renewed Premium)")).click();
	Actions a = new Actions(d1);
	a.sendKeys(Keys.PAGE_DOWN).build().perform();



	d1.findElement(By.id("add-to-cart-button")).click();

	Robot rbt=new Robot();
	Dimension sc1_size = Toolkit.getDefaultToolkit().getScreenSize();
	Rectangle rect=new Rectangle(sc1_size);
	BufferedImage Source=rbt.createScreenCapture(rect);
	File destination=new File("C:\\Users\\Public\\Documents\\\\screen4.jpg");
	ImageIO.write(Source, "jpg", destination);
	System.out.println("When done");




	}

	@Then("Success in Signin")
	public void success_in_Signin() {
	// Write code here that turns the phrase above into concrete actions
	System.out.println("Then done");
	}







	}



