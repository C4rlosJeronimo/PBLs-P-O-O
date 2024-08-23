public class Personagem {
    public String Nome;
    public String Cabelo;
    public String Fisico;
    public String Altura;
    public int Idade ;
    public boolean ligado = false;


    public Personagem(){

        Nome = null;
        Cabelo = null;
        Fisico = null;
        Altura = null;
        Idade = 0;

    }
    public Personagem(String Nome, String Cabelo, String Fisico, String Altura, int Idade) {
        this.Nome = Nome;
        this.Cabelo = Cabelo;
        this.Fisico = Fisico;
        this.Altura = Altura;
        this.Idade = Idade;
    }

    public Personagem(String Nome, String Altura) {

        this.Nome = Nome;
        this.Fisico = null;
        this.Altura = Altura;
        this.Idade = 0;
        this.Cabelo = null;

    }


    public void AndarFrente() {
        if (ligado)
            System.out.println( Nome + " " + "andou para frente ");
    }

    public void AndarTras() {
        if (ligado)
            System.out.println(Nome + " " + "Andou para tras ");
    }

    public void Correr() {
        if(ligado)
            System.out.println(Nome + " " + "Correu");
    }

    public void Agachar() {
        if(ligado)
            System.out.println(Nome + " " + "Agachou");
    }

    public void Pular() {
        if(ligado)
            System.out.println(Nome + " " + "Pulou");
    }

    public void ObjetoEspada() {
        if(ligado)
            System.out.println(Nome + " " + "Voce achou uma espada");
    }

    public void EquiparEspada() {
        if(ligado)
            System.out.println(Nome + " " + "Voce equipou a espada que encontrou");
    }

    public void ObjetoEscudo() {
        if(ligado)
            System.out.println(Nome + " " + "Voce encontrou um escudo");
    }

    public void EquiparEscudo() {
        if(ligado)
            System.out.println(Nome + " " + "equipou o escudo que encontrou");
    }

    public void ObjetoArmadura() {
        if(ligado)
            System.out.println(Nome + " " + "encontrou uma armadura");
    }

    public void EquiparArmadura() {
        if(ligado)
            System.out.println(Nome + " " + "equipou a armadura que encontrou");
    }

    public void Bau() {
        if(ligado)
            System.out.println(Nome + " " + "Achou um bau e abriu");
    }

    public void Atacar() {
        if(ligado)
            System.out.println(Nome + " " + "Atacou o bixo");
    }

    public void Monstro() {
        if(ligado)
            System.out.println(Nome + " " + "Encontrou um monstro");
    }

    public void Seguro() {
        if(ligado)
            System.out.println(Nome + " " + "Encontrou um lugar seguro");
    }

    public void Defender() {
        if(ligado)
            System.out.println(Nome + " " + "Se defendeu do monstro");
    }

    public void Inicio() {
        if(ligado)
            System.out.println(Nome + " " + "Entrou na floresta");
    }
}

