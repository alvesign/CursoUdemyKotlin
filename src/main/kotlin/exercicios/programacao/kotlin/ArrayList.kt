package exercicios.programacao.kotlin

fun main(args: Array<String>) {
    var listaItens = arrayListOf("SP","RJ","MG")
    listaItens.add("BA")
    listaItens[0] = "MA"

    //listaItens.remove("SP")
    //listaItens.removeAt(0)

    println(listaItens)

    //println(listaItens.size)
    //println(listaItens.isEmpty())
}