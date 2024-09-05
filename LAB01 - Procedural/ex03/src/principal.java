import java.util.Scanner;

class Aluno{
    int numero;
    char classeSocial;
    double cra;

    Aluno(int num, char classe, double cra){
        this.numero = num;
        this.classeSocial = classe;
        this.cra = cra;
    }
}

public class principal {

    public static void ex01(){
        Scanner sc = new Scanner(System.in);
        int val1,val2,val3,val4,val5,val6;

        System.out.println("<< Listando um vetor >>");
        System.out.println("Entre com o número 1:");
        val1 = sc.nextInt();

        System.out.println("Entre com o número 2:");
        val2 = sc.nextInt();

        System.out.println("Entre com o número 3:");
        val3 = sc.nextInt();

        System.out.println("Entre com o número 4:");
        val4 = sc.nextInt();

        System.out.println("Entre com o número 5:");
        val5 = sc.nextInt();

        System.out.println("Entre com o número 6:");
        val6 = sc.nextInt();

        System.out.println("Os valores lidos são:");
        System.out.printf("%d %d %d %d %d %d ", val1, val2, val3, val4, val5, val6);
    }

    public static void ex02(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[6];
        System.out.println("<< Listando um vetor >>");

        for (int i = 0; i < 6; i++){
            System.out.printf("Entre com o número %d:\n",i+1);
            vet[i] = sc.nextInt();
        }

        System.out.println("Os valores lidos são:");
        for (int i = 0; i < 6; i++){
            System.out.printf("%d ",vet[i]);
        }
    }

    public static void ex03() {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[6];
        System.out.println("<< Listando um vetor >>");
        for(int i = 0; i < 6; i++){
            System.out.printf("Entre com um número %d:\n", i+1);
            vetor[i] = sc.nextInt();
        }
        System.out.println("A ordem inversa dos números é:");
        for(int i = 6; i > 0; i--){
            System.out.printf("%d ", vetor[i-1]);
        }
    }

    public static void ex04(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[6];
        System.out.println("<< Listando um vetor >>");

        int i = 0;
        while(i<6){
            System.out.println("Digite um número par:");
            int num = sc.nextInt();
            if(num % 2 == 0){
                vet[i] = num;
                i++;
            }else{
                System.out.println("Número inválido");
            }
        }

        System.out.println("Os valores lidos são:");
        for (int j = 0; j < 6; j++){
            System.out.printf("%d ",vet[j]);
        }
    }

    public static void ex05(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[5];
        System.out.println("<< Listando um vetor >>");

        int i = 0, maior = 0, menor = 0, total = 0;
        while(i<5){
            System.out.printf("Entre com um número %d:\n", i+1);
            vet[i] = sc.nextInt();
            total += vet[i];
            if(vet[i] > maior){
                maior = vet[i];
            } else if(vet[i] < menor){
                menor = vet[i];
            }
            i++;
        }
        float media = (float)total/5;
        System.out.println("Os números digitados são:");
        for (int j = 0; j < 5; j++){
            System.out.printf("%d ",vet[j]);
        }
        System.out.println("\n");
        System.out.printf("O maior valor é: %d\n", maior);
        System.out.printf("O menor valor é: %d\n", menor);
        System.out.printf("A média é: %.1f\n", media);
    }

    public static void ex06(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[5];
        System.out.println("<< Listando um vetor >>");

        int i = 0, maior = Integer.MIN_VALUE, pMaior = 0, menor = Integer.MAX_VALUE, pMenor = 0, total = 0;
        while(i<5){
            System.out.printf("Entre com um número %d:\n", i+1);
            vet[i] = sc.nextInt();
            total += vet[i];
            if(vet[i] > maior){
                maior = vet[i];
                pMaior = i;
            } else if(vet[i] < menor){
                menor = vet[i];
                pMenor = i;
            }
            i++;
        }
        float media = (float)total/5;
        System.out.println("Os números digitados são:");
        for (int j = 0; j < 5; j++){
            System.out.printf("%d ",vet[j]);
        }
        System.out.println("\n");
        System.out.printf("O maior valor é: %d, localizado na posição %d do vetor\n", maior, pMaior);
        System.out.printf("O menor valor é: %d, localizado na posição %d do vetor\n", menor, pMenor);
        System.out.printf("A média é: %.1f\n", media);
    }

    public static void ex07(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[5];
        System.out.println("<< Normalizando as notas >>");

        int num = 0;
        for(int i = 0; i < 5; i++){
            System.out.printf("Entre com a nota do aluno %d:\n", i+1);
            num = sc.nextInt();
            vet[i] = num*2;
        }

        System.out.println("\nNotas normalizadas\n");
        for(int i = 0; i < 5; i++){
            System.out.printf("A nota do aluno %d é %d\n", i+1, vet[i]);
        }
    }

