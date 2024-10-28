public class C3 extends C2 {
    public String acao;
    protected String nivelDesimportancia;
    private int crisesExistenciais;

    public C3(){
        super();
        this.acao = "";
        this.nivelDesimportancia = "MAX";
        this.crisesExistenciais = 0;
        System.out.println("Classe C3: chamada do construtor padrão, sem parâmetros \n");
    }

    public C3(String nome, int identificacao, boolean existe,
              String adjetivo, String categoriaId, int anosExistencia,
              String acao, String nivelDesimportancia, int crisesExistenciais) {
        super(nome, identificacao, existe, adjetivo, categoriaId, anosExistencia);
        this.acao = acao;
        this.nivelDesimportancia = nivelDesimportancia;
        this.crisesExistenciais = crisesExistenciais;
        System.out.println("Classe C3: Chamada de contrutor com parâmetros \n");
    }

    @Override
    public String toString() {
        return  super.toString() +
                "Ação: " + acao + "\n" +
                "Nivel de Desimportância: " + nivelDesimportancia + "\n" +
                "Crises Existenciais: " + crisesExistenciais + "\n";
    }

    public void mostrar_atributos(){
        System.out.println("Nome: " + nome + "\n" +
                           "Identificação: " + identificacao + "\n" +
                           "Existe: " + (isExiste() ? "Sim" : "Não") + "\n" +
                           "Adjetivo: " + adjetivo + "\n" +
                           "Categoria Id: " + categoriaId + "\n" +
                           "Anos de Existência: " + getAnosExistencia() + "\n" +
                           "Ação: " + acao + "\n" +
                           "Nível de Desimportância: " + nivelDesimportancia + "\n" +
                           "Crises Existenciais: " + crisesExistenciais + "\n" +
                           "Ação: " + acao + "\n" +
                           "Nivel de Desimportância: " + nivelDesimportancia + "\n" +
                           "Crises Existenciais: " + crisesExistenciais + "\n");
    }

    public void mostrar_atributos_super(){
        System.out.println(toString());
    }
}
