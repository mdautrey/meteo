package meteo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by mdautrey on 07/10/15.
 */
@Controller
public class WeatherController {
    @RequestMapping(value={"/requestweather", "/", "/meteo"}, method=RequestMethod.GET)
    public String requestWeather(Model model) {
        model.addAttribute("location", new Location());
        return "requestweather";
    }
}
    @RequestMapping(value="/viewweather", method=RequestMethod.POST)
    public String viewWeather(@ModelAttribute Location location, Model model) {
        //WeatherForecast weatherForecast = weatherInterface.getWeather(location);
        //model.addAttribute("weatherforecast", weatherForecast);
        model.addAttribute("weatherforecast", new WeatherForecast());
        model.addAttribute("location", location);
        return "viewweather";
    }