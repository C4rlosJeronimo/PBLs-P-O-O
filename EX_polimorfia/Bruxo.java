class Bruxo extends Personagem {
    private int carisma;

    public Bruxo() {
        super();
        this.vida = 50;
        this.mana = 100;
        this.carisma = 95;
    }

    public void distribuirPontos(int vidaPontos, int manaPontos, int carismaPontos) {
        int totalPontos = vidaPontos + manaPontos + carismaPontos;
        if (totalPontos > pontosRestantes) {
            System.out.println("Você tentou alocar mais pontos do que disponível!");
        } else {
            this.vida += vidaPontos;
            this.mana += manaPontos;
            this.carisma += carismaPontos;
            pontosRestantes -= totalPontos;
        }
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Carisma: " + carisma);
    }

    public void feitico() {
        System.out.println(nome + " Adquiriu um feitiço poderoso!");
    }
}