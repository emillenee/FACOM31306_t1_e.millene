public class CandidatoVereador extends Candidato {
    private String bairro;

    public CandidatoVereador(String nome, String dataNasc, String genero,
                             double totalBens, boolean reeleicao, int numPartido, String bairro) {
        super(nome, dataNasc, genero, totalBens, reeleicao, numPartido);
        this.bairro = bairro;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Bairro: " + bairro;
    }
}
