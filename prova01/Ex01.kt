/*
====================================================================================
Exercício 01
--
Escreva um programa que leia um número entre 1 e 12 correspondendo a um mês do ano e imprima o nome desse mês.
Utilize o comando when. Caso o valor seja fora deste intevalo, imprima uma mensagem de erro.
====================================================================================
Aluno: Willison Bonfim do Carmo
====================================================================================
*/

fun main() {
    println("Olá!")
    println("Digite um número entre 1 e 12 para saber o nome do mês:")
    val nunMes = readLine()!!.toInt()  // Lê a entrada do usuário e converte para Int

    val nomeMes = when (nunMes) {
        1 -> "Janeiro"
        2 -> "Fevereiro"
        3 -> "Março"
        4 -> "Abril"
        5 -> "Maio"
        6 -> "Junho"
        7 -> "Julho"
        8 -> "Agosto"
        9 -> "Setembro"
        10 -> "Outubro"
        11 -> "Novembro"
        12 -> "Dezembro"
        else -> null  // Retorna null se o número não estiver entre 1 e 12
    }

    if (nomeMes != null) { //Valida se o número digitado é diferente de null, se sim exibe o nome do mês, se não exibe mensagem de erro
        println("O mês de número $nunMes é $nomeMes.")
        println("Obrigado!")
    } else {
        println("Erro! Por favor digite um numero entre 1 e 12.")
    }
}
