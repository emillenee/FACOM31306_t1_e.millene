public class VIP extends Ingresso{
    protected double valorAdicional;

    public VIP(){
    }

    public VIP(double valor, double valorAdicional) {
        super(valor);
        this.valorAdicional = valorAdicional;
    }

    public double valorTotal(){
        return valor + valorAdicional;
    }
}
