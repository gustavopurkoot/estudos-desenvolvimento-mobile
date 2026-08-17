data class Tarefa(val nome : String, val concluida : Boolean){

}

fun main(){
    val Tarefas = listOf(
        Tarefa("Estudar Kotlin", true),
        Tarefa("Fazer compras", false),
        Tarefa("Lavar o carro", true),
        Tarefa("Enviar relatório", false)
    )

    val concluidas = Tarefas.filter{ it.concluida }
    val Pendentes = Tarefas.filter{ !it.concluida }

    println("Tarefas Concluidas: \n $concluidas")
    println("Tarefas Pendentes: \n $Pendentes")
}