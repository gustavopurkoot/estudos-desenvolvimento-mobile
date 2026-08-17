data class Usuario(val usu: String, val senha: String){

}

fun main(){

    val p1 = Pessoa("João", 22)
    val u1 = Usuario("jo1", "21345")

    println(p1.nome)
    p1.Bomdia()
    
    Pessoa.fazAlgumaCoisa()
}