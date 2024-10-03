public class Evento {
    private String nome;
    private Endereco endereco;

    public Evento(String nome, Endereco endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    @Override
    public String toString() {
        return "Evento: " + nome + " será realizado em " + endereco.toString();
    }
}
