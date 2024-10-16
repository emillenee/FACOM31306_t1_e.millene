public class CandidatoPrefeito extends Candidato {
    private String nomeVice;

    public CandidatoPrefeito(String nome, String dataNasc, String genero,
                             double totalBens, boolean reeleicao, int numPartido, String nomeVice) {
        super(nome, dataNasc, genero, totalBens, reeleicao, numPartido);
        this.nomeVice = nomeVice;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Nome vice: " + nomeVice;
    }
}