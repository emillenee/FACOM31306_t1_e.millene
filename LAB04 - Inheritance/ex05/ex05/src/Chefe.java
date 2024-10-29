public class Chefe extends Funcionario{
    public Chefe() {
    }

    public Chefe(String nome, String dataNasc, double salario) {
        super(nome, dataNasc);
        this.salario = salario;
    }
}
