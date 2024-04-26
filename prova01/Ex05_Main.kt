/*
====================================================================================
Exercício 05
--
Crie uma classe Tarefa que represente uma tarefa a ser realizada com atributos como título, descrição, data de vencimento e prioridade.
Crie uma classe GerenciadorDeTarefas que gerencie uma lista de tarefas.
Implemente métodos para adicionar, remover, buscar, marcar como concluída e listar tarefas por data de vencimento.
====================================================================================
Aluno: Willison Bonfim do Carmo
====================================================================================
*/
import java.time.LocalDate

fun main() {
    val gerenciador = GerenciadorDeTarefas()

    // Adiciona tarefas
    gerenciador.adicionarTarefa(Tarefa("Ir para o trabalho", "Trabalhar na franqueadora Apolar Imóveis", LocalDate.of(2024, 4, 25), 1))
    gerenciador.adicionarTarefa(Tarefa("Efutuar Analise de nova tela", "Analise de nova tela de cadastro de corretor", LocalDate.of(2024, 5, 1), 2))
    gerenciador.adicionarTarefa(Tarefa("Ir para a faculdade", "Ir para a aula de Desenvolvimento para Dispositivos Móveis", LocalDate.of(2024, 4, 25), 3))

    // Marcar uma tarefa como concluída
    gerenciador.marcarComoConcluida("Efutuar Analise de nova tela")

    // Listar tarefas
    println("Todas as Tarefas:")
    println(gerenciador)

    // Listar tarefas concluídas
    println("\nTarefas Concluídas:")
    gerenciador.listarTarefasConcluidas().forEach {
        println(it)
    }

    // Listar tarefas por data de vencimento
    println("\nTarefas por Data de Vencimento:")
    gerenciador.listarTarefasPorDataVencimento().forEach {
        println(it)
    }
}
