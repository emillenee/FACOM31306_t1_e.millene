public class Main {
    public static void main(String[] args) {
        //MANAUS
        Candidatos marcelo = new Candidatos("Marcelo Ramos Rodrigues", "29/08/1973",
                "Masculino", 1598044.77, false, 13, "Prefeito");
        Candidatos alberto = new Candidatos("Alberto Barros Cavalcante", "05/05/1982",
                "Masculino", 725395.42, false, 22, "Prefeito");
        Candidatos roberto = new Candidatos("Roberto Cidade", "02/10/1986",
                "Masculino", 4338285.27, false, 44, "Prefeito");
        Candidatos mauricio = new Candidatos("Maurício Wilker", "01/08", "Masculino",
                2651012.02, false, 33, "Prefeito");
        Candidatos amom = new Candidatos("Amom Mandel Lins Filho", "02/01/2001",
                "Masculino", 523449.62, false, 23, "Prefeito");

        Candidatos[] candidatosManaus = {marcelo, alberto, roberto, mauricio, amom};
        Eleicao eleicaoManaus = new Eleicao("Manaus", 2063689, candidatosManaus);

        eleicaoManaus.mostrarBens();
    }
}