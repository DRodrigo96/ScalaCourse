package lectures.part1basics

object Expressions extends App {

    // Operators
    val x = 1 + 2
    println(x)

    // Identidades
    println(1 == 1)

    // Operator incremento
    var variable: Int = 0
    variable += 1
    println("Mi variable", variable)

    // Conditions
    val condicion: Int = if (true) 5 else 3
    println("condicion", condicion)

    // Bucles
    var i = 0
    while (i < 10) {
        println(i)
        i += 1
    }

    // None
    var nada: None.type = None
    println(nada)

    // Unit
    val unidad: Unit = (variable = 3)
    println(unidad)

    // Code blocks
    val bloque = {
        val y = 2
        val z = y + 1
        if (z > 2) "abc" else "xyz"
    }
    println(bloque)

    val valor = {
        2 < 3
    }
    println(valor)

    val valCodicional = {
        if (valor) 123 else 456
        45.9
    }
    println(valCodicional)
}
