fun executaOperacao(a: Int, b: Int, operacao: (Int, Int) -> Int) : Int{
    return operacao(a, b)
}

fun ola(){
    print("Olá")
}

fun main(){

    executaOperacao(2,2,) {
        x, y ->  x + y
    }

    executaOperacao(2,2,) { x, y -> x - y
    }


}