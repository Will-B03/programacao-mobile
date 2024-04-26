/*
====================================================================================
Exercício 02
--
Escreva um programa que dado um inteiro positivo n, calcule e imprima o valor da seguinte soma:
====================================================================================
Aluno: Willison Bonfim do Carmo
====================================================================================
*/


fun main() {
    println("Digite um número inteiro e positivo:")
    val num = readLine()!!.toInt() //Atribui o numero digitado para a variável num e converte para inteiro

    //Valida se o numeo digitado é menor ou = a 0, caso sim exibem manssagem de erro
    if (num <= 0) {
        println("Erro: Por favor, insira um número inteiro e positivo.")
        return
    }

    var soma = 0.0 //declara variável soma e inicaliza com 0.0

    //Utilizando laço for que percorre de 1 até o número inserido pelo usuário, onde em cada interação é incrementa 1 a i

    for (i in 1..num) {
        soma += i.toDouble() / (num - i + 1) // Efetua calculo de cada termo e incrementa em soma
    }

    println("O valor de f($num) é $soma") //Exibe o resultado da soma
}
