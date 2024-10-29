public class Main {
    public static void main(String[] args) {
        Ingresso ingressoNormal = new Normal(50);
        VIP ingressoVip = new VIP(100, 50);
        CamaroteInferior ingressoCamaroteInferior = new CamaroteInferior(150, 100, "Setor B");
        CamaroteSuperior ingressoCamaroteSuperior = new CamaroteSuperior(200, 150, "Setor A");

        ingressoNormal.escreveValor();
        ingressoVip.escreveValor();
        System.out.println("Valor total do VIP: R$" + ingressoVip.valorTotal());
        ingressoCamaroteInferior.escreveValor();
        ingressoCamaroteInferior.imprimeLocalizacao();
        System.out.println("Valor total do Camarote Superior: R$" + ingressoCamaroteSuperior.valorTotal());
    }
}