fun main() {
    println("Hello, There!")
    val a: Int = 1  // immediate assignment
    val b = 2   // `Int` type is inferred
    val c: Int  // Type required when no initializer is provided
    c = 3       // deferred assignment

    // variable declared by var can be reassigned or modified
    var x = 5 // `Int` type is inferred
    x += 1
    // println(addNumbres(1,2))
    runConditions(x, c)
}

// Function to add two numbers
fun addNumbres(num1: Int, num2: Int): Int {
    return num1 + num2
}

fun runConditions(x: Int, c: Int) {
    if (x > c) {
        println("$x is greater than $c")
    } else {
        println("$c is greater than $x")
    }
}
