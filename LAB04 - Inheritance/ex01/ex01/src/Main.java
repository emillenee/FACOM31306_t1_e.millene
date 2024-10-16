public class Main {
    public static void main(String[] args) {
        CandidatoPrefeito prefeito = new CandidatoPrefeito("João Silva", "01/01/1970", "Masculino", 500000.00, false, 45, "Maria Souza");
        CandidatoVereador vereador = new CandidatoVereador("Ana Pereira", "15/05/1985", "Feminino", 250000.00, true, 11, "Centro");

        System.out.println(prefeito.toString());
        System.out.println();
        System.out.println(vereador.toString());
    }
}