package com.jmfg.training.scala

object S09 extends App {

  options()
  excepciones()
  sobre()
}

// sobrecarga

def sobre(): Unit = {
  class Algo {
    def nada(): Unit = {
      println("hey!")
    }

    def nada(x: String): Unit = {
      println(s"hey! ${x}")
    }

  }

  val al = new Algo()
  al.nada()
}
// exceptions try catch

def excepciones(): Unit = {

  def dividir(a: Int, b: Int): Unit = {
    try {
      print(a / b)
      val arr = Array(1, 2, 3)
      arr(99)
    } catch {
      case ex: ArithmeticException => println(s"error! $ex")
      case tr: Throwable => println(s"desconocido $tr")
    } finally {
      println("fichero se cierra oh!")
    }

  }

  def excepcionar(): Unit = {
    throw new Exception("algo malo paso")
  }

  dividir(8, Integer.MAX_VALUE)
  //excepcionar()
}
// Options

def options(): Unit = {
  val lista = List("a", "b", "c", "d")
  val busqueda = lista.find(_ == "x")
  println(busqueda)
  println(lista.find(_ > "a"))
  println(lista.find(_ > "b").get)
  println(lista.find(_ > "d").getOrElse("xxx"))
}
