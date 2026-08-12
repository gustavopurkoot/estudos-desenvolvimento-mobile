fun main() {
    print("Ano: ")
    val ano = readLine()?.toIntOrNull() ?: 0

    val idade = 2026 - ano

    println("$ano")

}