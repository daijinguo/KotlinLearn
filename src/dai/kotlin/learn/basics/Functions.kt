package dai.kotlin.learn.basics

import dai.kotlin.learn.IApps

class Functions : IApps {

    override fun main(args: Array<String>) {

        println("the largest number[12, 23, 6] is " + largestNumber(12, 23, 6))

        printLessThanTwo()

        printUntilStop()
    }

    private fun largestNumber(a: Int, b: Int, c: Int): Int {
        fun largest(a: Int, b: Int): Int {
            if (a > b)
                return a
            else
                return b
        }
        return largest(largest(a, b), largest(b, c))
    }

    private fun printLessThanTwo() {
        val list = listOf(1, 2, 3, 4, 5, 6)
        list.forEach(fun(x) {
            if (x < 3) println("$x")
            else return
        })
        println("This line will still execute")
    }

    private fun printUntilStop() {
        val list = listOf("a", "b", "c", "stop", "d")
        list.forEach stop@ {
            if (it == "stop") return@stop
            else print("$it ")
        }
        println()
    }

}
