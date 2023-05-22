package com.jmfg.training.scala

object S07 extends App {
  println("Encapsulamiento")
  main2(Array("123"))
  nums()
  empleados()
  singletons()
  companions()
  cases()
  abstractas()
}

def abstractas(): Unit = {
  val ab1 = Abs("JOE")
  ab1.may()
  println(ab1.completo)
}

class Abs(nombre: String) extends Abs1(nombre, 44) {
  override def completo: String = "nombre $nombre edad $edad"
}

abstract class Abs1(val nombre: String, val edad: Int) {
  def may(): Unit = {
    println(nombre.toUpperCase())
  }

  def completo: String
}

def cases(): Unit = {
  val cc = ClaseCase("bill", 44)
  println(cc.toString)
  println(cc.hashCode())
  println(cc.copy(nombre = "joe"))
}

case class ClaseCase(nombre: String, edad: Int)

def companions(): Unit = {
  val p = Prof("xxx")
  println(p)
}

class Prof(nombre: String) {
  override def toString: String = s"Nombre $nombre"
}

object Prof {
  def apply(n: String): Prof = {
    new Prof(n)
  }


}

def singletons(): Unit = {
  Singleton.imprime()

  val single = new Singleton("especial")

}

class Singleton(val tipo: String) {
  override def toString: String = s"Tipo $tipo"

}

object Singleton {
  override def toString: String = this.getClass.getSimpleName

  def imprime(): Unit = {
    println(this)
  }

  def apply(): Unit = {

  }

}

def empleados(): Unit = {
  val em1 = Empleado()
  val em2 = Empleado("joe")
  val em3 = Empleado("yon", 22, "estudia")

  println(s"$em1\n $em2\n $em3")


}
def nums(): Unit = {
  val num = new Entero()
  num.valor = 4
  num.imprimir()
  num.multiplicar()
  num.imprimir()

  val dob = new Doble(4, "suma")
  dob.op = "#"


}
private def main2(args: Array[String]): Unit = {
  val prueba = new Prueba(s"juan ${args.mkString("[", ", ", "]")}", 22)
  println(prueba)

  val p2 = new P2()
  p2.apellido = "apellido"
  println(p2.toString)
}

class Prueba(nombre: String, edad: Int) {
  var apellido: String = _

  private def completo(): String = {
    s"$nombre $apellido [$edad]"
  }

  override def toString: String = completo()
}

class P2 extends Prueba("_", 0) {

}

trait Numero {
  var valor: Int = _

  def imprimir(): Unit

  def multiplicar(): Unit = {
    valor = valor * valor
  }
}

trait Imprimible {
  def imprimir(): Unit = {
    println("estoy en imprimible")
  }


}

class Entero extends Numero with Imprimible {
  override def imprimir(): Unit = println(s"Valor $valor")

  override def multiplicar(): Unit = {
    valor = valor * valor * valor
  }
}

class Doble(val valor: Int) {
  var op: String = _

  def this(valor: Int, operation: String) = {
    this(valor)
    this.op = operation
    println(s"VALOR ${this.valor}")
  }
}

class Empleado {
  println("primario")
  var nombre: String = _
  private var edad: Int = _
  private var rol: String = _

  override def toString: String = s"nombre $nombre edad $edad rol $rol"

  def this(nombre: String) = {
    this()
    this.nombre = nombre
  }

  def this(nombre: String, edad: Int, rol: String) = {
    this(nombre)
    this.edad = edad
    this.rol = rol
  }
}