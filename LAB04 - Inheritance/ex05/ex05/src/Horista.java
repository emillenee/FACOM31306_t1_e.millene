public class Horista extends Funcionario{
    private double valorHora;
    private double totalHoras;

    public Horista(){
    }

    public Horista(String nome, String dataNasc, double valorHora, double totalHoras) {
        super(nome, dataNasc);
        this.valorHora = valorHora;
        this.totalHoras = totalHoras;
    }

    @Override
    public double calcularSalario(){
        return valorHora * totalHoras;
    }
}
