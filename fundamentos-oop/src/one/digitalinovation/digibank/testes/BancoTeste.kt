package one.digitalinovation.digibank.testes

import one.digitalinovation.digibank.Banco

fun main() {
    val digiOneBanco = Banco(nome = "Banco Inter", numero = 123)

    println(digiOneBanco.nome)
    println(digiOneBanco.numero)


    val banco2 = digiOneBanco.copy(nome =  "BANCO ITER")
    println(digiOneBanco.nome)
    println(digiOneBanco.numero)
}