    public static void ex08(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[5];
        System.out.println("<< Média e desvio padrão >>");

        int soma = 0;
        for(int i = 0; i < 5; i++){
            System.out.printf("Digite o valor %d:", i+1);
            vet[i] = sc.nextInt();
            soma += vet[i];
        }

        double media = soma / 5.0;
        double somaDiferencas = 0;
        for(int i = 0; i < 5; i++){
            somaDiferencas += Math.pow(vet[i] - media, 2);
        }
        double desvioPadrao = Math.sqrt(somaDiferencas / (5 - 1));
        System.out.println("A média é " + " " + media + " " + "e o desvio padrão é " + " " + desvioPadrao);
    }

    public static void ex09(){
        Scanner sc = new Scanner(System.in);
        System.out.println("<< Média de n alunos. Máximo 100 alunos >>");
        int tamanho = 0;
        do {
            System.out.printf("Entre com o número de alunos: ");
            tamanho = sc.nextInt();
            if (tamanho <= 0 || tamanho > 100) {
                System.out.println("Erro! O número máximo de alunos permitido é 100.");
            }
        } while (tamanho <= 0 || tamanho > 100);
        int[] vet = new int[tamanho];
        int soma = 0;

        for(int i = 0; i < tamanho; i++){
            System.out.printf("Digite a nota do aluno %d: ", i+1);
            vet[i] = sc.nextInt();
            soma += vet[i];
        }
        System.out.println("Relatório de notas");

        double media = (double) soma/tamanho;
        for(int i = 0; i < tamanho; i++){
            System.out.printf("A nota do aluno %d é: %d\n", i, vet[i]);
        }
        System.out.printf("A média da turma é: %.1f\n", media);
    }

    public static void ex10(){
        Scanner sc = new Scanner(System.in);
        System.out.println("<< Subtração de vetores >>");
        int[] vetA = new int[3];
        int[] vetB = new int[3];
        int[] vetC = new int[3];

        for(int i = 0; i<3; i++){
            System.out.printf("Digite o valor %d de A: ", i+1);
            vetA[i] = sc.nextInt();
        }
        for(int i = 0; i<3; i++){
            System.out.printf("Digite o valor %d de B: ", i+1);
            vetB[i] = sc.nextInt();
        }
        for(int i = 0; i<3; i++){
            vetC[i] = vetA[i] - vetB[i];
        }
        System.out.printf("O vetor C, definido como C=A-B é (%d, %d, %d)\n", vetC[0], vetC[1], vetC[2]);

    }

    public static void ex11(){
        Scanner sc = new Scanner(System.in);
        System.out.println("<< Pares e ímpares >>");
        int[] vetor = new int[5];
        int[] pares = new int[5];
        int[] impares = new int[5];
        int tPar = 0, tImp = 0;

        for(int i = 0; i < 5; i++){
            System.out.printf("Digite o valor %d: ", i+1);
            vetor[i] = sc.nextInt();
            if(vetor[i]%2 == 0){
               pares[tPar] = vetor[i];
                tPar++;
            }else{
                impares[tImp] = vetor[i];
                tImp++;
            }
        }

        System.out.printf("Ímpares: ");
        for (int i = 0; i < tImp; i++) {
            System.out.printf("%d, ", impares[i]);
        }

        System.out.printf("\nPares: ");
        for (int i = 0; i < tPar; i++) {
            System.out.printf("%d, ", pares[i]);
        }
    }

    public static void ex12(){
        Scanner sc = new Scanner(System.in);
        System.out.println("<< Probabilidades >>");
        String[] cores = {"Verde", "Azul", "Amarelo", "Vermelho"};
        int[] valores = new int[4];
        int total = 0;

        for(int i = 0; i<4; i++){
            System.out.printf(cores[i] + ": ");
            valores[i] = sc.nextInt();
            total += valores[i];
        }

        double[] probs = new double[4];
        for(int i = 0; i<4; i++){
            probs[i] = (double) valores[i] / total * 100;
        }

        double maiorProb = probs[0];
        int mProb = 0;
        for(int i = 1; i<4; i++){
            if(probs[i] > maiorProb){
                maiorProb = probs[i];
                mProb = i;
            }
        }
        System.out.println("Probabilidades\n");
        for (int i = 0; i < 4; i++) {
            if (i == mProb) {
                System.out.printf("%s: %.2f%% << Maior probabilidade\n", cores[i], probs[i]);
            } else {
                System.out.printf("%s: %.2f%%\n", cores[i], probs[i]);
            }
        }
    }

    public static void ex13(){
        Scanner sc = new Scanner(System.in);
        System.out.println("<< Zerando negativos >>");
        int[] vet = new int[5];
        for(int i = 0; i < 5; i++){
            System.out.printf("Entre com o número %d: ", i+1);
            vet[i] = sc.nextInt();
        }
        for(int i = 0; i<5; i++) {
            if (vet[i] < 0) {
                vet[i] = 0;
            }
        }
        System.out.printf("Zerando os negativos, obtém-se: ");
        for(int i = 0; i < 5; i++){
            System.out.printf("%d ", vet[i]);
        }
    }

