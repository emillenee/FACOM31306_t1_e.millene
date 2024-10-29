public class Main {
    public static void main(String[] args) {

        Estudante[] alunos = new Estudante[5];
        alunos[0] = new EstudanteDoutorado("Bruno","Rua Inverno",
                "Tecnologia","Processamento de Imagens","Carros Inteligentes");
        alunos[1] = new EstudanteMestrado("Carla","Rua Primavera","Medicina",
                "Vacinas de RNA", "academico","Anticorpos");
        alunos[2] = new EstudantePosGrad("Ailton","Rua 31 de fevereiro","Engenharia",
                "Banco de Dados");
        alunos[3] = new EstudanteGraduacao("Maria", "Rua Maio", "Java is funny");
        alunos[4] = new EstudantePosGrad("Ailton","Rua 31 de fevereiro","Engenharia",
                "Banco de Dados");

        Universidade uni = new Universidade("Universidade Federal", "1900", alunos);

        EstudantePosGrad[] posGraduados = new EstudantePosGrad[5];
        int index = 0;
        for(Estudante a : alunos){
            if(a instanceof EstudantePosGrad){
                posGraduados[index] = (EstudantePosGrad) a;
                index++;
            }
        }

        for(EstudantePosGrad a : posGraduados){
            if(a != null){
                a.print(true);
            }
        }
    }
}
