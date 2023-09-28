package Map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        this.agendaContatoMap.put(nome,telefone);
    }

    public void removerContato(String nome){
        if(!this.agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(this.agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroTelefone = null;
        if(!this.agendaContatoMap.isEmpty()){
            numeroTelefone = agendaContatoMap.get(nome);
        }
        return numeroTelefone;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Camila",123456);
        agendaContatos.adicionarContato("Camila", 5665);
        agendaContatos.adicionarContato("Camila Cavalcante", 11111111);
        agendaContatos.adicionarContato("Camila DIO",6549873);
        agendaContatos.adicionarContato("Maria Silva",11111111);
        agendaContatos.adicionarContato("Camila",44444);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Maria Silva");

        agendaContatos.exibirContatos();
    }

}
