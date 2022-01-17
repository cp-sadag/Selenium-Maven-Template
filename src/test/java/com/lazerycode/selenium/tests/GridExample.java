package com.lazerycode.selenium.tests;

import com.lazerycode.selenium.DriverBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Platform;

import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

     
public class GridExample {
    @Test
    public void mailTest() throws MalformedURLException{
	// Create a desired capabilities object as a starting point.
        DesiredCapabilities dr = null; //DesiredCapabilities("chrome", "97", Platform.LINUX);
        //dr=DesiredCapabilities.chrome();
        //dr.setBrowserName("chrome");
        //dr.setPlatform(Platform.LINUX);
     
        RemoteWebDriver driver=new RemoteWebDriver(new    URL("http://localhost:4444/wd/hub"), dr);
        driver.navigate().to("http://gmail.com");
        driver.close();
    }
}
