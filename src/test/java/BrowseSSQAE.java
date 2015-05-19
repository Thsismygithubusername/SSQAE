import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BrowseSSQAE {
	WebDriver driver = null;
	
	
	@Before
	public void setUp(){
		
		 driver= new FirefoxDriver();
	
	}

	@Test
	public void goToSSQAE(){
	
	driver.get ("http://www.ssqaela.com");

	}

	@After
	public void tearDown(){
		
		driver.quit();
	}
}
