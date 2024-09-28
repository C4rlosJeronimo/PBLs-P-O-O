class Guerreiro extends Personagem {
    private int forca;

    public Guerreiro() {
        super(); // Chama o construtor sem parâmetros da classe pai
        this.vida = 100;
        this.mana = 30;
        this.forca = 85;
    }

    public void distribuirPontos(int vidaPontos, int manaPontos, int forcaPontos) {
        int totalPontos = vidaPontos + manaPontos + forcaPontos;
        if (totalPontos > pontosRestantes) {
            System.out.println("Você tentou alocar mais pontos do que disponível!");
        } else {
            this.vida += vidaPontos;
            this.mana += manaPontos;
            this.forca += forcaPontos;
            pontosRestantes -= totalPontos;
        }
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Força: " + forca);
    }

    public void espada() {
        System.out.println(nome + " Adquiriu uma habilidade de Espada!");
    }
}