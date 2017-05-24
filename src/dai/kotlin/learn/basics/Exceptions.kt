package dai.kotlin.learn.basics

import dai.kotlin.learn.IApps
import java.io.File
import java.io.IOException
import java.nio.file.Files
import java.nio.file.Path


class Exceptions : IApps {

    override fun main(args: Array<String>) {
        val file = File(args[0])

        try {
            readFile(file.toPath())
        } catch (e: Exception) {
            println("Error info: ${e.message}")
        }

    }

    private fun readFile(path: Path): Unit {
        val input = Files.newInputStream(path)

        try {
            var byte = input.read()
            while (byte != -1) {
                println(byte)
                byte = input.read()
            }
        } catch (e: IOException) {
            println("error reading from file. Error was ${e.message}")
        } finally {
            input.close()
        }
    }


}