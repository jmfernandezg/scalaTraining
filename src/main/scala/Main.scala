/*
*  Main stuff
* documentation
*
 */
@main def Main: Unit =
  println("Hello world!")
  println(msg) // comentario de una sola linea
  println(util.Properties.javaVendor)
  bloque()
  conditional()
  repetir()
  rangos()
  patterMatching()
  strings()


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