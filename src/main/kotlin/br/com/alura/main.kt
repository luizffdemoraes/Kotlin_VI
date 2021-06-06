package br.com.alura

fun main() {
    /*
        Criação de list List<String>
        O list e o set compartilham de Collection e Iterable elas implementam de seus comportamentos
        -> Collection<String> / Iterable<String>
        Ao utilizar os genericos temos restrição de comportamento
     */
    val nomes: Collection<String> = setOf(
        "Alex",
        "Fran",
        "Gui",
        "Maria",
        "Ana"
    )

    for(nome in nomes.iterator()){
        println(nome)
    }

    println(nomes)
    println("Tem o nome Alex? ${nomes.contains("Alex")}")
    println("Tamanho da coleção ${nomes.size}")
}