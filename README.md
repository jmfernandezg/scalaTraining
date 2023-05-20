## sbt project compiled with Scala 3

### Usage

This is a normal sbt project. You can compile code with `sbt compile`, run it with `sbt run`, and `sbt console` will start a Scala 3 REPL.

For more information on the sbt-dotty plugin, see the
[scala3-example-project](https://github.com/scala/scala3-example-project/blob/main/README.md).

---

## Scala University

https://udemy.com/course/scala-desde-cero/learn/lecture/21473418#questions

### Sección 2 - Intro

#### Clase 04 - Intro

- Martin Odersky 2004
- Extensión de Funnel, Programación funcional
- Propósito general
- Tipos estáticos
    - Los tipos se definen en la compilación
- Se compila a bytecode de Java
- Orientado a objetos
- Utiliza clases y traits
    - traits son interfaces
- Esta orientado a la programación funcional
    - las funciones son fist class values
- Puede ejecutar cualquier librería de java


```mermaid

flowchart LR
  C[Codigo Fuente Scala] -->B[Codigo Fuente Bytecode]
  B --> JVM
  ```


#### Clase 5. Diferencia con Java

- Todos los tipos son objetos, no hay primitivos
- Las cadenas se convierten en colecciones de caracteres
- Inferencia de tipos
    - Deduce en tiempo de compilación los tipos
- Scala REPL
    - Herramienta modo línea de comandos
- Funciones anidadas
- Imports
    - Se pueden hacer imports en cualquier parte del código
- El guion bajo se utiliza de forma similar al asterisco
- Mejor legibilidad y sencillez en el código
- Mayor curva de aprendizaje
-


#### Clase 6. Recorrido por la web de Scala

- https://www.scala-lang.org/



#### Clase 7. Descarga software de scala

- Descargar Coursier
- https://www.scala-lang.org/download/


#### Clase 8. Instalación Manual

- Dede Coursier
    - cs install scala:3.2.2 && cs install scalac:3.2.2.
- https://www.scala-lang.org/download/3.2.2.html


#### Clase 9. Instalación IDEA

- https://www.jetbrains.com/idea/


#### Clase 10. Nuevo Proyecto

- IntelliJ IDEA: New Project -> Scala

--- 

### Sección 3


#### Clase 11. REPL

- Revisar la version scala -version
  - Welcome to Scala 3.2.2 (17, Java OpenJDK 64-Bit Server VM).
- REPL: `scala`

#### Clase 12. Tipos de datos
 
- Any es el tipo de raíz
- AnyVal
- AnyRef: `java.lang.Object`
- Tipo `Unit` es el equivalente a `void`: ningún valor
- Tipo `NULL` es para compatibilidad


```mermaid

flowchart TB
  Any -->AnyVal
  Any -->AnyRef
  AnyVal-->Double
  AnyVal-->Float
  AnyVal-->Long
  AnyVal-->Int
  AnyVal-->Short
  AnyVal-->Unit
  AnyVal-->Byte
  AnyVal-->Boolean
  AnyVal-->Char
  Char-->Nothing
  Boolean-->Nothing
  Byte-->Nothing
  Unit-->Nothing
  Short-->Nothing
  Int-->Nothing
  Long-->Nothing
  Float-->Nothing
  Double-->Nothing
  AnyRef-->List
  AnyRef-->Option
  AnyRef-->YourClass
  Option-->Null
  YourClass-->Null
  List-->Null
  Null-->Nothing
  ```


#### Clase 13. `val` y `var`
 
- La inferencia de tipos es automática en la mayor parte de las ocasiones
- Las variables `val` son inmutables
- Las variables `var` si se pueden modificar

#### Clase 14. Lazy
 
- Variables que se cargan en memoria solo cuando son utilizadas
- La declaración es `lazy val` 

```scala
lazy val division  = 1 / 0

print(division)  // se evalua

```

#### Clase 15. Variables y Constantes
 
- Utilizar `util.Properties`
    - Java version: `util.Properties.javaVersion`
    - Java vendor: `util.Properties.javaVendor`
- En el repl 
  - Tipo de una variable (v1) `:type v1` 
  - Ayuda `:help` 
  - Salir `:quit` 


#### Clase 16. Comentarios
 
- Doble Barra `//` comentario de una sola linea
- Barra asterisco `/* */` comentario multi linea
- Comentario de documentación: un asterisco en cada línea

```scala
/*
* doc1
* doc2
*/
```

#### Clase 17. Bloques
 
- Se utilizan las llaves `{}`

#### Clase 18. Operadores
 
- Relacionales
  - Un solo igual `=` es asignación
  - Dos iguales `==` es igualdad
  - `>, <, =>, <=`
- Logicos
  - `&&` and
  - `||` or
  - `!` not

#### Clase 19. Condicionales `if`
 
- if si una condición es verdadera
- else si la condición no es verdadera
- Se puede utilizar como una expresión 

```scala

val edad = if (x > 10) "m" else "n"

```
#### Clase 20. Bucles
 
- while mientras se cumpla la condición
- for tiene distintas variaciones

#### Clase 21. Rangos
 
- 1 to 10 llega hasta el 10
- 1 until 10 llega hasta el 9


#### Clase 22. Iniciar variables por defecto
 
- Se utiliza un valor predefinido con `_`
- Tiene que ser un `var`

```scala

var gg: Int =_
```

#### Clase 23. Pattern matching #1
 
  Se utiliza match y `case`

#### Clase 24. Pattern matching #2
 
- `CASE _ =>` es el default
- Se pueden usar condicionales

#### Clase 25. Strings
 
- `.last` ultimo carácter
- `.head` primer carácter
- `.foreach` por cada carácter

#### Clase 26. String Interpolation
 
- Se interpola con "s" antes de la cadena
- `s"Cadena $variable"`

```scala

val nombre = "Juan"

println(s"Te llamas $nombre")

```

#### Clase 27. Números
 
- Int.MinValue Int.MaxValue
- .

--- 

### Sección 4: Colecciones

#### CLase 28. Intro

-

#### CLase 29. List

-

#### CLase 30. Operaciones con List

-

#### CLase 31. Operaciones con List #2

-

#### CLase 32. ListBuffer

-

#### CLase 33. Array

-

#### CLase 34. ArrayBuffer

-

#### CLase 35. Set

-

#### CLase 36. Map

-

