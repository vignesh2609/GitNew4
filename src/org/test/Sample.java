package org.test;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	public static void main(String[] args) throws InterruptedException, IOException {
		//setproperty
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vignesh R\\Vicky\\selenium\\driver\\chromedriver.exe");
		//launch browser
		ChromeDriver driver=new ChromeDriver();
		//url
		driver.get("https://en-gb.facebook.com/login/");
		driver.manage().window().maximize();
		TakesScreenshot tk= (TakesScreenshot) driver; 
		File s= tk.getScreenshotAs(OutputType.FILE);
		File d= new File("C:\\Users\\Vignesh R\\Vicky\\selenium\\output\\out.png");
		FileUtils.copyFile(s, d);
		
		}
}
 