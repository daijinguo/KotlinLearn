package dai.kotlin.learn.basics

import dai.kotlin.learn.IApps
import java.io.File


class Equality : IApps {

    override fun main(args: Array<String>) {
        val aObj = File("/etc/apt/sources.list")
        val bObj = File("/etc/apt/sources.list")

        println("Same referential equality:" + (aObj === bObj).toString())
        println("Same value       equality:" + (aObj == bObj).toString())
    }

}