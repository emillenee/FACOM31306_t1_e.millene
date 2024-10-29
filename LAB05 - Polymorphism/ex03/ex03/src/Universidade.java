public class Universidade {
    private String nome;
    private String dataFundacao;
    private Estudante[] alunos = new Estudante[100];

    public Universidade(String nome, String dataFundacao, Estudante[] alunos) {
        this.nome = nome;
        this.dataFundacao = dataFundacao;
        this.alunos = alunos;
    }

    public void mostrarQuantidade(){
        int grad = 0, mestrado = 0, doutorado = 0;
        for(Estudante a : alunos){
            if(a instanceof EstudanteGraduacao) grad++;
            else if(a instanceof EstudanteMestrado) mestrado++;
            else if(a instanceof EstudanteDoutorado) doutorado++;
        }
        System.out.println("Quantidade de alunos: ");
        System.out.println("Graduação: " + grad);
        System.out.println("Mestrado: " + mestrado);
        System.out.println("Doutorado: " + doutorado);
    }

    public void mostrarInfo(){
        for(Estudante a : alunos){
            if(a instanceof EstudanteDoutorado){
                System.out.println("Nome: " + a.getNome());
                System.out.println("Tese: " + ((EstudanteDoutorado) a).getTituloTese());
            }else{
                System.out.println("Nome: " + a.getNome());
            }
        }
    }
}
