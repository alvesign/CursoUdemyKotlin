package exercicios.programacao.kotlin

fun exibirMensagem(nome: String, idade:Int ){
    //Bloco de Códigos
    println("Alerta, você não preencheu todos os dados! nome: $nome, idade:$idade")
}

fun somar(numero1: Int, numero2: Int) : Int{
    var total = numero1 + numero2
    return total
    //println(total)
}

fun main(args: Array<String>){
    exibirMensagem("Márcio", 34)
    somar(10,5)
    var resultado = somar(10,5)
    println(resultado)
}
