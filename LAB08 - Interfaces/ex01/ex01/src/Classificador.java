public class Classificador {
    public void ordena(Classificavel[] a) {
        Classificavel elem, menor;
        int pos;

        for (int i = 0; i < a.length - 1; i++) {
            elem = a[i];
            menor = a[i + 1];
            pos = i + 1;

            for (int j = i + 2; j < a.length; j++) {
                if (a[j].eMenorQue(menor)) { // encontrando o menor elemento
                    menor = a[j];
                    pos = j;
                }
            }

            if (menor.eMenorQue(elem)) { // troca
                a[i] = a[pos];
                a[pos] = elem;
            }
        }
    }
}