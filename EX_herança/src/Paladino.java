class Paladino extends Personagem {
    private int fe;

    public Paladino(String nome, int nivel, int vida, int mana, int fe) {
        super(nome, nivel, vida, mana);
        this.fe = fe;
    }
}
