public class Funcionario {
    private String cpf;
    private String nome;
    private double salario;
    private double tetoSalarial = 40000;

    public Funcionario(String cpf, String nome, double salario) {
        this.cpf = cpf;
        this.nome = nome;
        setSalario(salario);
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        if(salario < 0){
            throw new SalarioInvalidoException("Valor inválido de salário");
        }else if(salario > tetoSalarial){
            throw new SalarioInvalidoException("Valor ultrapassa o teto salarial");
        }
        this.salario = salario;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setTetoSalarial(double tetoSalarial) {
        this.tetoSalarial = tetoSalarial;
    }

    public double getTetoSalarial() {
        return tetoSalarial;
    }

    public void aumentarSalario(double percentual){
        if(percentual < 0){
            throw new IllegalArgumentException("Percentual inválido");
        }
        setSalario(salario * (1 + (percentual / 100)));
    }
}
