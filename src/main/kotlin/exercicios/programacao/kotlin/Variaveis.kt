package exercicios.programacao.kotlin

//função principal
fun main(args: Array<String>){

    // ao utilizar var, é criado uma variável mutável
    var usuario = "Marcio"
    usuario = "Pereira"

    // ao utilizar val, é criado uma variável imutável
    val pi = 3.14
    var salario = 1000
    var bonus = 200

    var total = salario + bonus

    println(usuario)
    println("O salário é $total")

}
