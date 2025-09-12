package topics.collections.a_theory

// Иерархия коллекций
fun main() {
    val list: List<Int> = listOf(1, 2, 3)
    val mutableList: MutableList<Int> = mutableListOf(1, 2, 3)

    val set: Set<String> = setOf("A", "B")
    val mutableSet: MutableSet<String> = mutableSetOf("A", "B")

    val map: Map<String, Int> = mapOf("A" to 1, "B" to 2)
    val mutableMap: MutableMap<String, Int> = mutableMapOf("A" to 1, "B" to 2)

    println("List: $list")
    println("MutableList: $mutableList")
    println("Set: $set")
    println("MutableSet: $mutableSet")
    println("Map: $map")
    println("MutableMap: $mutableMap")
}