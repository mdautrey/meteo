package meteo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by mdautrey on 07/10/15.
 */
@Controller
public class WeatherController {
    @Autowired private WeatherInterface weatherInterface;
    @RequestMapping(value={"/requestweather", "/", "/meteo"}, method=RequestMethod.GET)
    public String requestWeather(Model model) {
        model.addAttribute("location", new Location());
        return "requestweather";
    }
    @RequestMapping(value="/viewweather", method=RequestMethod.POST)
    public String viewWeather(@ModelAttribute Location location, Model model) {
        model.addAttribute("weatherforecast", weatherInterface.getWeatherForecast(location));
        model.addAttribute("location", location);
        return "viewweather";
    }
}