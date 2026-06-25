package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) {
		
//		// 1.browser launch
//		 WebDriver driver = new ChromeDriver();
//		 
//		 // 2.URL launch
//		 driver.get("https://adactinhotelapp.com/");
//		 
//		 //3.get current URL
//		 String url = driver.getCurrentUrl();
//		 System.out.println(url);
//		 
//		 //4.get title
//		 String title = driver.getTitle();
//		 System.out.println(title);	
//		 
//		 //5.quit
//		 driver.quit();
		
	
//		QUESTIONS(practical)
//		----------------------
//		1.Launch the below URL's in firefox browser:
		
		WebDriver driver = new ChromeDriver();
		
		//1.Greens technologys
		driver.get("http://www.greenstechnologys.com/");
		
		//2.Facebook
		driver.get("https://www.facebook.com/");
		
		//3.Amazon
		driver.get("https://www.amazon.in");
		
		//4.Greens technologys
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		//2.Launch the below URL's in chrome browser:
		//1.Greens technologys
		driver.get("http://www.greenstechnologys.com/");
		
		//2.Gmail 
		driver.get("http://gmail.com/");
		
		//3.Flipkart 
		driver.get("http://www.flipkart.com/");
		
		//4.Greens technology
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		//3.Launch the below URL's in IE browser:
		//1.Greens technologys
		driver.get("http://www.greenstechnologys.com/");
		
		//2.DemoQa Registration
		driver.get("http://demo.automationtesting.in/Register.html");
		
		//3.Greens technologys
		driver.get("http://www.greenstechnologys.com/");
		
		//4.Greens technologys
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		
	}
}
