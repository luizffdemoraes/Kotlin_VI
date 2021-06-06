package br.com.alura

fun main() {
//    testaCopia()
    //List e Set estão na mesma hierarquia não herdam um do outro
    val assistiramCursoAndroid: Set<String> = setOf("Alex", "Fran", "Gui", "Maria")
    val assistiramCursoKotlin: Set<String>  = setOf("Alex", "Paulo", "Maria")
//    val assistiramAmbos: MutableList<String> = mutableListOf<String>()
//    val assistiramAmbos: Set<String> = assistiramCursoAndroid + assistiramCursoKotlin
    val assistiramAmbos:MutableSet<String> = mutableSetOf<String>()
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
}