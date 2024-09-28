class Bruxo extends Personagem {
    private int carisma;

    public Bruxo(String nome, int nivel, int vida, int mana, int carisma) {
        super(nome, nivel, vida, mana);
        this.carisma = carisma;
    }
}
