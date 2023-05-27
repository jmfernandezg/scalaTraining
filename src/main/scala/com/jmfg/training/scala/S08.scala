package com.jmfg.training.scala

object S08 extends App {
  println(f1(4, 5))
  println(pares(List(1, 2, 3, 5, 6, 7, 8, 9)))
  println(f2(f1, 5, 5))
  println(cuadrado(20))

  println(m1(40))

  val x = calc(10, 20, _: Int)
  println(x(30))
  println(x(2))

  private val sum0 = suma(4)
  println(sum0(4))
  println(suma(5)(6))

  private val c1 = curry(4)
  println(c1(5))
  println(curry(6)(7))

  numero = 50
  println(closum(100))
}

var numero = 12

val closum = (x: Int) => {
  numero += 20
  x + numero
}
def curry(x: Int): Int => Int = (y: Int) => x * y
def suma(x: Int)(y: Int) = x + y
def calc(x: Int, y: Int, z: Int) = x * y * z


def m1 = {
  (x: Int) => x * x
}


val cuadrado = (numero: Int) => numero * numero
def f2 = (fun: (Int, Int) => Int, x: Int, y: Int) => fun(x, y)
def f1 = (x: Int, y: Int) => x * y

val pares = (l: List[Int]) => l.filter(_ % 2 == 0)

