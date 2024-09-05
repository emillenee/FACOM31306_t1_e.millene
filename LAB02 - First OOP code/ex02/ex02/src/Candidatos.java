public class Candidatos {
    private String nome;
    private String dataNasc;
    private String genero;
    private double bens;
    private boolean reeleicao;
    private int numP;
    private String cargo;

    public Candidatos(String nome, String dataNasc, String genero,
                      double bens, boolean reeleicao, int numP, String cargo){
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.genero = genero;
        this.bens = bens;
        this.reeleicao = reeleicao;
        this.numP = numP;
        this.cargo = cargo;
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

    public double getBens() {
        return bens;
    }

    public boolean isReeleicao() {
        return reeleicao;
    }

    public int getNumP() {
        return numP;
    }

    public String getCargo() {
        return cargo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setBens(double bens) {
        this.bens = bens;
    }

    public void setReeleicao(boolean reeleicao) {
        this.reeleicao = reeleicao;
    }

    public void setNumP(int numP) {
        this.numP = numP;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void panfleto() {
        System.out.println("-------------------------------");
        System.out.printf("Nome: %s\n", nome);
        System.out.printf("Data de Nascimento: %s\n", dataNasc);
        System.out.printf("Gênero: %s\n", genero);
        System.out.printf("Bens: R$ %.2f\n", bens);
        System.out.printf("Reeleição: %s\n", reeleicao ? "Sim" : "Não");
        System.out.printf("Número do Partido: %d\n", numP);
        System.out.printf("Cargo: %s\n", cargo);
        System.out.println("-------------------------------");
        System.out.println(" ");
    }
}