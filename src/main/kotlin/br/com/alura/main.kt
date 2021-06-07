package br.com.alura

fun main() {
//    testaCopia()
//    testaSet()
//    testaMap()
//    testaComportamentosMap()

    val pedidos = listOf(
        Pedido(1,20.0 ),
        Pedido(2,60.0 ),
        Pedido(3,30.0 ),
        Pedido(3,70.0 )
    )

    println(pedidos)

    //associação transformando em um map podemos usar o associate ou o associateBy é mais resumido
    val pedidosMapeados: Map<Int, Pedido> = pedidos.associateBy { pedido: Pedido ->
        pedido.numero
//        Pair(pedido.numero, pedido)
    }

    println(pedidosMapeados)
    println(pedidosMapeados[1])

    //associateWith faz o inverso do associate by
    val pedidosFreteGratis: Map<Pedido, Boolean> = pedidos.associateWith { pedido ->
        pedido.valor > 50.0
    }

    println(pedidosFreteGratis)
    println(pedidosFreteGratis[Pedido(numero=1, valor=20.0)])

    /*
    O que a gente tem que determinar é o valor sendo maior do que 50,
    ele vai devolver como verdadeiro e não sendo falso. Por isso é um boolean.
    Vamos ver o que acontece quando a gente imprime esse nosso novo mapa,
    que tem a mesma ideia de verificar se tem frete grátis ou não.
     */

    //Possibilidade Falha
    //criação de uma map para busca caracteristica de chave unica associação não agrupa ela só mantem o ultimo
//    val mapa: Map<Boolean, Pedido> = pedidos.associateBy { pedido ->
//        pedido.valor > 50.0
//    }
//
//    println(mapa)

    /*
        Objetivo - dado esse pedido que você está querendo percorrer,
        o que você quer que eu agrupe dentro de uma coleção?

        -> Dessa forma com List<Pedido conseguimos a caracteristicas que queremos
     */
    val pedidosFreteGratisAgrupados: Map<Boolean, List<Pedido>> =
        pedidos.groupBy { pedido: Pedido ->
        pedido.valor > 50.0
    }

    println(pedidosFreteGratisAgrupados)
    //conseguimos pegar todos conforme especificação relacionado a associação o agrupamento e mais interessante
    println(pedidosFreteGratisAgrupados[true])
    println(pedidosFreteGratisAgrupados[false])

    //Associação estilo agenda
    val nomes = listOf(
        "Alex",
        "Fran",
        "Gui",
        "Ana",
        "Paulo",
        "Maria",
        "Mario",
        "Gisele"
    )

    val agenda: Map<Char, List<String>> = nomes.groupBy { nome ->
        nome.first()
    }

    println(agenda)
    println(agenda['A'])

}
    /*
        Collection>Transformation - Tranformar coleções dado uma operação retornar outra
        esse comportamento esta relacionado ao map
     */

//usamos um data class pois o kotlin ja faz um to string automatico
data class Pedido(val numero: Int,val valor: Double)




