public class Tetraedro extends FormaTridimensional{
    private double lado;
    private double areaBase;
    private double altura;

    public Tetraedro(double lado, double areaBase, double altura) {
        this.lado = lado;
        this.areaBase = areaBase;
        this.altura = altura;
    }

    @Override
    public String descricao(){
        return "Tetraedro de lado " + lado;
    }

    @Override
    public double obterArea() {
        return Math.pow(lado, 2) * Math.sqrt(3);
    }

    @Override
    public double obterVolume() {
        return (1.0/3.0) * areaBase * altura;
    }
}
