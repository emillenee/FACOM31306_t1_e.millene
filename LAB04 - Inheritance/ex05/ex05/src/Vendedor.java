public class Vendedor extends Funcionario{
    private double comissao;
    private double vendas;

    public Vendedor() {
    }

    public Vendedor(String nome, String dataNasc, double comissao, double vendas) {
        super(nome, dataNasc);
        this.comissao = comissao;
        this.vendas = vendas;
    }

//    public void setVendas(double vendas) {
//        this.vendas = vendas;
//    }

    @Override
    public double calcularSalario(){
        return salario + (comissao * vendas);
    }
}
