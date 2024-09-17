public class Main {
    public static void main(String[] args) {

        Produto shampoo = new Produto("Shampoo", 35.0, 50);
        Produto condicionador = new Produto("Condicionador", 37.8,47);
        Produto cremePentear = new Produto("Creme de pentear", 31.9, 64);
        Produto hidratante = new Produto("Hidratante", 39.9, 53);
        Produto oleo = new Produto("Óleo de argan", 24.3, 46);

        Produto[] produtosBeleza = {shampoo, condicionador, cremePentear, hidratante, oleo};

        System.out.println("Os produtos ordenados são:");
        ordenarProdutos(produtosBeleza);
        for(Produto p : produtosBeleza){
            p.mostrarProduto();
        }
    }

    public static void ordenarProdutos(Produto[] produtos){
        for (int i = 0; i < produtos.length - 1; i++) {
            int menor = i;
            for (int j = i + 1; j < produtos.length; j++) {
                if (produtos[j].getNome().compareTo(produtos[menor].getNome()) < 0) {
                    menor = j;
                }
            }
            if(menor != i){
                Produto temp = produtos[menor];
                produtos[menor] = produtos[i];
                produtos[i] = temp;
            }
        }
    }
}