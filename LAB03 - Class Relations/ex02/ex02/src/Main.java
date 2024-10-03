public class Main {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Avenida Boa Viagem", "Recife", "PE");
        Evento evento = new Evento("Exposição de arte", endereco);

        System.out.println(evento.toString());
    }
}