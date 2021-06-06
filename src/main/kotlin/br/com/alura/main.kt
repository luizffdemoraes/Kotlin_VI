package br.com.alura

fun main() {
//    testaColecao()
    val banco = BancoDeNomes()
    banco.salva("Alex")
    println(banco.nomes)
    println(BancoDeNomes().nomes)


}

class BancoDeNomes{

    val nomes: Collection<String> get() = dados

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