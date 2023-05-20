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
  bukle()

def msg = "I was compiled by Scala 3. :)"

def bukle(): Unit = {
  var x = 0

  while (x < 10) {
    println(x)
    x = x + 1
  }
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