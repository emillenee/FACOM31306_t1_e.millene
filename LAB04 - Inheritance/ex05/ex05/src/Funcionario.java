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

//    public void setSalario(double salario) {
//        if(calcularSalario() > 0){
//            this.salario = calcularSalario();
//        }else{
//            System.out.println("Valor de salário inválido\n");
//        }
//    }

    public double calcularSalario(){
        return salario;
    }
}
