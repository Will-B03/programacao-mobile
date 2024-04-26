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
//declara classe Cachorro e herda a classe Animal
class Cachorro(nome: String, idade: Int) : Animal(nome, idade) {
    override fun emitirSom() = "late" //caso a função emitirSom seja chamada e a classe seja Cachorro, o emitirSom será = late

    fun latir() = "Au au!" //função latir = 'Au au!'
}