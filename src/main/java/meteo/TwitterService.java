package meteo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * Created by mint on 19/05/16.
 */
@Aspect
@Component
public class TwitterService {
    @AfterReturning("execution(* getWeatherForecast(..))")
    public void sendTweet(JoinPoint joinPoint){
        System.err.println("\n\n**********\n\nAspect !\n" +
                "\n" +
                "**********\n" +
                "\n");
    }
}
