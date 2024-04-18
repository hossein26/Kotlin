package challenges

/**
 * @author Hossein Amirbeigi
 *
 * Solution for the looping challenge inside the TechWich course.
 * Calculates the sum of all numbers from 100 to 100,000.
 */
fun main() {

    var sum = 0L
    for (i in 100..100000L) {
        sum += i
    }

    println(sum) // Result: 5000045050
}