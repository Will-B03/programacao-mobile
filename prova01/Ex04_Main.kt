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
fun main() {
    val baralho = Baralho() //declara um estancia chamada baralho no objeto Baralho
    baralho.embaralhar() //Chama método embaralhar para trazer as cartas de forma aleatória

    val jogador = Jogador() //declara um estancia chamada baralho no objeto Baralho
    val cartasRecebidas = baralho.distribuir(5) //declara cartasRecebidas onde atrubou o método distribuir da classe baralho e define que a quantidade de cartas será = 5
    jogador.receberCartas(cartasRecebidas) //Chama metodos receber cartas
}