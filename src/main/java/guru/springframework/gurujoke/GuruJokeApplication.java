package guru.springframework.gurujoke;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import guru.springframework.gurujoke.services.JokeServiceImpl;

@SpringBootApplication
public class GuruJokeApplication {

    public static void main(String[] args) {
        SpringApplication.run(GuruJokeApplication.class, args);
    }
}
