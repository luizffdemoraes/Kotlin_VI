package br.com.alura.teste

fun testaComportamentosMap() {
    val pedidos: MutableMap<Int, Double> = mutableMapOf(
        Pair(1, 20.0),
        Pair(2, 34.0),
        3 to 50.0,
//        4 to null,
        5 to 100.0,
        6 to 80.0
    )

    //similares
    val valorPedido: Double? = pedidos[1]
    val valorPedidos: Double? = pedidos.get(4)
    println(valorPedido)
    println(valorPedidos)

    //para trabalhar com nulos e uma maneira de recuperar valor caso a chave não exista ele traz uma exception
//    val valorPedidosNulos: Double? = pedidos.getValue(4)
//    println(valorPedidosNulos)

    val messagem: Double? = pedidos.getOrElse(1) {
        0.0
    }
    println(messagem)
    //que é esse get or default, que realmente vai devolver um valor que seja compatível
    // ao valor do nosso mapa, mas que seja padrão.
    println(pedidos.getOrDefault(1, -1.00))

    //Acessar todas as chaves
    println(pedidos.keys)

    for (numero in pedidos.keys) {
        println("Pedido $numero")
    }

    //Acessar todos os valores
    println(pedidos.values)

    for (valor: Double? in pedidos.values) {
        println("Valor do pedido: $valor")
    }

    //Criando filtros no map
    val peidosFiltrados: Map<Int, Double> = pedidos.filter { (numero, valor) ->
        numero % 2 == 0 && valor > 70.0

    }

    println(peidosFiltrados)


    val teste = pedidos.filterValues { valor ->
        valor > 70.0
    }

    println(teste)

    val pedidosPares = pedidos.filterKeys { numero ->
        numero % 2 == 0
    }

    println(pedidosPares)

    /*
    Plus and Minus Operator mesmo comportamento de soma  e subitração dos collections e set
    - é restrito ao uso do Pair ou mapOf
    adição
     */
    println(pedidos + Pair(7, 90))
    println(pedidos + mapOf(8 to 20.0, 9 to 150.0))
    println(pedidos)

    //remoção
    println(pedidos - 6)
    println(pedidos - listOf(6, 5))
    println(pedidos)

    /*
      plus assign e o minus assign, que mais abaixo vai falar mais a respeito,
      porque trata-se de uma operação apenas com mutables maps,
      que só para dar um spoiler é uma técnica na qual a gente consegue
      realmente adicionar de verdade utilizando esses operadores, ou remover de verdade
      da fonte original de dados.
     */

    //funções similares para inserção
    pedidos.putAll(setOf<Pair<Int, Double>>(8 to 20.0, 9 to 150.0, 8 to 30.0))
    pedidos += listOf<Pair<Int, Double>>(8 to 20.0, 9 to 150.0, 8 to 30.0)
    println(pedidos)

    //funções similares para remoção
    pedidos.keys.remove(1)
    println(pedidos)

    pedidos.values.remove(50.0)
    println(pedidos)

    pedidos.values.remove(100.0)
    println(pedidos)

    //E considerado só a chave
    pedidos -= 6
    println(pedidos)
}