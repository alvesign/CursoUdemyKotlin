package exercicios.programacao.kotlin

class Casa ( var cor: String, var vagasGaragem: Int ){

    //Propriedades
    /*var cor: String
    var vagasGaragem: Int

    //Construtor secundário
    constructor(cor: String, vagasGaragem: Int){
        this.cor = cor
        this.vagasGaragem = vagasGaragem
    }*/

    //Construtor primário
    /*init {
        this.cor = cor
        this.vagasGaragem = vagasGaragem
    }*/

    //Métodos
    fun detalhesCasa(){
        println("A casa tem a cor: $cor, vagas: $vagasGaragem")
    }

    fun abrirJanela(qtdJanelas: Int){
        println("Abrir Janela total: $qtdJanelas")
    }

    fun abrirPorta(){
        println("Abrir Porta")
    }

    fun abrirCasa(){
        //this.abrirJanela()
        //this.abrirPorta()
    }
}

    fun main(args: Array<String>){
        val casa = Casa("Amarela", 2)

        casa.detalhesCasa()
    }
