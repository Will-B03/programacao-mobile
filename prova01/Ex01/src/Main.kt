fun main() {
    println("Digite um número entre 1 e 12 para saber o mês:")
    val nmes = readLine()!!.toInt()  // Lê a entrada do usuário e converte para Int

    val nomeMes = when (nmes) {
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

    if (nomeMes != null) {
        println("O mês é $nomeMes.")
    } else {
        println("Erro: Digite um numero entre 1 e 12.")
    }
}
