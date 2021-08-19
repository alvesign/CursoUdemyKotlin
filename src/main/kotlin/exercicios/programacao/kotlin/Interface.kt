package exercicios.programacao.kotlin


interface Presidente{
    fun ganharEleicao()
}

interface Pai{
    fun temFilho()
}

open class Cidadao{
    fun direitosDeveres(){
        println("Todo cidadão tem direitos e deveres")
    }
}

class Obama: Cidadao(), Presidente, Pai {
    override fun ganharEleicao() {
        println("Ganhar Eleição nos EUA")
    }

    override fun temFilho() {
        println("Tem filho!")
    }

}
class Jamilton: Cidadao(), Presidente {
    override fun ganharEleicao() {
        println("Ganhar Eleição no Brasil")
    }
}

fun main(args: Array<String>){
    val jamilton = Jamilton()
    jamilton.direitosDeveres()

    val obama = Obama()
    obama.direitosDeveres()
    obama.ganharEleicao()
    obama.temFilho()

}