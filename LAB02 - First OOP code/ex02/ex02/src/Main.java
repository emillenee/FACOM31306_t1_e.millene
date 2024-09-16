public class Main {
    public static void main(String[] args) {
        Candidatos marcelo = new Candidatos();
        marcelo.setNome("Marcelo Ramos Rodrigues");
        marcelo.setDataNasc("29/08/1973");
        marcelo.setGenero("Masculino");
        marcelo.setBens(2000000.00);
        marcelo.setReeleicao(false);
        marcelo.setNumP(13);
        marcelo.setCargo("Prefeito");

        Candidatos alberto = new Candidatos();
        alberto.setNome("Alberto Barros Cavalcante");
        alberto.setDataNasc("05/05/1982");
        alberto.setGenero("Masculino");
        alberto.setBens(725395.42);
        alberto.setReeleicao(true);
        alberto.setNumP(22);
        alberto.setCargo("Prefeito");

        Candidatos roberto = new Candidatos();
        roberto.setNome("Roberto Cidade");
        roberto.setDataNasc("02/10/1986");
        roberto.setGenero("Masculino");
        roberto.setBens(4338285.27);
        roberto.setReeleicao(false);
        roberto.setNumP(55);
        roberto.setCargo("Prefeito");

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