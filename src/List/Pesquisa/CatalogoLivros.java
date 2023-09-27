package List.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    List<Livro> catalogo = new ArrayList<>();

    public CatalogoLivros() {
        this.catalogo = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro){
        this.catalogo.add(livro);
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> lista =  new ArrayList<>();
        if(!catalogo.isEmpty()){
            for (Livro l : catalogo){
                if (l.getAutor().equalsIgnoreCase(autor)){
                    lista.add(l);
                }
            }
        }
        return lista;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> lista = new ArrayList<>();
        if(!catalogo.isEmpty()){
            for (Livro l : catalogo){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    lista.add(l);
                }
            }
        }
        return lista;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if(!catalogo.isEmpty()){
            for (Livro l : catalogo){
                if (l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }
}
