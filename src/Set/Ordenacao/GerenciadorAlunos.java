package Set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    Set<Aluno> alunoSet ;

    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, long matricula, double media){
        this.alunoSet.add(new Aluno(nome, matricula,media));
    }

    public void removerAluno(long matricula){
        for (Aluno a : alunoSet){
            if (a.getMatricula() == matricula){
                alunoSet.remove(a);
                break;
            }
        }
    }

    public Set<Aluno> exibirAlunosPorNome(){
        return new TreeSet<>(alunoSet);
    }

    public Set<Aluno> exibirAlunosPorNota(){
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
        alunosPorNota.addAll(alunoSet);
        return alunosPorNota;
    }

    public void exibirAlunos(){
        System.out.println(alunoSet);
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno("Aluno 1", 12345, 7d);
        gerenciadorAlunos.adicionarAluno("Aluno 2", 12345, 2d);
        gerenciadorAlunos.adicionarAluno("Aluno 3", 12346, 9d);
        gerenciadorAlunos.adicionarAluno("Aluno 4", 12347, 8d);

        System.out.println(gerenciadorAlunos.exibirAlunosPorNome());

        System.out.println(gerenciadorAlunos.exibirAlunosPorNota());

        gerenciadorAlunos.removerAluno(12345);

        gerenciadorAlunos.exibirAlunos();
    }
}

