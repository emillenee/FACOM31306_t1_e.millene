public class Candidatos {
    String nome;
    String dataNasc;
    String genero;
    double bens;
    boolean reeleicao;
    int numP;
    String cargo;

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

    public void panfleto() {
        System.out.println("******************************");
        System.out.printf("Nome: %s\n", nome);
        System.out.printf("Data de Nascimento: %s\n", dataNasc);
        System.out.printf("Gênero: %s\n", genero);
        System.out.printf("Bens: R$ %.2f\n", bens);
        System.out.printf("Reeleição: %s\n", reeleicao ? "Sim" : "Não");
        System.out.printf("Número do Partido: %d\n", numP);
        System.out.printf("Cargo: %s\n", cargo);
        System.out.println("******************************");
        System.out.println(" ");
    }
}