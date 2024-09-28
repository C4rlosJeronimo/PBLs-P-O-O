class Personagem {
    // Atributos
    private String nome;
    private int nivel;
    private int vida;
    private int mana;

    // Construtor sem parâmetros
    public Personagem() {
        this.nome = "Desconhecido";
        this.nivel = 1;
        this.vida = 0;
        this.mana = 0;
    }

    // Construtor com parâmetros
    public Personagem(String nome, int nivel, int vida, int mana) {
        this.nome = nome;
        this.nivel = nivel;
        this.vida = vida;
        this.mana = mana;
    }

}