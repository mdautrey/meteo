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
 * @version 1.0
 * @since <pre>mai 19, 2016</pre>
 */
public class WeatherServiceTest {
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

    @Test(expected = org.springframework.web.client.HttpClientErrorException.class)
    public void testGetWeatherForecast() throws Exception {
        WeatherService weatherService = new WeatherService();
        Assert.assertNotNull(weatherService.getWeatherForecast(location));
        weatherService.setAPIKey("");
        weatherService.getWeatherForecast(location);
    }
} 
