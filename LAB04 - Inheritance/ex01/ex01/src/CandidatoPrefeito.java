public class CandidatoPrefeito {
    private String nome;
    private String dataNasc;
    private String genero;
    private double totalBens;
    private boolean reeleicao;
    private int numPartido;
    private String nomeVice;

    public CandidatoPrefeito(String nome, String dataNasc, String genero,
                             double totalBens, boolean reeleicao, int numPartido, String nomeVice) {
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.genero = genero;
        this.totalBens = totalBens;
        this.reeleicao = reeleicao;
        this.numPartido = numPartido;
        this.nomeVice = nomeVice;
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

    public String getNomeVice() {
        return nomeVice;
    }

    @Override
    public String toString() {
        return "Prefeito: " + nome + "\n" +
                "Data de Nascimento: " + dataNasc + "\n" +
                "Gênero: " + genero + "\n" +
                "Total de Bens: " + totalBens + "\n" +
                "Candidato à Reeleição: " + (reeleicao ? "Sim" : "Não") + "\n" +
                "Número do Partido: " + numPartido + "\n" +
                "Nome do Vice-Prefeito: " + nomeVice;
    }
}