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

     val pedidos: MutableMap<Int, Double> = mutableMapOf(
         Pair(1, 20.0),
         Pair(2, 34.0),
         3 to 50.0
     )
    println(pedidos) //ler todos eles
    //pegar um unico elemento aqui ele não pega a posição ele pede a chave
    val pedido:Double? = pedidos[1]
    pedido?.let {
        println("pedido ${it}")
    }

    //corrigimos o aviso de shadowed
    for (p:Map.Entry<Int, Double> in pedidos){
        println("numero do pdido: ${p.key}")
        println("numero do pdido: ${p.value}")
    }

    //Inserção são similares
    pedidos[4] = 70.0
    println(pedidos)
    pedidos.put(5, 80.0)
    println(pedidos)

    //Atualização
    pedidos[1] = 100.0
    println(pedidos)

    //Ao utilizar esse comportamento so é possivel adicionar caso o pedido não exista
    pedidos.putIfAbsent(6, 200.0)
    println(pedidos)

    //remoção
    pedidos.remove(6)
    println(pedidos)
    pedidos.remove(3, 100.0) //verifica a chave e valor para remover
    println(pedidos)

}

