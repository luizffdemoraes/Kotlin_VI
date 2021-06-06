package br.com.alura.teste

fun testaCopia() {
    //    testaColecao()
    val banco = BancoDeNomes()
    //copia por referencia conversão para burlar o sistema
//    val nomesSalvos: MutableCollection<String> = banco.nomes as MutableCollection<String>
//    banco.nomes.add("Alex")

    //Ao usar o toList a gambiarra acima não funciona mais pois estamos recebendo uma cópia não a fonte real
    val nomesSalvos: Collection<String> = banco.nomes
    banco.salva("Alex")
    println(nomesSalvos)
    println(BancoDeNomes().nomes)
}

class BancoDeNomes{

    /*
     O próprio Kotlin fala que vão existir funções de cópia, que são a toList,
     toMutableList, toSet que vão criar o que chamamos de snapshot,
     uma cópia de verdade da nossa coleção, de tal forma que não estamos devolvendo
     a coluna de verdade, nossa referência interna.
     Vamos devolver uma cópia dela.
    */


    val nomes: Collection<String> get() = dados.toList()

    fun salva(nome: String){
        dados.add(nome)
    }

    // Ao executar o código a gente vai perceber que os dados serão mantidos.
    // Se a gente salvou alguma vez em algum lugar eles serão mantidos
    companion object {
        private val dados = mutableListOf<String>()
    }

}


/*
       Criação de list List<String>
       O list e o set compartilham de Collection e Iterable elas implementam de seus comportamentos
       -> Collection<String> / Iterable<String>
       Ao utilizar os genericos temos restrição de comportamento
       Há dois tipos de coleções read-only e mutable
       read-only: não permite mudar os valores
       mutable: permite a leitura e modificações
       Iterable ou MutableIterable tem o comportamento mais restrito
 */
fun testaColecao() {
    val nomes: Collection<String> = mutableListOf(
        "Alex",
        "Fran",
        "Gui",
        "Maria",
        "Ana"
    )

    for (nome in nomes.iterator()) {
        println(nome)
    }

    println(nomes)
    println("Tem o nome Alex? ${nomes.contains("Alex")}")
    println("Tamanho da coleção ${nomes.size}")
}