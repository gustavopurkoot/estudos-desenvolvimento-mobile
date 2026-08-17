open class Animal(val nome: String){

    open fun fazSom(){
        println("o animal fez um som")
    }
}

class Cachorro(nome : String) : Animal("nome do animal") {
    override fun fazSom(){
    println("au au au")

    }
}

fun main(){
    val animal = Animal("Mimosa")
    val dog = Cachorro("Auau")

    println(dog.nome)
    dog.fazSom()
}