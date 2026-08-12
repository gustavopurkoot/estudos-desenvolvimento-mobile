fun main() {

    print("Digite um texto: ")
    var texto = readLine() ?: "sem texto"

    print("Digite o indice inicial: ")
    var indiceInicial = readLine()?.toIntOrNull() ?: 0

    print("Digite o indice final: ")
    var indiceFinal = readLine()?.toIntOrNull() ?: texto?.length

    println(texto?.substring(indiceInicial, indiceFinal!!) )
}