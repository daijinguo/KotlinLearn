package dai.kotlin.learn.basics

import dai.kotlin.learn.IApps


class When : IApps {

    override fun main(args: Array<String>) {
        println("When: like switch")
        likeSiwthWhen(0)
        likeSiwthWhen(1)
        likeSiwthWhen(100)

        println("\nWhen: like if ... else")
        println("Is Int.MAX_VALUE:" + isMaxOrMin(Int.MAX_VALUE).toString())
        println("Is Int.MIN_VALUE:" + isMaxOrMin(Int.MIN_VALUE).toString())
        println("Is Ten          :" + isMaxOrMin(10).toString())

        println("\nWhen: constants can be combined together")
        println("Is 1  :" + isZeroOrOne(1).toString())
        println("Is 0  :" + isZeroOrOne(0).toString())
        println("Is 10 :" + isZeroOrOne(10).toString())

        println("\nWhen: isSingleDigit")
        println("Is 10 a single digit? :" + isSingleDigit(10).toString())
        println("Is -1 a single digit? :" + isSingleDigit(-1).toString())

        println("\nWhen: without args")
        whenWithOutArgs(13, 90)
        whenWithOutArgs(45, 45)
        whenWithOutArgs(99, -4)
    }

    private fun likeSiwthWhen(x: Int) {
        when (x) {
            0 -> println("This value is zero")
            1 -> println("This value is one")
            else -> println("This value is $x")
        }
    }

    private fun isMaxOrMin(x: Int): Boolean {
        val isZero = when (x) {
            Int.MAX_VALUE -> true
            Int.MIN_VALUE -> true
            else -> false
        }
        return isZero
    }

    private fun isZeroOrOne(x: Int): Boolean {
        return when (x) {
            0, 1 -> true
            else -> false
        }
    }

    private fun isSingleDigit(x: Int): Boolean {
        return when (x) {
            in -9..9 -> true
            else -> false
        }
    }

    private fun whenWithOutArgs(x: Int, y: Int) {
        when {
            x < y -> println("$x is less than $y")
            x > y -> println("$x is greater than $y")
            else -> println("$x is equal $y")
        }
    }
}