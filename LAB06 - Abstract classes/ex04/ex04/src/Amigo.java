public class Amigo extends Contato{
    private String grau;

    public Amigo(String apelido, String nome, String email, String aniversario, String grau) {
        super(apelido, nome, email, aniversario);
        this.grau = grau;
    }

    public String getGrau() {
        return grau;
    }

    @Override
    public String imprimirContato(){
        return super.imprimirBasico() +
                "\nGrau: " + grau;
    }
}
