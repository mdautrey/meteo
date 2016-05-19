package test.meteo; 

import meteo.WeatherService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import meteo.Location;

/** 
* WeatherService Tester. 
* 
* @author <Authors name> 
* @since <pre>mai 19, 2016</pre> 
* @version 1.0 
*/ 
public class WeatherServiceTest  {
    Location location;

@Before
public void before() throws Exception {
    location = new Location();
    location.setCodePays("FR");
    location.setCodeVille("Paris");
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: getWeatherForecast(Location location) 
* 
*/ 
@Test(expected = org.springframework.web.client.HttpClientErrorException.class)
public void testApiKeyOK() throws Exception {
    WeatherService weatherService = new WeatherService();
    Assert.assertNotNull(weatherService.getWeatherForecast(location));
    weatherService.setAPIKey("");
    weatherService.getWeatherForecast(location);
}


} 
