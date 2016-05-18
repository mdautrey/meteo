package meteo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



/*
http://docs.spring.io/spring-boot/docs/current/reference/html/using-boot-using-springbootapplication-annotation.html
Many Spring Boot developers always have their main class annotated with @Configuration,
@EnableAutoConfiguration and @ComponentScan. Since these annotations are so frequently
used together (especially if you follow the best practices above), Spring Boot provides a
convenient @SpringBootApplication alternative.
The @SpringBootApplication annotation is equivalent to using @Configuration,
@EnableAutoConfiguration and @ComponentScan with their default attributes
 */


/*
http://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/CommandLineRunner.html
public interface CommandLineRunner
Interface used to indicate that a bean should run when it is contained within a SpringApplication.
Multiple CommandLineRunner beans can be defined within the same application context and
can be ordered using the Ordered interface or @Order annotation.
https://mhdevelopment.wordpress.com/2014/02/09/bootstrap-an-application-with-spring-boot-part1-command-line/
 */

@SpringBootApplication
public class Application {

    private static final String URI = "http://api.openweathermap.org/data/2.5/weather?q=%s,%s";

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}