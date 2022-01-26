package be.koder.sandbox;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        final SpringApplication app = new SpringApplication(App.class);
        app.run(args);
    }
}
