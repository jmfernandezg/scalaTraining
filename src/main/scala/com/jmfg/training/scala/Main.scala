package com.jmfg.training.scala

import scala.+:
import scala.collection.mutable.{ArrayBuffer, ListBuffer}

/**
 * Main stuff
 * documentation
 *
 */
@main def Main(): Unit = {
  println("Hello world!")
  println(msg) // comentario de una sola linea
  println(util.Properties.javaVendor)
  bloque()
  conditional()
  repetir()
  rangos()
  patterMatching()
  strings()
  listas()
  arrays()
  sets()
  maps()
  funciones()
}

def funciones(): Unit = {
  def f1 = println("HOLA")

  def f2() = println("BYE")

  f1
  f2()

  def f3(x: Int, y: Int): Int = x + y

  println(f3(3, 4))

  println(f3(y = 3, x = 4))

  def f4(x: Int = 6, y: Int = 2) = x * y

  println(f4())

  def f5(x: Int*) = x.product

  println(f5(1, 2, 3, 5))
}
def maps(): Unit = {
  val map1 = Map((1, "uno"), (2, "dos"), (3, "tres"))
  val map2 = Map(4 -> "cuatro", 5 -> "cinco")

  val map3 = map1 ++ map2

  println(map3)
}

def sets(): Unit = {
  val set1 = Set("1", "3")
  val set2 = Set("2", "3")
  println(set1 ++ set2)
}

def arrays(): Unit = {
  val arr: Array[String] = new Array(3)
  arr(0) = "ok"
  arr(2) = "NO"
  arr.foreach(println)

  val arr2: Array[Int] = (1 to 19).toArray[Int]
  val arr3 = new Array[Int](arr2.length)
  Array.copy(arr2, 0, arr3, 0, arr2.length)
  val arr4 = Array.concat(arr2, arr3)

  arr4.foreach(print(_))
  val arr5 = ArrayBuffer(1, 3, 4)
  arr5.append(5)
  arr5 += 6
  arr5 ++= List(7, 8, 9)
  for (elem <- arr5) {
    println(elem)
  }
}
def listas(): Unit = {
  val lista = List("uno", "dos", "tres")

  val lista2: Seq[Any] = List(1, "dos", true)

  lista.foreach(println)
  println(lista2(2))

  var lista3: Seq[Int] = List.tabulate(3)(n => n.^(2))

  lista3 = lista3 :+ 24

  lista3.foreach(println)

  val lista4 = ListBuffer(1, 2, 3, 4)
  lista4.addOne(5)
  lista4 :+ 6
  lista4.append(0)

  for (x <- lista4) {
    println(x)
  }
  lista4 -= 0

  lista4.foreach(println(_))
}

def msg = "I was compiled by Scala 3. :)"

def repetir(): Unit = {
  var x = 0

  while (x < 10) {
    println(x)
    x = x + 1
  }

}

def strings(): Unit = {
  val nombre = "JONAH"
  println(s"TE llamas $nombre")
}
def rangos(): Unit = {
  val x1 = 1 to 10
  val x2 = 1 until 10
  println(s"x1: $x1  x2: $x2")
}

def patterMatching(): Unit = {
  def col = "ROJO"

  col match
    case "ROJO" => println("Es colorado")
    case "BLUE" => println("Es azul")
    case _ => println(" desconocido")
}
def conditional(): Unit = {
  if (util.Properties.javaVersion != "17")
    println("mas de 11r")
  else
    println("mas de 11r")

}
def bloque(): Unit = {
  println("x")
  {
    println("x1")
    println("x2")

  }

}