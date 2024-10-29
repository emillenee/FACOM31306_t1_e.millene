public class Esfera extends FormaTridimensional{
    private double raio;

    public Esfera(double raio) {
        this.raio = raio;
    }

    @Override
    public String descricao(){
        return "Esfera de raio " + raio;
    }

    @Override
    public double obterArea() {
        return 4 * Math.PI * Math.pow(raio, 2);
    }

    @Override
    public double obterVolume() {
        return (4.0/3.0) * Math.PI * Math.pow(raio, 3);
    }
}
