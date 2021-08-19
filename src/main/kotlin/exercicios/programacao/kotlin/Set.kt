package exercicios.programacao.kotlin

fun main(args: Array<String>){

    var map = hashMapOf(
        "urso" to "Animal que hiberna",
        "cao" to "Melhor amigo do homem"
    )
    map.put("passaro","Gosta de voar")
    map.remove("passaro")
    for(item in map.keys) {
        println(item)
    }

    /*var itens = hashSetOf("a","b","c","c")
    var itens = hashSetOf(10,20,30,50,70)
    //println(itens)
    for(item in itens){
        println(item)
    }
    println(itens)
    */
}