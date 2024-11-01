public class Main {
    public static void main(String[] args) {
        Operacao operacao = new Operacao();

        System.out.println("Tentativa de divisão por 2:");
        operacao.iniciarOperacao(10, 2);

        System.out.println("Tentativa de divisão por 0:");
        operacao.iniciarOperacao(10, 0);
    }
}