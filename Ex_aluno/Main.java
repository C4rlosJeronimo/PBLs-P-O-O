import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Disciplina> disciplinas = new ArrayList<>();

        Professor professor1 = new Professor("Prof. Nardeli");
        Professor professor2 = new Professor("Prof. Monica");
        Professor professor3 = new Professor("Prof. Roseli");

        Disciplina disciplina1 = new Disciplina("Matemática", professor1);
        Disciplina disciplina2 = new Disciplina("Portugues", professor2);
        Disciplina disciplina3 = new Disciplina("Ed. Fisica", professor3);

        disciplinas.add(disciplina1);
        disciplinas.add(disciplina2);
        disciplinas.add(disciplina3);

        Aluno aluno1 = new Aluno("Kauany", 101);
        Aluno aluno2 = new Aluno("Milton", 102);
        Aluno aluno3 = new Aluno("Andre", 103);
        Aluno aluno4 = new Aluno("Gabriella", 104);
        Aluno aluno5 = new Aluno("Matheus", 105);

        disciplina1.adicionarAluno(aluno1);
        disciplina1.adicionarAluno(aluno2);
        disciplina2.adicionarAluno(aluno3);
        disciplina2.adicionarAluno(aluno4);
        disciplina3.adicionarAluno(aluno5);

        int opcao;
        do {
            System.out.println("Menu:");
            System.out.println("1 - Matricular aluno");
            System.out.println("2 - Listar alunos por disciplina");
            System.out.println("3 - Mostrar informações da disciplina");
            System.out.println("4 - Listar disciplinas");
            System.out.println("5 - Mostrar informações do aluno por matrícula");
            System.out.println("6 - Alterar informações do aluno");
            System.out.println("7 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do aluno: ");
                    String nomeAluno = scanner.nextLine();
                    System.out.print("Digite a matrícula do aluno: ");
                    int matricula = scanner.nextInt();
                    scanner.nextLine();
                    Aluno aluno = new Aluno(nomeAluno, matricula);
                    System.out.print("Escolha a disciplina (por número):\n");
                    for (int i = 0; i < disciplinas.size(); i++) {
                        System.out.println(i + 1 + " - " + disciplinas.get(i).getNome());
                    }
                    int escolhaDisciplina = scanner.nextInt();
                    scanner.nextLine();
                    if (escolhaDisciplina > 0 && escolhaDisciplina <= disciplinas.size()) {
                        disciplinas.get(escolhaDisciplina - 1).adicionarAluno(aluno);
                    } else {
                        System.out.println("Disciplina inválida.");
                    }
                    break;
                case 2:
                    for (Disciplina d : disciplinas) {
                        System.out.println("Disciplina: " + d.getNome());
                        d.listarAlunos();
                    }
                    break;
                case 3:
                    for (Disciplina d : disciplinas) {
                        d.mostrarInformacoes();
                    }
                    break;
                case 4:
                    System.out.println("Disciplinas:");
                    for (Disciplina d : disciplinas) {
                        System.out.println("- " + d.getNome());
                    }
                    break;
                case 5:
                    System.out.print("Digite a matrícula do aluno: ");
                    int matriculaBusca = scanner.nextInt();
                    scanner.nextLine();
                    Aluno alunoEncontrado = null;
                    for (Disciplina d : disciplinas) {
                        alunoEncontrado = d.getAlunoPorMatricula(matriculaBusca);
                        if (alunoEncontrado != null) {
                            break;
                        }
                    }
                    if (alunoEncontrado != null) {
                        System.out.println("Informações do aluno: " + alunoEncontrado);
                    } else {
                        System.out.println("Aluno não encontrado.");
                    }
                    break;
                case 6:
                    System.out.print("Digite a matrícula do aluno para alterar: ");
                    int matriculaAlterar = scanner.nextInt();
                    scanner.nextLine();
                    Aluno alunoParaAlterar = null;
                    for (Disciplina d : disciplinas) {
                        alunoParaAlterar = d.getAlunoPorMatricula(matriculaAlterar);
                        if (alunoParaAlterar != null) {
                            break;
                        }
                    }
                    if (alunoParaAlterar != null) {
                        System.out.print("Digite o novo nome do aluno: ");
                        String novoNome = scanner.nextLine();
                        alunoParaAlterar.setNome(novoNome);
                        System.out.println("Informações do aluno atualizadas.");
                    } else {
                        System.out.println("Aluno não encontrado.");
                    }
                    break;
                case 7:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opcao != 7);
        scanner.close();
    }
}
