public class CamaroteSuperior extends VIP{
    private String localizacao;

    public CamaroteSuperior(double valor, double valorAdicional, String localizacao) {
        super(valor, valorAdicional);
        this.localizacao = localizacao;
    }

    public void imprimeValor(){
        System.out.println("Valor ingresso: R$" + (valor + valorAdicional));
    }
}
