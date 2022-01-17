package com.lazerycode.selenium.tests;

import com.lazerycode.selenium.DriverBase;
import com.lazerycode.selenium.page_objects.GoogleHomePage;
import com.lazerycode.selenium.page_objects.GoogleSearchPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


public class GoogleExampleIT extends DriverBase {


    @Test
    public void googleCheeseExample() throws Exception {
        // Create a new WebDriver instance
        // Notice that the remainder of the code relies on the interface, not the implementation.
        //WebDriver driver = getDriver();
	ChromeOptions chromeOptions = new ChromeOptions();
	WebDriver driver = new RemoteWebDriver(new URL("http://18.136.206.228:4444/"), chromeOptions);

        // First of all, let's navigate to the google home page
        driver.get("http://www.google.com");
        // Alternatively the same thing can be done like this
        // driver.navigate().to("http://www.google.com");

        //Instantiate an instance of our GoogleHomePage page object
        GoogleHomePage googleHomePage = new GoogleHomePage();

        // First we agree to Google's cookie usage terms
        //googleHomePage.acceptCookies();

        // Then we perform a google search for Cheese
        //GoogleSearchPage googleSearchPage = googleHomePage.enterSearchTerm("Cheese").submitSearch();

        // Google's search is rendered dynamically with JavaScript.
        // We wait for up to 15 seconds for the page to load, an exception is thrown if it doesn't
        //googleSearchPage.waitForPageTitleToStartWith("Cheese");

        //Normally you would have some assertions to check things that you really care about
        assertThat(driver.getTitle()).isEqualTo("Google");
    }
}
