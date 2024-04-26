/*
====================================================================================
Exercício 03
--
Crie uma classe abstrata Animal com atributos como nome, idade e som.
Crie classes derivadas de Animal para representar diferentes tipos de animais, como cachorro, gato e pássaro.
Implemente métodos específicos para cada tipo de animal, como latir, miar e cantar.
Utilize herança e polimorfismo para criar uma lista de animais e exibir informações sobre cada um deles.
====================================================================================
Aluno: Willison Bonfim do Carmo
====================================================================================
*/
fun main() {
    //declara a variavel animais, onde é inicializada com os dados da lista listof
    val animais = listOf(
        Cachorro("Caramelo", 5),
        Gato("Bichano", 3),
        Passaro("José de Barro", 2)
    )

    animais.forEach { animal ->
        println("${animal.nome}, que tem ${animal.idade} anos, ${animal.emitirSom()}.")
        when (animal) {
            is Cachorro -> println(animal.latir())
            is Gato -> println(animal.miar())
            is Passaro -> println(animal.cantar())
        }
    }
}