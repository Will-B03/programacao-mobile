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
class Jogador {
    fun receberCartas(cartas: List<Carta>) {
        println("Recebidas as cartas: ${cartas.joinToString(", ")}")

        // Análise das combinações
        if (isFlush(cartas)) {
            println("Flush: Todas as cartas têm o mesmo naipe!")
        } else if (isFullHouse(cartas)) {
            println("Full House: Uma trinca e um par!")
        } else if (isTrinca(cartas)) {
            println("Trinca: Três cartas com o mesmo valor!")
        } else if (isPar(cartas)) {
            println("Par: Duas cartas com o mesmo valor!")
        } else {
            println("Nenhuma combinação encontrada.")
        }
    }

    private fun isFlush(cartas: List<Carta>): Boolean = cartas.map { it.naipe }.toSet().size == 1

    private fun isFullHouse(cartas: List<Carta>): Boolean {
        val valores = cartas.groupingBy { it.valor }.eachCount()
        return valores.containsValue(3) && valores.containsValue(2)
    }

    private fun isTrinca(cartas: List<Carta>): Boolean = cartas.groupingBy { it.valor }.eachCount().any { it.value == 3 }

    private fun isPar(cartas: List<Carta>): Boolean = cartas.groupingBy { it.valor }.eachCount().any { it.value == 2 }
}
