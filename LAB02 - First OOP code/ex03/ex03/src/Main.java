public class Main {
    public static void main(String[] args) {
        int qtd = 3;
        Candidatos[] candidato = new Candidatos[qtd];

        String[] nomes = {"Marcelo Ramos Rodrigues", "Alberto Barros Cavalcante", "Roberto Cidade"};
        String[] datasNasc = {"29/08/1973", "05/05/1982", "02/10/1986"};
        String[] generos = {"Masculino", "Masculino", "Masculino"};
        double[] bens = {1598044.77, 725395.42, 4338285.27};
        boolean[] reeleicoes = {false, false, false};
        int[] numerosP = {13, 22, 44};
        String[] cargos = {"Prefeito", "Prefeito", "Prefeito"};

        for(int i = 0; i < qtd; i++){
            candidato[i] = new Candidatos(nomes[i], datasNasc[i], generos[i], bens[i], reeleicoes[i], numerosP[i], cargos[i]);
        }

        for(Candidatos c : candidato){
            c.panfleto();
        }
    }
}