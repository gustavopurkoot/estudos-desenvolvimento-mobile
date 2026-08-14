fun main() {

    val numeros = listOf(10, 25, 40, 5, 80)

    val dobrados = numeros.map { numero -> numero * 2 }

    println("Map:")
    println(dobrados)

    val maioresQue30 = numeros.filter { numero -> numero > 30 }

    println("\nFilter:")
    println(maioresQue30)

    println("\nForEach:")
    numeros.forEach { numero ->
        println("Número: $numero")
    }
}