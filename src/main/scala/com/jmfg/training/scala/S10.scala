package com.jmfg.training.scala

import java.io.{File, PrintWriter}
import scala.io.Source

object S10 extends App {
  leer()
  escribir()
}

def escribir (): Unit = {
  var fiche =   new PrintWriter((new File("test.csv")))
  fiche.write("a,b,c,d")
  fiche.close()
}
def leer(): Unit = {

  val fichero = Source.fromFile("src/main/resources/datos.csv")
  val lineas = fichero.getLines().toList

  fichero.close()

  lineas.foreach(println)
}
