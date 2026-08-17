open class Funcionario(val nome: String, val salario: Double){

    open fun CalcularBonus(salario : Double) : Double{
        return salario * 0.1;
    }
}

class Gerente(nome : String, salario : Double) : Funcionario(nome, salario){

    override fun CalcularBonus(salario: Double) : Double{
        return salario * 0.15;
    }
}

fun main(){

    val Funcionarios = listOf(
        Funcionario("Carlos", 3000.0),
        Funcionario("João", 2500.0),
        Gerente("Maria", 5000.0),
        Gerente("Pedro", 4500.0)
    )
}