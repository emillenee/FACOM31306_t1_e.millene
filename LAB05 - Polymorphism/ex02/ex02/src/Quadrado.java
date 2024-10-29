public class Quadrado extends FormaBidimensional{
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public String descricao(){
        return "Quadrado de lado " + lado;
    }

    @Override
    public double obterArea(){
        return Math.pow(lado, 2);
    }
}
