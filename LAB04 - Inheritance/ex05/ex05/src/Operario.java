public class Operario extends Funcionario{
    private double valorProducao;
    private double qdtProduzida;

    public Operario(){
    }

    public Operario(String nome, String dataNasc, double valorProducao, double qdtProduzida) {
        super(nome, dataNasc);
        this.valorProducao = valorProducao;
        this.qdtProduzida = qdtProduzida;
    }

    @Override
    public double calcularSalario(){
        return valorProducao * qdtProduzida;
    }
}
