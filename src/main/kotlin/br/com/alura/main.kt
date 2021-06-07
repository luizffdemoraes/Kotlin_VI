package br.com.alura

fun main() {
//    testaCopia()
//    testaSet()

    /*
        Detalhe o é um Collection porem ele não herda de Collection e Iterable
        Map - ou dicionário - é um conjunto de chave e valor com chaves unicas
        cada uma mapeia um valor. Sua grande utilidade e sua conexão logica
        Exemplo empregado ID e posição na empresa
        Alternativa ao Pair é o to ele é um infix ele perde performa em casos de muitos valores
     */

     val pedidos:Map<Int, Double> = mapOf(Pair(1, 20.0), Pair(2, 34.0), 3 to 50.0)
    println(pedidos) //ler todos eles
    //pegar um unico elemento aqui ele não pega a posição ele pede a chave
    val pedido:Double? = pedidos[1]
    pedido?.let {
        println("pedido ${it}")
    }
    for (pedido:Map.Entry<Int, Double> in pedidos){
        println("numero do pdido: ${pedido.key}")
        println("numero do pdido: ${pedido.value}")
    }

}

