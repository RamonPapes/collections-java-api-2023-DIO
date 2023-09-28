package Set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    Set<Convidado> convidadoSet;

    public ConjuntoConvidados(){
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        this.convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for(Convidado c : convidadoSet){
            if (c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return this.convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        conjuntoConvidados.adicionarConvidado("Convidado 1",1234);
        conjuntoConvidados.adicionarConvidado("Convidado 2",1235);
        conjuntoConvidados.adicionarConvidado("Convidado 3",1235);
        conjuntoConvidados.adicionarConvidado("Convidado 4",1236);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados no set");

        conjuntoConvidados.exibirConvidados();

    }
}
