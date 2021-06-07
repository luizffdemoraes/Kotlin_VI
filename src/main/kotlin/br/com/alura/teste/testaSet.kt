package br.com.alura.teste

fun testaSet() {
    //List e Set estão na mesma hierarquia não herdam um do outro
    val assistiramCursoAndroid: Set<String> = setOf("Alex", "Fran", "Gui", "Maria")
    val assistiramCursoKotlin: Set<String> = setOf("Alex", "Paulo", "Maria")
//    val assistiramAmbos: MutableList<String> = mutableListOf<String>()
//    val assistiramAmbos: Set<String> = assistiramCursoAndroid + assistiramCursoKotlin
    val assistiramAmbos: MutableSet<String> = mutableSetOf<String>()
//    assistiramAmbos.addAll(assistiramCursoAndroid)
//    assistiramAmbos.addAll(assistiramCursoKotlin)
    //Função "distinct" - que o objetivo dele é realmente devolver
    // uma nova lista que vai ter apenas os elementos distintos.
//    println(assistiramAmbos.distinct())
//    println(assistiramAmbos[0])
    //O set sempre vai ter um conjunto sem repetição de elementos
    assistiramAmbos.addAll(assistiramCursoAndroid + assistiramCursoKotlin)
    assistiramAmbos.add("Ana")
    println(assistiramAmbos)

    /*
     Caracteristica do Union
     É uma implementação mais genérica,não só focada na parte do set,
     pode receber qualquer iterable,
     e aqui na união a gente vê que é diferente. Essa é uma das coisas.
     Outro detalhe que acaba sendo diferente é que esse union vai ter uma característica
     de implementação que a gente chama de infix no Kotlin podemos utilizar o ponto e sem o ponto.
     println(assistiramCursoAndroid.union(assistiramCursoKotlin))
     println(assistiramCursoAndroid union(assistiramCursoKotlin))
     println(assistiramCursoAndroid union assistiramCursoKotlin)
     */

    //São similares
    println(assistiramCursoAndroid + assistiramCursoKotlin)
    println(assistiramCursoAndroid union (assistiramCursoKotlin))

    //São similares o subtract e semelhante ao union é um infix
    println(assistiramCursoAndroid - assistiramCursoKotlin)
    println(assistiramCursoAndroid subtract assistiramCursoKotlin)

    /*
        Intersecção - Em teoria dos conjuntos, a interseção ou intersecção,
        é um conjunto de elementos que, simultaneamente,
        pertencem a dois ou mais conjuntos,
     */

    println(assistiramCursoKotlin intersect assistiramCursoAndroid)

    val assistiramList: MutableList<String> = assistiramAmbos.toMutableList()

    assistiramList.add("Alex")
    println(assistiramList)
    println(assistiramList.toSet()) //coloca o comportamento do set podemos converter para o set
}