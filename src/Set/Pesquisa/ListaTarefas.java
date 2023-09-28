package Set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet =  new HashSet<>();
    }

    public void adicionarTarefa(String descricao, boolean concluida){
        this.tarefaSet.add(new Tarefa(descricao, concluida));
    }

    public void removerTarefa(String descricao){
         for(Tarefa t : tarefaSet){
             if(t.getDescricao().equalsIgnoreCase(descricao)){
                 this.tarefaSet.remove(t);
                 break;
             }
         }
    }

    public void exibirTarefas(){
        System.out.println(this.tarefaSet);
    }

    public int contarTarefas(){
        return this.tarefaSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidasSet = new HashSet<>();
        for (Tarefa t : tarefaSet){
            if(t.isConcluida()){
                tarefasConcluidasSet.add(t);
            }
        }
        return  tarefasConcluidasSet;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentesSet = new HashSet<>();
        for (Tarefa t : tarefaSet){
            if(!t.isConcluida()){
                tarefasPendentesSet.add(t);
            }
        }
        return tarefasPendentesSet;
    }

    public void marcarTarefaConcluida(String descricao){
        for (Tarefa t : tarefaSet){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                t.setConcluida(true);
            }
        }
    }

    public void marcarTarefaPendente(String descricao){
        for (Tarefa t : tarefaSet){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                t.setConcluida(false);
            }
        }
    }

    public void limparListaTarefas(){
        this.tarefaSet.removeAll(tarefaSet);
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Teste 1",true);
        listaTarefas.adicionarTarefa("Teste 2",false);
        listaTarefas.adicionarTarefa("Teste 3",false);
        listaTarefas.adicionarTarefa("Teste 4",true);
        listaTarefas.adicionarTarefa("Teste 5",true);

        listaTarefas.removerTarefa("Teste 5");

        listaTarefas.exibirTarefas();
    }
}
