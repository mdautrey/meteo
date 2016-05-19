package meteo;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Service;

/**
 * Created by mint on 19/05/16.
 */
@Aspect
@Service
public class TwitterService {
    @AfterReturning(pointcut = "execution(* getWeather(..))", returning = "retVal")
    public void sendTweet(Object retVal){
        System.out.println("Aspect !");
    }
}
