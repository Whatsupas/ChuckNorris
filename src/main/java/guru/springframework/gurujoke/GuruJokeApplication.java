package guru.springframework.gurujoke;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import guru.springframework.gurujoke.services.JokeServiceImpl;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:chuck-config.xml")
public class GuruJokeApplication {

    public static void main(String[] args) {
        SpringApplication.run(GuruJokeApplication.class, args);
    }
}
