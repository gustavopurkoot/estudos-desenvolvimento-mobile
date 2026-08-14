fun sub(a: Int, b: Int) = a - b

fun soma (a: Int, b: Int): Int /* tipo da função */ {

    return a + b
}

fun bemVindo(nome : String){
    println("Bem Vindo: $nome")
}
fun main() {
    println(soma(2, 3))
    bemVindo("Gustavo")
}