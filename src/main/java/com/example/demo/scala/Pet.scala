package com.example.demo.scala

class Pet {


  def print() {

    var capital = Map("US" -> "Washington", "France" -> "Paris")
    capital += ("Japan" -> "Tokyo")
    println(s"Текущий класс => ${capital}")
  }

  def factorial(x: BigInt): BigInt =
    if (x == 0) 1 else x * factorial(x - 1)

}

