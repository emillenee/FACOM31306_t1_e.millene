public class Main {
    public static void main(String[] args) {
        Forma[] formas = new Forma[5];
        formas[0] = new Circulo(4);
        formas[1] = new Quadrado(7);
        formas[2] = new Triangulo(5, 6);
        formas[3] = new Esfera(8);
        formas[4] = new Cubo(9);

        for(Forma f : formas){
            System.out.println(f.descricao());
            if(f instanceof FormaBidimensional){
                System.out.println("Área: " + ((FormaBidimensional) f).obterArea() + "\n");
            }else if(f instanceof FormaTridimensional){
                System.out.println("Volume: " + ((FormaTridimensional) f).obterVolume() + "\n");
            }
        }
    }
}