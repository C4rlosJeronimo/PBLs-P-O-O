class Personagem {
    protected String nome;
    protected int nivel;
    protected int vida;
    protected int mana;
    protected int pontosRestantes;

    public Personagem() {
        this.nome = "Desconhecido";
        this.nivel = 1;
        this.vida = 0;
        this.mana = 0;
        this.pontosRestantes = 10;
    }

    public Personagem(String nome, int nivel) {
        this.nome = nome;
        this.nivel = nivel;
        this.pontosRestantes = nivel * 10;
    }


    public void distribuirPontos(int vidaPontos, int manaPontos) {
        if (vidaPontos + manaPontos > pontosRestantes) {
            System.out.println("Você tentou alocar mais pontos do que disponível!");
        } else {
            this.vida += vidaPontos;
            this.mana += manaPontos;
            pontosRestantes -= (vidaPontos + manaPontos);
        }
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome + ", Nível: " + nivel + ", Vida: " + vida + ", Mana: " + mana);
    }


}