public class CandidatoVereador {
    private String nome;
    private String dataNasc;
    private String genero;
    private double totalBens;
    private boolean reeleicao;
    private int numPartido;
    private String bairro;

    public CandidatoVereador(String nome, String dataNasc, String genero,
                             double totalBens, boolean reeleicao, int numPartido, String bairro) {
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.genero = genero;
        this.totalBens = totalBens;
        this.reeleicao = reeleicao;
        this.numPartido = numPartido;
        this.bairro = bairro;
    }

    public String getNome() {
        return nome;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public String getGenero() {
        return genero;
    }

    public double getTotalBens() {
        return totalBens;
    }

    public boolean isReeleicao() {
        return reeleicao;
    }

    public int getNumPartido() {
        return numPartido;
    }

    public String getBairro() {
        return bairro;
    }

    @Override
    public String toString() {
        return "Vereador: " + nome + "\n" +
                "Data de Nascimento: " + dataNasc + "\n" +
                "Gênero: " + genero + "\n" +
                "Total de Bens: " + totalBens + "\n" +
                "Candidato à Reeleição: " + (reeleicao ? "Sim" : "Não") + "\n" +
                "Número do Partido: " + numPartido + "\n" +
                "Bairro: " + bairro;
    }
}
