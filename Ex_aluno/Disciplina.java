import java.util.ArrayList;

public class Disciplina {
    private String nome;
    private Professor professor;
    private ArrayList<Aluno> alunos;
    private static final int MAX_ALUNOS = 10;

    public Disciplina(String nome, Professor professor) {
        this.nome = nome;
        this.professor = professor;
        this.alunos = new ArrayList<>();
    }

    public boolean adicionarAluno(Aluno aluno) {
        if (alunos.size() < MAX_ALUNOS) {
            alunos.add(aluno);
            return true;
        } else {
            System.out.println("Não é possível adicionar mais alunos. Limite de " + MAX_ALUNOS + " alunos atingido.");
            return false;
        }
    }

    public void listarAlunos() {
        System.out.println("Alunos da disciplina " + nome + ":");
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }

    public void mostrarInformacoes() {
        System.out.println("Disciplina: " + nome);
        System.out.println("Professor: " + professor.getNome());
        listarAlunos();
    }

    public String getNome() {
        return nome;
    }

    public Professor getProfessor() {
        return professor;
    }

    public Aluno getAlunoPorMatricula(int matricula) {
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula() == matricula) {
                return aluno;
            }
        }
        return null;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }
}
