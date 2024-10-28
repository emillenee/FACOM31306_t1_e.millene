public class Main {
    public static void main(String[] args) {
        C1 objeto1 = new C1("João Frango", 3, false);
        C2 objeto2 = new C2("Hamilton", 44, true, "GOAT", "Piloto F1", 39);
        C3 objeto3 = new C3("Senna", 1, true, "Lenda", "Piloto F1", 34, "Correr", "Mínimo", 3);

        objeto1.mostrar_atributos();
        objeto2.mostrar_atributos_super();
        objeto3.mostrar_atributos_super();
    }
}