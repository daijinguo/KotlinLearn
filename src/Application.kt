import dai.kotlin.learn.IApps
import dai.kotlin.learn.basics.*
import dai.kotlin.learn.oop.Classes

fun main(args: Array<String>) {
    println("---------------------------------------------------")

    var app: IApps = RangeAndLoop()
    app.main(args)

    println("")
    println("")


    val array = arrayOf("/home/dai/workspace/idea/src/Application.kt1", "/tmp/null")
    app = Exceptions()
    app.main(array)

    println("")
    println("")

    app = Equality()
    app.main(args)

    println("")
    println("")

    app = Scope()
    app.main(args)

    println("")
    println("")

    app = When()
    app.main(args)

    println("")
    println("")

    app = Functions()
    app.main(args)

    println("")
    println("")

    app = Classes()
    app.main(args)


    println("---------------------------------------------------")
}