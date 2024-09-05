public class Main {
    public static void main(String[] args) {
        Candidatos marcelo = new Candidatos("Marcelo Ramos Rodrigues", "29/08/1973",
                "Masculino", 1598044.77, false, 13, "Prefeito");
        Candidatos alberto = new Candidatos("Alberto Barros Cavalcante", "05/05/1982",
                "Masculino", 725395.42, false, 22, "Prefeito");
        Candidatos roberto = new Candidatos("Roberto Cidade", "02/10/1986",
                "Masculino", 4338285.27, false, 44, "Prefeito");

        marcelo.panfleto();
        alberto.panfleto();
        roberto.panfleto();
    }
}