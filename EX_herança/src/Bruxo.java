class Bruxo extends Personagem {
    // Atributo específico
    private int carisma;

    // Construtor
    public Bruxo(String nome, int nivel, int vida, int mana, int carisma) {
        super(nome, nivel, vida, mana);
        this.carisma = carisma;
    }

}