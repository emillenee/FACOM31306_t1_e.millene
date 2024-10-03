public class Computador {
    private String marca;
    private Processador processador;

    public Computador(String marca, String modeloP) {
        this.marca = marca;
        this.processador = new Processador(modeloP);
    }

    public String getMarca() {
        return marca;
    }

    public Processador getProcessador() {
        return processador;
    }

    @Override
    public String toString() {
        return "Computador \n" + "- Marca: " + marca + "\n- " + processador.toString();
    }
}
