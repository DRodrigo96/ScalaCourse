package lectures.part1basics

object Functions extends App {

    def hello(): String = {
        return ("Hello, World!")
    }
    println(hello())

    def funcNoParameters(): Int = 42
    println(funcNoParameters())
    println(funcNoParameters)

    def recursiveFunction(cadena: String, n: Int): String = {
        if (n == 1) {
            cadena
        } else {
            cadena + recursiveFunction(cadena, n - 1)
        }
    }
    println(recursiveFunction("Hello", 3))

    def outerFunction(n: Int): Int = {
        def innerFunction(a: Int, b: Int): Int = a + b
        innerFunction(n, n-1)
    }
    println(outerFunction(5))

    // Exercises
    // 1. Greetings function --> greetingFunction(name)
    // 2. Factorial function --> factorialFunction(number)
    // 3. Fibonacci function --> fibonacciFunction(number)
    // 4. Test if number is prime --> primeFunction(number)

    // Solution 1:
    def greetingFunction(name: String): String = {
        return ("Hello, my name is: " + name)
    }
    println(greetingFunction("Rodrigo"))

    // Solution 2:
    def factorialFunction(number: Int): Int = {
        if (number <= 0) 1
        else number * factorialFunction(number-1)
    }
    println(factorialFunction(5))

    // Solution 3:
    def fibonacciFunction(number: Int): Int = {
        if (number <= 2) {
            1
        } else {
            fibonacciFunction(number-1) + fibonacciFunction(number-2)
        }
    }
    println(fibonacciFunction(8))

    // Solution 4:
    def primeFunction(number: Int): Boolean = {
        def auxFunction(n: Int): Boolean = {
            if (n <= 1) true
            else (number % n != 0 && auxFunction(n-1))
        }
        auxFunction(number/2)
    }
    println(primeFunction(7))
    println(primeFunction(4))
    println(primeFunction(10))
    println(primeFunction(13))

}















