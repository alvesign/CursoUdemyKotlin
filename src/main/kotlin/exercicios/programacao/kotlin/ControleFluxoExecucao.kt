package exercicios.programacao.kotlin

fun main(args: Array<String>) {
    /*if(5==5 && 6==6){
        println("Verdadeiro")
    }else{
        println("Falso")
    }
}*/

/*var idade = 18
    if (idade<14){
        println("Criança")
    }else if(idade>=14 && idade <18){
        println("Adolescente")
    }else {
        println("Adulto")
        }
    }*/
/*var media = 5
    if (media>=6){
        println("Aprovado")
    }else{
        println("Reprovado")
    }
    }*/

    var media = 8
    var resultado = if (media >= 6) "Aprovado" else "Reprovado"
    println(resultado)
}
