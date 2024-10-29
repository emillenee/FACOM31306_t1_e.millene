public class Circulo extends FormaBidimensional{
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public String descricao(){
        return "Círculo de raio " + raio;
    }

    @Override
    public double obterArea() {
        return Math.PI * Math.pow(raio, 2);
    }
}
