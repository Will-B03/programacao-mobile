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
//declara classe Gato e herda a classe Animal
class Gato(nome: String, idade: Int) : Animal(nome, idade) {
    override fun emitirSom() = "mia" //caso a função emitirSom seja chamada e a classe seja Gato, o emitirSom será = mia

    fun miar() = "Miau!" //função miar = 'Miau!'
}