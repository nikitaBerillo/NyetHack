private const val TAVERN_MASTER ="Taernul"
private const val TAVERN_NAME ="$TAVERN_MASTER's Folly"

fun visitTavern () {
narrate("$heroName enters $TAVERN_NAME")
    val patrons :List<String> = listOf("eli","mordos","sophie")
    println(patrons)
    return visitTavern()
}