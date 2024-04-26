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
//cria classe GeranciadrDeTarefas
class GerenciadorDeTarefas {
    private val tarefas = mutableListOf<Tarefa>()

    //Adcionar tarefa
    fun adicionarTarefa(tarefa: Tarefa) {
        tarefas.add(tarefa)
    }

    //Remover tarefa
    fun removerTarefa(tarefa: Tarefa) {
        tarefas.remove(tarefa)
    }

    //Buscar tarefa
    fun buscarTarefa(titulo: String): Tarefa? {
        return tarefas.find { it.titulo == titulo }
    }

    fun marcarComoConcluida(titulo: String) {
        tarefas.find { it.titulo == titulo }?.concluida = true
    }

    fun listarTarefasPorDataVencimento(): List<Tarefa> {
        return tarefas.sortedBy { it.dataVencimento }
    }

    fun listarTarefasConcluidas(): List<Tarefa> {
        return tarefas.filter { it.concluida }
    }

    fun listarTarefasNaoConcluidas(): List<Tarefa> {
        return tarefas.filterNot { it.concluida }
    }

    override fun toString(): String {
        return tarefas.joinToString(separator = "\n") { tarefa ->
            "${tarefa.titulo} - Vence em: ${tarefa.dataVencimento} - " +
                    "Prioridade: ${tarefa.prioridade} - Concluída: ${tarefa.concluida}"
        }
    }
}
