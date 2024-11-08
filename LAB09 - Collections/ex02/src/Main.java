import java.util.*;
public class Main {

    public static void main(String[] args) {

        // Estudante de Graduação
        Estudante a = new EstudanteGraduacao("Ana", "Rua Verão", "Data Science");
        Estudante b = new EstudanteGraduacao("Paulo", "Rua Autonomia", "Design Gráfico");
        Estudante c = new EstudanteGraduacao("João", "Rua Sabedoria", "Análise de Dados");

        // Estudante de Mestrado
        Estudante d = new EstudanteMestrado("Lucas", "Rua Conhecimento", "Engenharia",
                "Inteligência Artificial", "tecnológico", "Redes Neurais");
        Estudante e = new EstudanteMestrado("Fernanda", "Rua Pesquisa", "Biologia",
                "Estudos de Biodiversidade", "ambiental", "Conservação de Espécies");
        Estudante f = new EstudanteMestrado("Carlos", "Rua Ciência", "Química",
                "Soluções Inorgânicas", "experimental", "Catalisadores");


        Deque<Estudante> deque = new ArrayDeque<>();

        try{
            deque.addLast(a);
            deque.addFirst(b);
            deque.addLast(c);
        } catch (IllegalStateException ex){
            System.out.println(ex.getMessage());
        }

        deque.add(d);
        deque.add(e);
        deque.add(f);


        for(Estudante es : deque) es.print();
    }
}
