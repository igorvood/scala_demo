package com.example.demo

import com.example.demo.scala.Pet

//@SpringBootApplication
object DemoApplication {

    @JvmStatic
    fun main(args: Array<String>) {

        //        SpringApplication.run(DemoApplication.class, args);
        val pet = Pet()
        pet.print()
    }

}
