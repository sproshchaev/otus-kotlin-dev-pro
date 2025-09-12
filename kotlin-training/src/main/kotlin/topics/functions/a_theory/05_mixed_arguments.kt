package topics.functions.a_theory

fun countNewSteps(
    currentStepCounter: Int,
    from: Int = 10,
    to: Int = 2
): Int {
    return currentStepCounter + from - to
}

fun main() {
    // Позиционные
    countNewSteps(5, 10)

    // Смешанные
    countNewSteps(5, to = 10)

    // Все именованные
    countNewSteps(currentStepCounter = 5, from = 10, to = 10)
}