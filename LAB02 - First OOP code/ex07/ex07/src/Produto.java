public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(){
        this.nome = "";
        this.preco = 0.0;
        this.quantidade = 0;
    }

    public Produto(String nome, double preco, int quantidade){
        this.nome= nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome(){
        return nome;
    }
    public double getPreco(){
        return preco;
    }
    public int getQuantidade(){
        return quantidade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setPreco(double preco){
        if(preco >= 0){
            this.preco = preco;
        } else{
            System.out.println("Preço não pode ser um valor negativo.");
        }
    }
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    public void mostrarProduto(){
        System.out.println("-------------------");
        System.out.printf("Nome: %s\n", nome);
        System.out.printf("Preço: %.2f\n", preco);
        System.out.printf("Estoque: %d\n", quantidade);
        System.out.println("-------------------");
    }
}