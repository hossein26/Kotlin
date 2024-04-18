package challenges

/**
 * @author Hossein Amirbeigi
 *
 * Solution for the novice challenge inside the TechWich course.
 * Creates a list of book titles, loops over it and, if the title contains 'e', prints each char of the title in a line.
 */
fun main() {

    val books = arrayListOf("Kotlin in Action", "Kotlin For Android Developers", "The Phoenix Project")

    for (book in books) {
        if (book.contains('e')) {
            for (character in book) {
                println(character)
            }
        }
        println()
    }
}