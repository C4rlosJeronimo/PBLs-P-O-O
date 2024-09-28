class Guerreiro extends Personagem {
    private int forca;

    public Guerreiro(String nome, int nivel, int vida, int mana, int forca) {
        super(nome, nivel, vida, mana);
        this.forca = forca;
    }
}
