import java.util.Arrays;

public class Pessoa {
    private String nome;
    private Livro[] livros; //A pessoa possui um livro

    public Pessoa(String nome, int quantidadeDeLivros) {
        this.nome = nome;
        this.livros = new Livro[quantidadeDeLivros];
    }

    public String getNome() {
        return nome;
    }

    public Livro[] getLivros() {
        return livros;
    }

    public void adicionarLivro(Livro livro){
        for(int i = 0; i < livros.length; i++){
            if(livros[i] == null){
                livros[i] = livro;
                return;
            }
        }
        System.out.println("Não foi possível adicionar pois o vetor está cheio");
    }

    @Override
    public String toString() {
        String info = "Nome: " + nome + "\n" + "Livros: \n";
        for(int i = 0; i < livros.length; i++){
            info += "- " + livros[i].toString() + "\n";
        }
        return info;
    }
}
