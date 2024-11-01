public class Main {
    public static void main(String[] args) {
        Funcionario f = new Funcionario("12345678900", "João", 30000);
        try {
            f.aumentarSalario(50); //Tentativa de aumentar em 50%
            System.out.println("Salário atual: " + f.getSalario());
        } catch (SalarioInvalidoException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Valor final do salário: " + f.getSalario());
        }
    }
}