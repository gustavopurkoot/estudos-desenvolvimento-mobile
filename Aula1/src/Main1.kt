fun main() {
    print("oi")
    println("oi")

    val nome = "João";
    // nome = "2";
    val sobre: String? = null;
    println("Nome $nome, Sobre $sobre")

    /*val ano = "2000" // input
    var idade = 2026 - ano.toInt()
    println("Idade $idade")*/

    /*val ano = "2000s" // input
    val anoInt = ano.toIntOrNull()

    if (anoInt != null) {
        var idade = 2026 - anoInt
        println("Idade $idade")
    }
     */

    val ano = "2000s" // input
    val anoInt = ano.toIntOrNull() ?: 22
        var idade = 2026 - anoInt
        println("Idade $idade")
}