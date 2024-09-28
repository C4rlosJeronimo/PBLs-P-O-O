class Paladino extends Personagem {
    // Atributo específico
    private int fe;

    // Construtor
    public Paladino(String nome, int nivel, int vida, int mana, int fe) {
        super(nome, nivel, vida, mana);
        this.fe = fe;
    }

}