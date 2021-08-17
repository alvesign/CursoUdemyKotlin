package exercicios.programacao.kotlin

fun main(args: Array<String>) {

    /*var opcao = 2
    when (opcao){
        1,2 -> {
            println("Café com leite")
            println("Melhor opção da casa")
        }
        3 -> println("Chocolate quente")
        else -> {
            println ("Nenhuma opção selecionada")
            println ("Selecione uma opção!")
        }

    }*/

    var opcao = 1
    var resultado = when (opcao){
        1 -> "Café puro"
        2 -> "Chocolate quente"
        else -> "Nenhuma opção selecionada"
    }
    println(resultado)
}
