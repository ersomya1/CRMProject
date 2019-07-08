package weather;

import org.testng.Assert;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import io.restassured.http.Cookie;
import io.restassured.http.Cookies;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.config.RestAssuredConfig;
import io.restassured.config.XmlConfig;

import java.util.concurrent.TimeUnit;
import org.hamcrest.Matcher;
import org.omg.CORBA.portable.InputStream;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.matcher.RestAssuredMatchers.*;
import io.restassured.matcher.ResponseAwareMatcherComposer.*;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.ResponseSpecification;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.mapper.ObjectMapperType;
import static io.restassured.path.json.JsonPath.*;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import static io.restassured.path.json.JsonPath.from;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import static io.restassured.path.json.JsonPath.*;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;


public class WeatherApiTest {

	/*@Test
	public void testResponseCode()
	{
		
		
		given().
		pathParam("key","photos").
	//	pathParam("json","circuits.json").
		when().
		post("http://jsonplaceholder.typicode.com/{key}/").
		then().statusCode(400);
	//	get("http://ergast.com/api/f1/2017/circuits.json").then().statusCode(200).log().all();
		
/*		Response response = get("http://jsonplaceholder.typicode.com/photos");
		Map<String, String> cookies = response.getCookies();
				for(Map.Entry<String, String> cook : cookies.entrySet())
				{
					System.out.println(cook.getKey() + "   " + cook.getValue());
				}
		        */
		/*  Response response =  get("http://jsonplaceholder.typicode.com/photos");
		     Cookie cook = response.getDetailedCookie("__cfduid"); 
		     System.out.println("cookie" +  cook.hasExpiryDate());
		     System.out.println("cookie expiry" +  cook.getExpiryDate());
		     System.out.println("Value" + cook.getValue());
		  //  String cfray = response.getHeader("Server");
			//	System.out.println(cfray);
				
				/*Headers head = response.getHeaders();
				for(Header h:head)
				{
					System.out.println(h.getName() + h.getValue());
				}
				*/
				
			//	System.out.println(head);
		
		
	/*String apiAsString =	when().get("http://ergast.com/api/f1/2017/circuits.json").then().extract().asString();
 //  List<String> ls =  from(apiAsString).get("MRData.CircuitTable.Circuits.Location");
	JsonPath jsonpath = new JsonPath(apiAsString).setRoot("MRData.CircuitTable.Circuits.Location");
	List<String> ls  = jsonpath.get("locality");
	System.out.println(ls);*/
	
	// List<String> ls =    from(apiAsString).getList("MRData.CircuitTable.Circuits.Location.findAll { it.country.length() == 3}.country");
  
 // System.out.println(ls);
/*	for(String cirName : ls)
	{
		if(cirName.contains("Bahrain")) {
			System.out.println("Found My Place");
		}
		
	}*/
   
	//	body("MRData.CircuitTable.Circuits.circuitId*.length().sum()",greaterThan(1000));
		
		/*   String res =
        when().
        get("http://ergast.com/api/f1/2017/circuits.json").
        then().contentType(ContentType.JSON).
        body("MRData.CircuitTable.Circuits.circuitId",hasItem("albert_park")).
        extract().asString();
        	
        
      System.out.println(res);
        	
	/*
		/*
	
		given().
		headers("AppKey","App-Value").
		param("employee_id", "1201").
		param("employee_salary","1001").
		when().
		post("http://dummy.restapiexample.com/api/v1/create").
		then().statusCode(200).log().all();

//get("http://ergast.com/api/f1/2017/circuits.json").then().
		//root("MRData.CircuitTable.Circuits").
	//	body("circuitId",hasItem("albert_park")).
//		body("circuitName",hasItem("Albert Park Grand Prix Circuit"));
/
*/
	//}*/
	
	@Test	
	public void upsrtc() throws InterruptedException
	{ SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd");  
	
	Date date = new Date(System.currentTimeMillis());  
	System.out.println(formatter.format(date));  
		
		
		String s ="12/12/2018";
	      String[] t = s.split("/");
	      for(String u :t)
	      {
	      System.out.println(u);
	      }
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.upsrtconline.co.in/#");
		driver.findElement(By.xpath("//a[@class='dp-choose-date']")).click();
		for(int i=0;i<3;i++)
		{
		driver.findElement(By.xpath("//a[@class='dp-nav-next-month']")).click();
		}
		Thread.sleep(5000);
		driver.quit();
	}
}

	