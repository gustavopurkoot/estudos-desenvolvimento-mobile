class Pessoa (val nome: String) {

    init{

        println("~ nova pessoa criada com sucesso!")
    }

    constructor(nome: String, idade: Int) : this(nome) {

    }

    companion object { //tudo que estiver dentro será estático
        fun fazAlgumaCoisa(){
            println("faz alguma coisa!")
        }
    }

    fun Bomdia(){
        println("Bom dia eu sou o/a $nome")
    }
}