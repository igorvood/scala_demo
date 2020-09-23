package com.example.demo;

import com.example.demo.scala.Pet;

//@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

//        SpringApplication.run(DemoApplication.class, args);
        Pet pet = new Pet();
        pet.print();
    }

}
