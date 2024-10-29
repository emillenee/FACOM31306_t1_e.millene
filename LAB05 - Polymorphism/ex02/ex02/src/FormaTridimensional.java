public class FormaTridimensional extends Forma{
    protected double area;
    protected double volume;

    public FormaTridimensional() {
    }

    @Override
    public String descricao(){
        return "Forma Tridimensional";
    }

    public double obterArea(){
        return area;
    }

    public double obterVolume(){
        return volume;
    }
}
