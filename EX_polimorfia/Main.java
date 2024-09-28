//- Crie uma classe pai qualquer com pelo menos 3 atributos (pode ser a mesma da semana passada)
//- Crie 3 classes filhas com pelo menos 1 atributo diferente da classe pai.
//- Na classe pai, implemente dois tipos de construtores (ex: um que recebe todos os parametros e outros sem parametros).
//- Crie um metodo qualquer na classe pai.
//- Crie outro metodo qualquer na classe pai que sera sobrescrito pelos filhos.
//- Em cada filho, crie um metodo diferente dos metodos criados no pai
//
//  Em seguida, na classe Main:
//- Crie pelo menos 3 objetos polimorficos.
//- Chame o metodo implementado apenas nos filhos (utilize intanceof e type cast).
//- Crie um metodo que recebe como parametro uma referencia polimorfica.
//  O metodo deve utiliar a chamda polimorfica da funcao implementada no pia,
//  que foi sobrescrita pelos filhos.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Criação de Personagem");
        System.out.print("Nome do personagem: ");
        String nome = scanner.nextLine();

        int nivel = 0;
        do {
            System.out.print("Escolha o nível do personagem (1-10): ");
            nivel = scanner.nextInt();
        } while (nivel < 1 || nivel > 10);

        System.out.println("Escolha a classe do personagem:");
        System.out.println("1. Guerreiro");
        System.out.println("2. Bruxo");
        System.out.println("3. Paladino");
        int escolha = scanner.nextInt();

        Personagem personagem;

        switch (escolha) {
            case 1:
                personagem = new Guerreiro();
                break;
            case 2:
                personagem = new Bruxo();
                break;
            case 3:
                personagem = new Paladino();
                break;
            default:
                System.out.println("Opção inválida, criando um personagem padrão.");
                personagem = new Guerreiro();
                break;
        }

        personagem.nome = nome;
        personagem.nivel = nivel;
        personagem.pontosRestantes = nivel * 10;

        System.out.println("Atributos iniciais do personagem:");
        realizarAtributos(personagem);

        System.out.println("Voce tem: " + personagem.pontosRestantes + " pontos pra gastar");

        while (personagem.pontosRestantes > 0) {
            System.out.println("\nDistribua seus pontos de atributo:");
            System.out.print("Quantos pontos deseja colocar em Vida? ");
            int vidaPontos = scanner.nextInt();
            System.out.print("Quantos pontos deseja colocar em Mana? ");
            int manaPontos = scanner.nextInt();

            if (personagem instanceof Guerreiro) {
                System.out.print("Quantos pontos deseja colocar em Força? ");
                int forcaPontos = scanner.nextInt();
                ((Guerreiro) personagem).distribuirPontos(vidaPontos, manaPontos, forcaPontos);
                System.out.println("Habilidade unica da classe: ");
                ((Guerreiro) personagem).espada();
            } else if (personagem instanceof Bruxo) {
                System.out.print("Quantos pontos deseja colocar em Carisma? ");
                int carismaPontos = scanner.nextInt();
                ((Bruxo) personagem).distribuirPontos(vidaPontos, manaPontos, carismaPontos);
                System.out.println("Habilidade unica da classe: ");
                ((Bruxo) personagem).feitico();
            } else if (personagem instanceof Paladino) {
                System.out.print("Quantos pontos deseja colocar em Fé? ");
                int fePontos = scanner.nextInt();
                ((Paladino) personagem).distribuirPontos(vidaPontos, manaPontos, fePontos);
                System.out.println("Habilidade unica da classe: ");
                ((Paladino) personagem).curar();
            }
        }

        System.out.println("\nPersonagem final criado:");
        realizarAtributos(personagem);

        scanner.close();
    }

    public static void realizarAtributos(Personagem personagem) {
        personagem.exibirInformacoes();
    }
}