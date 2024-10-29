public class FormaBidimensional extends Forma{
    protected double area;

    public FormaBidimensional() {
    }

    @Override
    public String descricao(){
        return "Forma Bidimensional";
    }

    public double obterArea(){
        return area;
    }
}
