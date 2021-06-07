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

    val pedidosFreteGratis: Map<Pedido, Boolean> = pedidos.associateWith { pedido ->
        pedido.valor > 50.0
    }

    println(pedidosFreteGratis)
    println(pedidosFreteGratis[Pedido(numero=1, valor=20.0)])
}
    /*
        Collection>Transformation - Tranformar coleções dado uma operação retornar outra
        esse comportamento esta relacionado ao map
     */

//usamos um data class pois o kotlin ja faz um to string automatico
data class Pedido(val numero: Int,val valor: Double)




