package topics.collections.a_theory

// Создание коллекций
fun main() {
    // List и MutableList
    val l1 = listOf(1, 2, 3)
    val l2 = mutableListOf(1, 2, 3)

    // Map и MutableMap
    val m1 = mapOf(
        1 to "str 1",
        2 to "str 2"
    )
    val m2 = mutableMapOf(
        1 to "str 1",
        2 to "str 2"
    )

    // Range и Progression
    val r1: IntRange = 1..10
    val p1: IntProgression = 100 downTo 10 step 2
    val p2: IntProgression = 1 until 10 step 3

    // Sequence
    val seq = sequenceOf(1, 2, 3)

    println("l1: $l1")
    println("l2: $l2")
    println("m1: $m1")
    println("m2: $m2")
    println("r1: $r1")
    println("p1: $p1")
    println("p2: $p2")
    println("seq: $seq")
}