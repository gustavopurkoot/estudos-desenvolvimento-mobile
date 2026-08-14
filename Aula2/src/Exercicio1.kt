fun main(){

    print("Digite sua nota: ")
    val nota = readLine()?.toIntOrNull() ?: 0
    var conceito = ""

    when {
        nota >= 9 -> conceito = "A"
        nota >= 7 -> conceito = "B"
        nota >= 5 -> conceito = "C"
        nota >= 3 -> conceito = "D"
        else -> conceito = "F"
    }
    println("O Conceito é: $conceito")
}