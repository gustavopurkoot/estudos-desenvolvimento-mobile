fun main() {

    val nome: String = "Maria"
    var Sobre: String? = "Silva"

    println("Nome $nome - Sobre $Sobre")

    val nomeCompleto = nome + Sobre
    var nomeCompleto2 = "$nome $Sobre Sauro"

    println(nomeCompleto)
    println(nomeCompleto.length)
    println(nomeCompleto[3])
    println(nomeCompleto.substring(3,8) )

    nomeCompleto2 = nomeCompleto2.replace("Silva", "Pereira")
    println(nomeCompleto2)

    println(nomeCompleto2.split( " "))
}