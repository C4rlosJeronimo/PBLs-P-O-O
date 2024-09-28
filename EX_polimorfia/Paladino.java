class Paladino extends Personagem {
    private int fe;

    public Paladino() {
        super();
        this.vida = 80;
        this.mana = 60;
        this.fe = 90;
    }

    public void distribuirPontos(int vidaPontos, int manaPontos, int fePontos) {
        int totalPontos = vidaPontos + manaPontos + fePontos;
        if (totalPontos > pontosRestantes) {
            System.out.println("Você tentou alocar mais pontos do que disponível!");
        } else {
            this.vida += vidaPontos;
            this.mana += manaPontos;
            this.fe += fePontos;
            pontosRestantes -= totalPontos;
        }
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Fé: " + fe);
    }

    public void curar() {
        System.out.println(nome + " Adquiriu uma habilidade de cura!");
    }
}
