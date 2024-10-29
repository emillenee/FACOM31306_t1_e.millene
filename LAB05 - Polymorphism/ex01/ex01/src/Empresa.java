public class Empresa {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[4];

        funcionarios[0] = new Chefe("João Silva", "02/1996", 5000);
        funcionarios[1] = new Vendedor("Ana Costa", "05/2002", 12, 1500);
        funcionarios[2] = new Operario("Carlos Almeida", "01/2004", 20, 150);
        funcionarios[3] = new Horista("Fernanda Gomes", "02/2001", 18, 180);


        FolhaPagamento folha = new FolhaPagamento(funcionarios);
        folha.gerarFolha();
    }
}
