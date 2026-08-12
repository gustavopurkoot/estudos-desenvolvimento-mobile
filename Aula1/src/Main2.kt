fun main() {
    print("Ano: ")

    val anoInt = readLine()?.toIntOrNull() ?: 0
    val idade = 2026 - anoInt

    println("Idade: $idade")
}