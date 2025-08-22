package Testing_package;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class pageclass {
	
	WebDriver driver;
	By login=By.linkText("Sign in");
	By email=By.id("userid");
	By pass=By.id("pass");
	By cont=By.id("signin-continue-btn");
	By search=By.id("gh-ac");
	By submit=By.id("sgnBt");
	By addcart=By.cssSelector("a[id=\"atcBtn_btn_1\"]");
	By seecart=By.cssSelector("a[href=\"https://cart.ebay.com?_trksid=p4540640.m167481.l8876\"]");
	By remove=By.cssSelector("button[data-test-id=\"cart-remove-item\"]");
	
	By address=By.cssSelector("a[href=\"https://accountsettings.ebay.com/uas/addresses\"]");
	By edit=By.cssSelector("a[aria-label=\"Edit Registration address, email and phone number opens in new window or tab.\"]");
	By editbtn=By.cssSelector("button[id=\"individual_personal_info_address_edit_button\"]");
	By country=By.cssSelector("select>option[value=\"IN\"]");
	By change=By.cssSelector("input[aria-label=\"Street address\"]");
	
	//loginname
	By personal=By.cssSelector("a[href=\"https://accountsettings.ebay.com/profile\"]");
	By edit1=By.cssSelector("button[id=\"individual_username_edit_button\"]");
	By username=By.cssSelector("input[aria-describedby=\"user_name-inline_error\"]");
	
	//shopcart
	
	By shopcat=By.cssSelector("span[class=\"gh-categories__title\"]");
	By autopart=By.cssSelector("a[href=\"https://www.ebay.com/b/Auto-Parts-Accessories/6028/bn_569479\"]");
	By select=By.cssSelector("img[src=\"https://i.ebayimg.com/thumbs/images/g/qpoAAeSwuKNok19K/s-l1600.webp\"]");
	
	//allcategory
	By allcat=By.cssSelector("select>option[value=\"550\"]");
	By search1=By.cssSelector("span[class=\"gh-search-button__label\"]");
	
	//logout
	By logout=By.cssSelector("button[class=\"gh-flyout__target gh-flyout__target--left\"]");
	By signout=By.linkText("Sign out");
	
	//constructor
	public pageclass(WebDriver driver) {
		this.driver=driver;
	}
	
	//method
	
	public void login_in() {
		driver.findElement(login).click();
	}
	public void email_in()  {
		driver.findElement(email).click();
		driver.findElement(email).sendKeys("anishjadhav585@gmail.com");
		
	}
	
	public void pass_in()  {
		driver.findElement(pass).click();
		driver.findElement(pass).sendKeys("12102002a");
		
	}
	
	public void con_in()  {
		driver.findElement(cont).click();
		
	}
	
	public void submit() {
		driver.findElement(submit).click();
	}
	
	public void search_in() throws InterruptedException  {
		driver.findElement(search).click();
		 String searchitem[]= {"watch","phone","book"};
		  for(String item:searchitem) {
			  WebElement search=driver.findElement(By.id("gh-ac"));
			  search.clear();
			  search.sendKeys(item);
			  search.sendKeys(Keys.ENTER);
			  Thread.sleep(1000);
			 
		  }
		
	}
	
	public void addtocart_in() throws InterruptedException{
		driver.findElement(addcart).click();
		
		driver.findElement(seecart).click();
	
	}
	
	public void removecart_in() throws InterruptedException {
		
		driver.findElement(remove).click();
		
	}
	
	public void address_in() throws InterruptedException {
		driver.findElement(address).click();;
		driver.findElement(edit).click();
		Thread.sleep(1000);
		driver.findElement(editbtn).click();
		Thread.sleep(1000);
		driver.findElement(country).click();
		Thread.sleep(1000);
		driver.findElement(change).clear();
		Thread.sleep(1000);
		driver.findElement(change).sendKeys("sec 7");
		driver.findElement(change).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
	}
	
	public void editusername_in() {
		driver.findElement(personal).click();
		driver.findElement(edit1).click();
		driver.findElement(username).clear();
		driver.findElement(username).sendKeys("anish_85");
		driver.findElement(username).sendKeys(Keys.ENTER);
		
	}
	
	public void shopcart_in() throws InterruptedException {
		driver.findElement(shopcat).click();
		Thread.sleep(2000);
		driver.findElement(autopart).click();
		Thread.sleep(2000);
		driver.findElement(select).click();
		Thread.sleep(2000);
	}
	
	
	public void allcategory_in() throws InterruptedException {
		driver.findElement(allcat).click();
		Thread.sleep(2000);
		driver.findElement(search1).click();
		Thread.sleep(2000);
	}
	
	public void signout_in() throws InterruptedException {
		  Actions act = new Actions(driver);
	        act = new Actions(driver);
	        
	        WebElement logout1=driver.findElement(logout);
	        act.moveToElement(logout1).perform();
	        Thread.sleep(3000);
	        
	        driver.findElement(signout).click();
	        Thread.sleep(3000);
		
	}
	
	public void rightclick_in() {
		
	}
	

}
