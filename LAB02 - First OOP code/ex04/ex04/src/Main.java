public class Main {
    public static void main(String[] args) {
        Candidatos marcelo = new Candidatos("Marcelo Ramos Rodrigues", "29/08/1973",
                "Masculino", 2000000.00, false, 13, "Prefeito");
        Candidatos alberto = new Candidatos("Alberto Barros Cavalcante", "05/05/1982",
                "Masculino", 725395.42, true, 22, "Prefeito");
        Candidatos roberto = new Candidatos("Roberto Cidade", "02/10/1986",
                "Masculino", 4338285.27, false, 55, "Prefeito");

        System.out.println("Candidatos com atributos errados: \n");
        marcelo.panfleto();
        alberto.panfleto();
        roberto.panfleto();

        marcelo.setBens(1598044.77);
        alberto.setReeleicao(false);
        roberto.setNumP(44);

        System.out.println("Candidatos com atributos corrigidos: \n");
        marcelo.panfleto();
        alberto.panfleto();
        roberto.panfleto();
    }
}