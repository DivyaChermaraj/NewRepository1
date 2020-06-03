/**
 * 
 */
package practise_Jun;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author GOODLUCK
 *
 */
public class numberone {
public static void main(String[] args) {
	System.setProperty ("webdriver.chrome.driver","D:\\Practise\\workspace\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://google.com");
	String a = driver.getTitle();
	System.out.println(a);
}
}

