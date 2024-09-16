public class Eleicao {
    private String municipio;
    private int numVotantes;
    private Candidatos[] candidatos;

    public Eleicao(String municipio, int numVotantes, Candidatos[] candidatos){
        this.municipio = municipio;
        this.numVotantes = numVotantes;
        this.candidatos = candidatos;
    }

    public String getMunicipio(){
        return municipio;
    }
    public int getNumVotantes() {
        return numVotantes;
    }
    public Candidatos[] getCandidatos(){
        return candidatos;
    }

    public void setMunicipio(String municipio){
        this.municipio = municipio;
    }
    public void setNumVotantes(int numVotantes){
        this.numVotantes = numVotantes;
    }
    public void setCandidatos(Candidatos[] candidatos){
        this.candidatos = candidatos;
    }

    public void mostrarEleicao(){
        System.out.println("Município: " + municipio);
        System.out.println("Número de Votantes: " + numVotantes);
        System.out.println("Candidatos:");
        for(Candidatos c : candidatos){
            c.panfleto();
        }
    }

    public void mostrarBens(){
        Candidatos candidatoBens = candidatos[0];
        double totalBens = candidatoBens.getBens();

        for(Candidatos c : candidatos){
            totalBens += c.getBens();
            if(c.getBens() > candidatoBens.getBens()){
                candidatoBens = c;
            }
        }

        double porcentagemBens = (candidatoBens.getBens() / totalBens) * 100;

        System.out.println("Candidato com maior valor de bens:");
        candidatoBens.panfleto();
        System.out.printf("Porcentagem em relação ao total: %.1f%%", porcentagemBens);
    }
}
