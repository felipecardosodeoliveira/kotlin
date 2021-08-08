package one.digitalinovation.digibank.testes

import one.digitalinovation.digibank.ClienteTipo

fun main () {
    ClienteTipo.values().forEach { elemento ->
        println("${elemento.name} ${elemento}")
    }

    ClienteTipo.values().forEach { it ->
        println("${it.name} ${it.description}")
    }

    val pf = ClienteTipo.PF
    println("${pf.name} ${pf.description}")

    val pj = ClienteTipo.PJ
    println("${pj.name} ${pj.description}")

}