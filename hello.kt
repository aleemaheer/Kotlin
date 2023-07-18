fun main() {
    println("Hello, There!")
    println(addNumbres(1,2))
}

// Function to add two numbers
fun addNumbres(num1: Int, num2: Int): Int {
    return num1 + num2
}

val a: Int = 1  // immediate assignment
val b = 2   // `Int` type is inferred
val c: Int  // Type required when no initializer is provided
c = 3       // deferred assignment

// variable declared by var can be reassigned or modified
var x = 5 // `Int` type is inferred
x += 1