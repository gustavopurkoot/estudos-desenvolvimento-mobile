fun main() {

    print("Digite o texto: ")
    val texto = readLine() ?: ""
    val invertido = texto.reversed()

    // Radar - radaR

    if(texto.lowercase() == invertido.lowercase()) {
        print("Sim")
    }
    else{
        print("Não")
    }
}