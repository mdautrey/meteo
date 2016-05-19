package meteo;

import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by mdautrey on 13/10/15.
 */
@Service public class WeatherService implements WeatherInterface {

    private static final String URI = "http://api.openweathermap.org/data/2.5/weather?q=%s,%s&APPID=%s";
    private static final String APIKey = "7c4212f5744f459bb53b3b0dbc87a12e";


    public final WeatherForecast getWeatherForecast(Location location) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
        String url = String.format(URI, location.getCodeVille(), location.getCodePays(), APIKey);// ATTENTION INJECTION DE CODE
        WeatherForecast weatherForecast = restTemplate.getForObject(url, WeatherForecast.class);
        return weatherForecast;
    }
}