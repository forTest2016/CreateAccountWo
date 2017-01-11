package woo.io;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import woo.io.resourse.LogLog4j;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TestNgTestBase {

    protected WebDriver driver;
    // protected String gridHubUrl;
    //  protected String baseUrl;
    private static Logger Log = Logger.getLogger(LogLog4j.class.getName());

    @BeforeClass
    public void init() throws IOException {
        // baseUrl = PropertyLoader.loadProperty("site.url");
        // gridHubUrl = PropertyLoader.loadProperty("grid2.hub");

        /*ChromeOptions options = new ChromeOptions();
        options.addExtensions(new File("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe"));
        options.setBinary(new File("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe"));
        // For use with ChromeDriver:
        ChromeDriver driver = new ChromeDriver(options);*/


        File pathToFirefoxBinary = new File("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");

        FirefoxBinary firefoxbin = new FirefoxBinary(pathToFirefoxBinary);
        // **** This is the line that changes.
                // **** Note the lack of the WebDriver type.
        driver = new FirefoxDriver(firefoxbin, null);

        // Capabilities capabilities = PropertyLoader.loadCapabilities();
        //driver = new ChromeDriver();
        //driver = new FirefoxDriver();
        //driver = WebDriverFactory.getDriver(capabilities);


        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @AfterSuite(alwaysRun = true)
    public void tearDown() throws Exception {
        if (driver != null) {
            driver.quit();
        }
    }
}