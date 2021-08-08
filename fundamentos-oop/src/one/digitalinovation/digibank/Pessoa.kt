package one.digitalinovation.digibank

class Pessoa {
    var name: String = "Felipe'"
    var age: Int = 28
    var cpf: String  = "111.111.111.-11"

    private set

    inner class Endereco {
        var rua: String = "Rua teste"
    }


}

fun main() {
    val p =  Pessoa()
    println(p.name)
    println(p.Endereco().rua)

    println(p.cpf)
}