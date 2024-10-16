public class Candidato {
    protected String nome;
    protected String dataNasc;
    protected String genero;
    protected double totalBens;
    protected boolean reeleicao;
    protected int numPartido;

    public Candidato(String nome, String dataNasc, String genero,
                     double totalBens, boolean reeleicao, int numPartido) {
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.genero = genero;
        this.totalBens = totalBens;
        this.reeleicao = reeleicao;
        this.numPartido = numPartido;
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

    @Override
    public String toString() {
        return "Nome: " + nome + "\n" +
                "Data de Nascimento: " + dataNasc + "\n" +
                "Gênero: " + genero + "\n" +
                "Total de Bens: " + totalBens + "\n" +
                "Candidato à Reeleição: " + (reeleicao ? "Sim" : "Não") + "\n" +
                "Número do Partido: " + numPartido;
    }
}
