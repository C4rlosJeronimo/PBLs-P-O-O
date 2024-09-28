import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário os atributos básicos do personagem
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

        // Definir o tipo de personagem com base na quantidade de vida e mana
        if (vida > mana) {
            System.out.println("Você criou um Guerreiro!");

            // Solicita ao usuário o valor de força específico para o Guerreiro
            System.out.print("Força do guerreiro: ");
            int forca = scanner.nextInt();

            personagem = new Guerreiro(nome, nivel, vida, mana, forca);
        } else if (mana > vida) {
            System.out.println("Você criou um Bruxo!");

            // Solicita ao usuário o valor de carisma específico para o Bruxo
            System.out.print("Carisma do bruxo: ");
            int carisma = scanner.nextInt();

            personagem = new Bruxo(nome, nivel, vida, mana, carisma);
        } else {
            System.out.println("Você criou um Paladino!");

            // Solicita ao usuário o valor de fé específico para o Paladino
            System.out.print("Fé do paladino: ");
            int fe = scanner.nextInt();

            personagem = new Paladino(nome, nivel, vida, mana, fe);
        }

        // Aqui você pode usar o objeto 'personagem' conforme necessário
        System.out.println("Personagem criado com sucesso!");
    }
}

