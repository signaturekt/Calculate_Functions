fun main(args: Array<String>) {
    val num1 = 3
    val num2 = 6
    val num3 = 9

    println("The values I'm working with are: ${num1}, ${num2}, and ${num3}")
    println("The sum is: ${sum(num1, num2, num3)}")
    println("The average is: ${average(num1, num2, num3)}")
    println("The product is: ${product(num1, num2, num3)}")
    println("The smallest is: ${smallest(num1, num2, num3)}")
    println("The largest is: ${largest(num1, num2, num3)}")
}

fun sum(x: Int, y: Int, z: Int): Int {
    return x + y + z
}

fun average(x: Int, y: Int, z: Int): Float {
    return sum(x, y, z)/3f
}

fun product(x: Int, y: Int, z: Int): Int {
    return x * y * z
}

fun smallest(x: Int, y: Int, z: Int): Int {
    var smallestNum = x
    if(x > y) {
        smallestNum = y
    }
    if(y > z) {
        smallestNum = z
    }
    return smallestNum;
}

fun largest(x: Int, y: Int, z: Int): Int {
    var largestNum = x
    if(x < y) {
        largestNum = y
    }
    if(y < z) {
        largestNum = z
    }
    return largestNum;
}