public class FolhaPagamento {
    private Funcionario[] funcionarios;

    public FolhaPagamento(Funcionario[] funcionarios) {
        this.funcionarios = funcionarios;
    }

    public void gerarFolha(){
        System.out.println("Folha de Pagamento: \n");
        for(Funcionario f : funcionarios){
            System.out.println("Nome: " + f.getNome());
            System.out.println("Salário: R$" + f.calcularSalario());
            System.out.println("==========================");
        }
    }
}
