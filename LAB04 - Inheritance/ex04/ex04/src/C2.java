public class C2 extends C1 {
    public String adjetivo;
    protected String categoriaId;
    private int anosExistencia;

    public C2(){
        super();
        this.adjetivo = "";
        this.categoriaId = "";
        this.anosExistencia = 0;
        System.out.println("Classe C2: chamada do construtor padrão, sem parâmetros");
    }

    public C2(String nome, int identificacao, Boolean existe,
              String adjetivo, String categoriaId, int anosExistencia) {
        super(nome, identificacao, existe);
        this.adjetivo = adjetivo;
        this.categoriaId = categoriaId;
        this.anosExistencia = anosExistencia;
        System.out.println("Classe C2: Chamada de contrutor com parâmetros");
    }

    public int getAnosExistencia() {
        return anosExistencia;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "Adjetivo: " + adjetivo + "\n" +
                "Categoria Id: " + categoriaId + "\n" +
                "Anos de Existência: " + anosExistencia + "\n";
    }

    public void mostrar_atributos(){
        System.out.println("Nome: " + super.nome + "\n" +
                           "Identificação: " + super.identificacao + "\n" +
                           "Existe: " + (isExiste() ? "Sim" : "Não") + "\n" +
                           "Adjetivo: " + adjetivo + "\n" +
                           "Categoria Id: " + categoriaId + "\n" +
                           "Anos de Existência: " + anosExistencia + "\n");
    }

    public void mostrar_atributos_super(){
        System.out.println(toString());
    }
}
