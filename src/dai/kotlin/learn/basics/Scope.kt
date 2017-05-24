package dai.kotlin.learn.basics

import dai.kotlin.learn.IApps
import java.io.IOException


class Scope : IApps {
    override fun main(args: Array<String>) {

        val building = Building("Shanghai, Pudong New area")
        building.Reception("110->120").printAddress()

        val success = try {
            true
        } catch (e: IOException) {
            false
        }
    }
}


private class Building(val address: String) {

    inner class Reception(telphone: String) {

        fun printAddress() = println(this@Building.address)

    }
}