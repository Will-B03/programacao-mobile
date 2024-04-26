/*
====================================================================================
Exercício 04
--
Crie uma classe Carta que represente uma carta de baralho com atributos como naipe e valor.
Crie uma classe Baralhoque represente um baralho de cartas completo.
Implemente métodos para embaralhar o baralho, distribuir cartas.
Entregue 5 cartas para um Jogador que vai verificar se as cartas possuem combinações vencedoras.
====================================================================================
Aluno: Willison Bonfim do Carmo
====================================================================================
*/
//declara classe Baralho
class Baralho {
    //declara variaveis internas
    private val naipes = arrayOf("♠️", "♥️", "♦️", "♣️")
    private val valores = arrayOf("A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K")
    private val cartas = mutableListOf<Carta>()

    //bloco para inicializar o baralho
    init {
        for (naipe in naipes) {
            for (valor in valores) {
                cartas.add(Carta(valor, naipe))
            }
        }
    }

    //função para embaralhar as cartas
    fun embaralhar() {
        cartas.shuffle()
    }

    //função para distribuar as cartas, onde valida de a quantidade é suficiente para ser distribuida
    fun distribuir(qtd: Int): List<Carta> {
        if (cartas.size < qtd) throw IllegalStateException("Não há cartas suficientes no baralho para distribuir.")
        return cartas.take(qtd).also { //para a mesma carta não ser distribuida duas vezes
            cartas.removeAll(it)
        }
    }
}