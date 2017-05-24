package dai.kotlin.learn.basics

fun isString(any: Any): Boolean = any is String

fun printStringLength(any: Any) {
    if (any is String) {
        println(any.length)
    }
}

fun isEmptyString(any: Any): Boolean {
    return any is String && any.length == 0
}

fun isNotStringOrEmpty(any: Any): Boolean {
    return any !is String || any.length == 0
}