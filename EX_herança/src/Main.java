import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Criação de Personagem");
        System.out.print("Nome do personagem: ");
        String nome = scanner.nextLine();

        System.out.print("Nível do personagem: ");
        int nivel = scanner.nextInt();

        System.out.print("Vida do personagem: ");
        int vida = scanner.nextInt();

        System.out.print("Mana do personagem: ");
        int mana = scanner.nextInt();

        Personagem personagem;

        if (vida > mana) {
            System.out.println("Você criou um Guerreiro!");

            System.out.print("Força do guerreiro: ");
            int forca = scanner.nextInt();

            personagem = new Guerreiro(nome, nivel, vida, mana, forca);
        } else if (mana > vida) {
            System.out.println("Você criou um Bruxo!");

            System.out.print("Carisma do bruxo: ");
            int carisma = scanner.nextInt();

            personagem = new Bruxo(nome, nivel, vida, mana, carisma);
        } else {
            System.out.println("Você criou um Paladino!");

            System.out.print("Fé do paladino: ");
            int fe = scanner.nextInt();

            personagem = new Paladino(nome, nivel, vida, mana, fe);
        }

        System.out.println("Personagem criado com sucesso!");
    }
}

