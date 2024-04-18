import java.io.File

fun main() {
    var lineNumber = 0
    val lines = File("techwich-course/resources/inputfile.txt").readLines()

    for (line in lines) {
        ++lineNumber
        println("Line $lineNumber: ${line}")
    }
}