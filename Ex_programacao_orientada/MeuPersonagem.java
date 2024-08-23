import java.util.Scanner;
public class MeuPersonagem {
    public static void main(String[] args) {

        Scanner nm = new Scanner(System.in);
        System.out.println("Digite um nome para o personagem: ");
        String n = nm.next();

        Scanner id = new Scanner(System.in);
        System.out.println("Digite a idade para o personagem: ");
        int i = id.nextInt();

        Scanner ca = new Scanner(System.in);
        System.out.println("Digite o estilo de cabelo do seu personagem: ");
        String cab = ca.next();

        Scanner fi = new Scanner(System.in);
        System.out.println("Digite o tipo de corpo do seu personagem: ");
        String fis = fi.next();

        Scanner al = new Scanner(System.in);
        System.out.println("Digite a altura do seu personagem: ");
        String alt = al.next();


        Personagem personagem1 = new Personagem(n, cab, fis, alt, i);
        System.out.println(personagem1);
//        personagem1.Nome = "Fabinho";
//        personagem1.Cabelo = "Cacheado";
//        personagem1.Altura = "Alto";
//        personagem1.Fisico = "Magro";
//        personagem1.Idade = 21;
        personagem1.ligado = true;

        System.out.println();
        personagem1.Inicio();
        System.out.println();
        personagem1.AndarFrente();
        System.out.println();
        personagem1.AndarFrente();
        System.out.println();
        personagem1.Bau();
        System.out.println();
        personagem1.ObjetoEscudo();
        System.out.println();
        personagem1.Correr();
        System.out.println();
        personagem1.Bau();
        System.out.println();
        personagem1.ObjetoArmadura();
        System.out.println();
        personagem1.EquiparArmadura();
        System.out.println();
        personagem1.Monstro();
        System.out.println();
        personagem1.Correr();
        System.out.println();
        personagem1.Seguro();
        System.out.println();


//        System.out.println(personagem1.Cabelo + personagem1.Altura + personagem1.Fisico + personagem1.Idade);
        Scanner nm2 = new Scanner(System.in);
        System.out.println("Digite um nome para outro personagem: ");
        String n2 = nm2.next();

        Scanner al2 = new Scanner(System.in);
        System.out.println("Digite a altura do seu outro personagem: ");
        String alt2 = al2.next();

        Personagem personagem2 = new Personagem(n2, alt2);
        System.out.println(personagem2);

//        personagem2.Nome = "Maria";
        personagem2.Cabelo = "Liso";
//        personagem2.Altura = "Baixo";
        personagem2.Fisico = "Normal";
        personagem2.Idade = 29;
        personagem2.ligado = true;
        System.out.println();

        personagem2.Inicio();
        System.out.println();
        personagem2.AndarFrente();
        System.out.println();
        personagem2.Pular();
        System.out.println();
        personagem2.AndarFrente();
        System.out.println();
        personagem2.Monstro();
        System.out.println();
        personagem2.Correr();
        System.out.println();
        personagem2.Bau();
        System.out.println();
        personagem2.ObjetoEscudo();
        System.out.println();
        personagem2.EquiparEscudo();
        System.out.println();
        personagem2.AndarTras();
        System.out.println();
        personagem2.Monstro();
        System.out.println();
        personagem2.Defender();
        System.out.println();
        personagem2.Correr();
        System.out.println();
        personagem2.Seguro();
        System.out.println();

        Personagem personagem3 = new Personagem();
        System.out.println(personagem3);
        personagem3.Nome = "Jose";
        personagem3.Cabelo = "Longo liso";
        personagem3.Altura = "Alto";
        personagem3.Fisico = "Musculoso";
        personagem3.Idade = 36;
        personagem3.ligado = true;
        System.out.println();

        personagem3.Inicio();
        System.out.println();
        personagem3.AndarFrente();
        System.out.println();
        personagem3.Agachar();
        System.out.println();
        personagem3.Bau();
        System.out.println();
        personagem3.ObjetoEspada();
        System.out.println();
        personagem3.EquiparEspada();
        System.out.println();
        personagem3.Monstro();
        System.out.println();
        personagem3.Atacar();
        System.out.println();
        personagem3.AndarFrente();
        System.out.println();
        personagem3.Seguro();
        System.out.println();
        }
}
