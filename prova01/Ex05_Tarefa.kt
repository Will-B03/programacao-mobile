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

data class Tarefa(
    val titulo: String,
    val descricao: String,
    val dataVencimento: LocalDate,
    val prioridade: Int,
    var concluida: Boolean = false
)