public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("A metamorfose", "Franz Kafka");
        Livro livro2 = new Livro("Sentimento do mundo", "Carlos Drummond de Andrade");

        Pessoa raquel = new Pessoa("Raquel", 2);
        raquel.adicionarLivro(livro1);
        raquel.adicionarLivro(livro2);

        System.out.println(raquel.toString());
    }
}