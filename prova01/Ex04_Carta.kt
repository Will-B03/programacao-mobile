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
//declara classe de dados Carta
data class Carta(val valor: String, val naipe: String) {
    override fun toString() = "$valor$naipe"
}