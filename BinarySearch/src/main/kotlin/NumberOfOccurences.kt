fun main() {
    var array = arrayOf(2,3,3,4,4,6,6,6,8)
    var value = 3;
    val firsIndex = findingOccurenceIndex(array,value)
    val lastIndex = findingLastOccurenceIndex(array,value)

    val occurrence = lastIndex-firsIndex + 1;
    println(occurrence)
}