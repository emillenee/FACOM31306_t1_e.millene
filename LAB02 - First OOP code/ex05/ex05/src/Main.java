public class Main {
    public static void main(String[] args) {
        //MANAUS
        Candidatos marcelo = new Candidatos("Marcelo Ramos Rodrigues", "29/08/1973",
                "Masculino", 1598044.77, false, 13, "Prefeito");
        Candidatos alberto = new Candidatos("Alberto Barros Cavalcante", "05/05/1982",
                "Masculino", 725395.42, false, 22, "Prefeito");
        Candidatos roberto = new Candidatos("Roberto Cidade", "02/10/1986",
                "Masculino", 4338285.27, false, 44, "Prefeito");

        Candidatos[] candidatosManaus = {marcelo, alberto, roberto};
        Eleicao eleicaoManaus = new Eleicao("Manaus", 2063689, candidatosManaus);

        //BANZAÊ
        Candidatos arnaldinho = new Candidatos("Arnaldo Andrade de Souza", "27/01/1977",
                "Masculino",650000.00, false, 25, "Prefeito");
        Candidatos patricia = new Candidatos("Patrícia Nascimento Almeida", "16/11/1979",
                "Feminino", 15000.00, false, 13, "Prefeito");
        Candidatos ramon = new Candidatos("Raimundo Fagner Leite Nunes", "20/04/1985",
                "Masculino", 380000.00, false, 15, "Prefeito");

        Candidatos[] candidatosBanzae = {arnaldinho, patricia, ramon};
        Eleicao eleicaoBanzae = new Eleicao("Banzaê", 11958, candidatosBanzae);

        System.out.println("Dados da eleição de Manaus:");
        eleicaoManaus.mostrarEleicao();

        System.out.println("Dados da eleição de Banzaê:");
        eleicaoBanzae.mostrarEleicao();
    }
}