package dai.kotlin.learn.oop

import dai.kotlin.learn.IApps


class Classes : IApps {

    override fun main(args: Array<String>) {
        val persion1 = Person("zhangsan", 29)
        val persion2 = Person("lisi")


        println("${persion1.name} is ${persion1.arge} years old")
        println("${persion2.name} is ${persion2.arge} years old")

        //val persion3 = Person("", 100)
        //val persion4 = Person("wangwu", 210)
        //println("${persion3.name} is ${persion3.arge} years old")
        //println("${persion4.name} is ${persion4.arge} years old")

        val persion2_1 = Persion2("san", "zhang", 14)
        println(persion2_1.getName() + " is " + persion2_1.getAge() + " years old")
    }
}

private class Person internal constructor(val name: String, val arge: Int?) {
    init {
        require(name.trim().isNotEmpty()) {
            "Invalid name"
        }

        if (null != arge) {
            require(arge in 0..199) {
                "Invalid age"
            }
        }
    }

    internal constructor(name: String) : this(name, null)
}

private class Persion2(firstName: String, lastName: String, howOld: Int?) {
    private val name: String = "$firstName,$lastName"
    private val age: Int? = howOld

    fun getName(): String = this.name
    fun getAge(): Int? = this.age
}