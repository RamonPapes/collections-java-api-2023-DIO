package Set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    Set<String> palavrasUnicasSet;

    public ConjuntoPalavrasUnicas(){
        this.palavrasUnicasSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        this.palavrasUnicasSet.add(palavra);
    }

    public void removerPalavra(String palavra){
        this.palavrasUnicasSet.remove(palavra);
    }

    public boolean verificarPalavra(String palavra){
        return this.palavrasUnicasSet.contains(palavra);
    }

    public void exibirPalavrasUnicas(){
        System.out.println(this.palavrasUnicasSet);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas palavrasUnicas = new ConjuntoPalavrasUnicas();

        palavrasUnicas.adicionarPalavra("Pao");
        palavrasUnicas.adicionarPalavra("Pao");
        palavrasUnicas.adicionarPalavra("Queijo");
        palavrasUnicas.adicionarPalavra("Batata");

        palavrasUnicas.removerPalavra("Pao");

        palavrasUnicas.exibirPalavrasUnicas();
    }
}
