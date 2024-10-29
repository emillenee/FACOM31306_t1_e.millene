public class Funcionario {
    private String nome;
    private String dataNasc;
    protected double salario;

    public Funcionario(){
        this.nome = "";
        this.dataNasc = "";
    }

    public Funcionario(String nome, String dataNasc) {
        this.nome = nome;
        this.dataNasc = dataNasc;
    }

    public String getNome() {
        return nome;
    }

    public double calcularSalario(){
        return salario;
    }
}
