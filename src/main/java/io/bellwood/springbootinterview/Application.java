package io.bellwood.springbootinterview;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        int a;
        a = 3;
        a = a + 2;
        System.out.print(a);
        }

}
