class Guerreiro extends Personagem {
    // Atributo específico
    private int forca;

    // Construtor
    public Guerreiro(String nome, int nivel, int vida, int mana, int forca) {
        super(nome, nivel, vida, mana);
        this.forca = forca;
    }

}