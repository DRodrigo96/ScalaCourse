package lectures.part1basics

import scala.annotation.tailrec

object Recursion extends App {

    // Version with StackOverflowError
    def factorial(n: Int): Int = {
        if (n <= 1) {
            return (1)
        } else {
            println("Computing factorial of " + n + ", I first factorial of " + (n-1))
            val result = n * factorial(n-1)
            println("Computing factorial of " + n)
            return (result)
        }
    }

    // println(factorial(10))
    // println(factorial(5000)) // StackOverflowError

    // Version with inner function
    def anotherFactorial(n: Int): BigInt = {
        @tailrec
        def factHelper(x: Int, accumulator: BigInt): BigInt =
            if (x <= 1) accumulator
            else factHelper(x-1, x*accumulator) // Tail recursion: use recursion call as last expression

        factHelper(n, 1)
    }

    // println(anotherFactorial(5))
    // println(anotherFactorial(5000))

    // Version with unique function
    @tailrec
    def fHelper(x: Int, accumulator: BigInt): BigInt =
        if (x <= 1) accumulator
        else fHelper(x-1, x*accumulator) // Tail recursion

    // println(fHelper(5, 1))
    // println(fHelper(5000, 1))

    // When needs loops, use tail recursion

    /*
    1. Concatenate a String of n items.
    2. isPrime function with tail recursion.
    3. Fibonacci with tail recursion.
     */

    @tailrec
    def concatenateTairec(aString: String, n: Int, accumulator: String): String = {
        if (n <= 0) accumulator
        else concatenateTairec(aString, n-1, aString+accumulator)
    }

    // println(concatenateTairec("Hello", 3, ""))

    def isPrime(n: Int): Boolean = {
        @tailrec
        def isPrimeTailrec(t: Int, isStillPrime: Boolean): Boolean = {
            if (!isStillPrime) false
            else if (t <= 1) true
            else isPrimeTailrec(t-1, n%t != 0 && isStillPrime)
        }
        isPrimeTailrec(n/2, true)
    }

    // println(isPrime(2003))
    // println(isPrime(629))
    // println(isPrime(11))

    def fibonacci(n: Int): Int = {
        @tailrec
        def fiboTailrec(i: Int, last: Int, nextToLast: Int): Int = {
            if (i >= n) last
            else fiboTailrec(i+1, last+nextToLast, last)
        }
        if (n <= 2) 1
        else fiboTailrec(2, 1, 1)
    }

    println(fibonacci(8))
}
