package dai.kotlin.learn.basics

import dai.kotlin.learn.IApps

class RangeAndLoop : IApps {

    override fun main(args: Array<String>) {

        range()
        println("****************")

        container()
    }

    private fun range() {
        val aToZ = "a".."z"
        println("aToZ " + aToZ)

        println("")

        val countingDown = 20.downTo(0)
        for (a in countingDown) {
            print(a.toString() + " ")
        }
        println("")

        val rangeTo = 10.rangeTo(20)
        for (a in rangeTo) {
            print(a.toString() + " ")
        }
        println("")

        val countingDownEvenNumber = (2..10).step(2).reversed()
        for (a in countingDownEvenNumber) {
            print(a.toString() + " ")
        }
        println("")
    }

    private fun container() {
        val list = listOf(1, 2, 3, 4, 5)
        for (k in list) {
            print(String.format("%02d ", k))
        }
        println("")

        val set = setOf(7, 4, 0, 23, 20)
        for (k in set) {
            print(String.format("%02d ", k))
        }
        println("")

        val oneToTen = 1..10
        for (k in oneToTen) {
            for (j in 1..10) {
                print(String.format("%03d ", k * j))
            }
            println("")
        }
        println("")

        val array = arrayOf("hello", "good", "morning")
        for (index in array.indices) {
            println("Element $index is ${array[index]}")
        }
    }
}