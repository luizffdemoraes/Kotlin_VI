package br.com.alura

fun main() {
//    testaCopia()
    val assistiramCursoAndroid: List<String> = listOf("Alex", "Fran", "Gui", "Maria")
    val assistiramCursoKotlin: List<String>  = listOf("Alex", "Paulo", "Maria")
//    val assistiramAmbos: MutableList<String> = mutableListOf<String>()
    val assistiramAmbos: List<String> = assistiramCursoAndroid + assistiramCursoKotlin
//    assistiramAmbos.addAll(assistiramCursoAndroid)
//    assistiramAmbos.addAll(assistiramCursoKotlin)
    //Função "distinct" - que o objetivo dele é realmente devolver
    // uma nova lista que vai ter apenas os elementos distintos.
    println(assistiramAmbos.distinct())
}