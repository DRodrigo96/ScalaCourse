package lectures.part1basics

object defaultArgs extends App {

    def trFact(n: Int, acc: Int=1): Int = {
        if (n <= 1) {
            acc
        } else {
            trFact(n-1, n*acc)
        }
    }

    val fact10 = trFact(10)
    println(fact10)

    def savePicture(width: Int=1920, height: Int=1080, format: String="jpg"): Unit = {
        println("Saving picture... " + width + "x" + height + " format: " + format)
    }

    savePicture(format="png", height=800, width=700)

}
