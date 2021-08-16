package exercicios.programacao.kotlin

fun main(args: Array<String>){

    var numero1 = 10
    var numero2 = 5
    var resultadoSomar = numero1 + numero2
    var resultadoSubtrair = numero1 - numero2
    var resultadoMultiplicar = numero1 * numero2
    var resultadoDivisao = numero1 / numero2
    var resultadoModulo = numero1 % numero2

    println("A soma entre $numero1 e $numero2 é: $resultadoSomar")
    println("A subtração entre $numero1 e $numero2 é: $resultadoSubtrair")
    println("A multiplicação entre $numero1 e $numero2 é: $resultadoMultiplicar")
    println("A divisão entre $numero1 e $numero2 é: $resultadoDivisao")
    println("O resto entre $numero1 e $numero2 é: $resultadoModulo")

}