    public static void ex14() {
        Scanner sc = new Scanner(System.in);
        System.out.println("<< Universidade >>");
        int quantidade = 0;
        do {
            System.out.printf("Quantos alunos serão cadastrados? ");
            quantidade = sc.nextInt();
            if (quantidade <= 0 || quantidade > 10000) {
                System.out.println("Erro! O número máximo de alunos permitido é 100.");
            }
        } while (quantidade <= 0 || quantidade > 10000);

        int[] numeros = new int[quantidade];
        char[] classes = new char[quantidade];
        double[] cras = new double[quantidade];

        for (int i = 0; i < quantidade; i++) {
            System.out.print("Entre com o número do aluno: ");
            numeros[i] = sc.nextInt();
            System.out.print("Entre com a classe social do aluno " + numeros[i] + ": ");
            classes[i] = sc.next().charAt(0);
            System.out.print("Entre com o CRA do aluno " + numeros[i] + ": ");
            cras[i] = sc.nextDouble();
        }

        System.out.println("==== Alunos Cadastrados ====");
        for (int i = 0; i < quantidade; i++) {
            System.out.printf("Número: %d Classe Social: %c CRA: %.2f\n", numeros[i], classes[i], cras[i]);
        }
    }

    public static void ex14Classe() {
        Scanner sc = new Scanner(System.in);
        System.out.println("<< Universidade >>");
        int quantidade = 0;
        do {
            System.out.printf("Quantos alunos serão cadastrados? ");
            quantidade = sc.nextInt();
            if (quantidade <= 0 || quantidade > 10000) {
                System.out.println("Erro! O número máximo de alunos permitido é 100.");
            }
        } while (quantidade <= 0 || quantidade > 10000);

        Aluno[] alunos = new Aluno[quantidade];

        for (int i = 0; i < quantidade; i++) {
            System.out.printf("Entre com o número do aluno: ");
            int numero = sc.nextInt();
            System.out.printf("Entre com a classe social do aluno " + numero + ": ");
            char classe = sc.next().charAt(0);
            System.out.print("Entre com o CRA do aluno " + numero + ": ");
            double cra = sc.nextDouble();
            alunos[i] = new Aluno(numero, classe, cra);
        }
        System.out.println("==== Alunos Cadastrados ====");
        for (int i = 0; i < quantidade; i++) {
            Aluno aluno = alunos[i];
            System.out.printf("Número: %d Classe Social: %c CRA: %.2f\n", aluno.numero, aluno.classeSocial, aluno.cra);
        }
    }

    public static void ex15(){
        Scanner sc = new Scanner(System.in);
        System.out.println("<< Valores iguais >>");
        int[] vet = new int[8];
        int[] vetResul = new int[8];
        for (int i = 0; i < 8; i++){
            System.out.printf("Entre com o número %d: ",i+1);
            vet[i] = sc.nextInt();
        }
        int tResul = 0;
        for (int i = 0; i < 8; i++) {
            int temp = vet[i];
            int jaExiste = 0;
            for (int j = 0; j < tResul; j++) {
                if (temp == vetResul[j]) {
                    jaExiste = 1;
                    break;
                }
            }
            if (jaExiste == 0) {
                for (int j = i + 1; j < 8; j++) {
                    if (temp == vet[j]) {
                        vetResul[tResul] = temp;
                        tResul++;
                        break;
                    }
                }
            }
        }
        System.out.println("Valores repetidos:");
        for (int i = 0; i < tResul; i++) {
            System.out.printf("%d ", vetResul[i]);
        }
    }

    public static void ex16(){
        Scanner sc = new Scanner(System.in);
        System.out.println("<< Valores iguais >>");
        int[] vet = new int[8];
        int[] vetResul = new int[8];
        int[] vetQ = new int[8];
        for (int i = 0; i < 8; i++){
            System.out.printf("Entre com o número %d: ",i+1);
            vet[i] = sc.nextInt();
        }
        int tResul = 0;
        for (int i = 0; i < 8; i++) {
            int temp = vet[i];
            int jaExiste = 0;
            for (int j = 0; j < tResul; j++) {
                if (temp == vetResul[j]) {
                    vetQ[j]++;
                    jaExiste = 1;
                    break;
                }
            }
            if (jaExiste == 0) {
                for (int j = i + 1; j < 8; j++) {
                    if (temp == vet[j]) {
                        vetResul[tResul] = temp;
                        vetQ[tResul] = 1;
                        tResul++;
                        break;
                    }
                }
            }
        }
        System.out.println("Valores repetidos:");
        for (int i = 0; i < tResul; i++) {
            System.out.printf("%d aparece %d vezes\n", vetResul[i], vetQ[i]);
        }
    }

    public static void main(String[] args) {
        //ex01();
<<<<<<< HEAD
        //ex02();
        //ex03();
        //ex04();
        //ex05();
        //ex06();
        //ex07();
        //ex08();
        //ex09();
        //ex10();
        //ex11();
        //ex12();
        //ex13();
        //ex14();
        //ex14Classe();
        //ex15();
        ex16();
=======
        ex02();
        //ex03();
>>>>>>> 410c8d194ee74c713f6bc5eb9b4c6d54659a1bed
    }
}
