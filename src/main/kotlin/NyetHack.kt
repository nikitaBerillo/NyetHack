var heroName: String = ""

fun main() {


    heroName = promptHeroName()

    // changeNarratorMood()
    narrate("$heroName, ${(heroName)}, heads to the town square")
    visitTavern()
}

private fun promptHeroName(): String {
    narrate("A hero enters the town of Kronstadt. What is their name?") { message ->
        // Выводит message желтым цветом
        "\u001b[33;1m$message\u001b[0m"
    }
    val input = readLine()
    require(input != null && input.isNotEmpty()) {
        "The hero must have a name."
    }
    return input
}