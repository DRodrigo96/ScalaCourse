package lectures.part1basics

object StringOps extends App {

    val myString: String = "Hello, I'm learning Scala"

    println(myString.charAt(2))
    println(myString.substring(7, 11))
    println(myString.split(",").toList)
    println(myString.startsWith("Hello"))
    println(myString.replace("Scala", "a new language"))
    println(myString.toLowerCase())
    println(myString.toUpperCase())
    println(myString.length)

    // Scala specifics
    val aNumberString: String = "45"
    val aNumber: Int = aNumberString.toInt

    println('a' +: aNumberString :+ 'z')
    println(myString.reverse)
    println(myString.take(2))

    println(aNumberString + 10)
    println(aNumber + 10)

    // String interpolations
    val name: String = "David"
    val age: Int = 25
    val greeting: String = s"Hello, my name is $name and I am $age years old"
    val anotherGreeting: String = s"My name is $name and I'll be ${age + 1} years old"

    println(greeting)
    println(anotherGreeting)

    // F-interpolation: for formatted strings
    val speed: Float = 1.2f
    val myth = f"$name%s can eat $speed%2.2f burgers per minute"

    println(myth)

    // Raw-interpolation
    println(raw"This is a \n newline 1")

    val escaped: String = "This is a \n newline 2"
    println(raw"$escaped")

}


