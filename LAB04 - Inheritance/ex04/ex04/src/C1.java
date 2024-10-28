public class C1 {
    public String nome;
    protected int identificacao;
    private boolean existe;

    public boolean isExiste() {
        return existe;
    }

    public void setExiste(boolean existe) {
        this.existe = existe;
    }

    public C1(){
        this.nome = "";
        this.identificacao = 0;
        this.existe = false;
        System.out.println("Classe C1: chamada do construtor padrão sem parâmetros");
    }

    public C1(String nome, int identificacao, boolean existe) {
        this.nome = nome;
        this.identificacao = identificacao;
        this.existe = existe;
        System.out.println("Classe C1: Chamada de contrutor com parâmetros");
    }


    @Override
    public String toString() {
        return "Nome: " + nome + "\n" +
                "Identificação: " + identificacao + "\n" +
                "Existe: " + (existe ? "Sim" : "Não") + "\n";
    }

    public void mostrar_atributos(){
        System.out.println(toString());
    }
}