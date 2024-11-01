import java.util.Scanner;

public class FaceFriends {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Contato[] contatos = new Contato[10];
        String nome, apelido, email, aniversario, parentesco, grau, tipo, tipoContato;

        int opcao, pos = 0, indice;
        do{
            System.out.println("\n-----------MENU----------:");
            System.out.println("1. Inserir um contato");
            System.out.println("2. Imprimir todos os contatos");
            System.out.println("3. Imprimir somente os familiares");
            System.out.println("4. Imprimir somente os amigos");
            System.out.println("5. Imprimir somente os colegas de trabalho");
            System.out.println("6. Imprimir os MELHORES amigos, IRMÃOS e COLEGAS");
            System.out.println("7. Imprimir os dados de um ÚNICO contato");
            System.out.println("8. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao){
                case 1:
                    System.out.println("Qual tipo de contato?");
                    tipoContato = sc.nextLine();
                    System.out.println("Apelido?");
                    apelido = sc.nextLine();
                    System.out.println("Nome?");
                    nome = sc.nextLine();
                    System.out.println("Email?");
                    email = sc.nextLine();
                    System.out.println("Data de aniversário?");
                    aniversario = sc.nextLine();

                    if(tipoContato.equals("Familia")){
                        System.out.println("Parentesco?");
                        System.out.println("Irmão, Irmã, Pai, Mãe, etc");
                        parentesco = sc.nextLine();
                        contatos[pos] = new Familia(apelido, nome, email, aniversario, parentesco);
                    }else if(tipoContato.equals("Amigo")){
                        System.out.println("Grau de amizade?");
                        System.out.println("1 - Melhor amigo, 2 - Amigo, 3 - Conhecido");
                        grau = sc.nextLine();
                        contatos[pos] = new Amigo(apelido, nome, email, aniversario, grau);
                    }else if(tipoContato.equals("Trabalho")){
                        System.out.println("Tipo do contato de trabalho?");
                        System.out.println("Chefe, Colega, etc");
                        tipo = sc.nextLine();
                        contatos[pos] = new Trabalho(apelido, nome, email, aniversario, tipo);
                    }

                    pos++;
                    break;
                case 2:
                    for(Contato c : contatos){
                        if(c != null){
                            System.out.println("\n" + c.imprimirContato());
                        }
                    }
                    break;
                case 3:
                    for(Contato c : contatos){
                        if(c != null && c instanceof Familia){
                            System.out.println("\n" + c.imprimirContato());
                        }
                    }
                    break;
                case 4:
                    for(Contato c : contatos){
                        if(c != null && c instanceof Amigo){
                            System.out.println("\n" + c.imprimirContato());
                        }
                    }
                    break;
                case 5:
                    for(Contato c : contatos){
                        if(c != null && c instanceof Trabalho){
                            System.out.println("\n" + c.imprimirContato());
                        }
                    }
                    break;
                case 6:
                    for (Contato c : contatos) {
                        if (c != null && c instanceof Amigo && ((Amigo) c).getGrau().equals("1")) {
                            System.out.println("\n" + c.imprimirContato());
                        }
                        if (c != null && c instanceof Familia) {
                            if(((Familia) c).getParentesco().equals("Irmão") || ((Familia) c).getParentesco().equals("Irmã")){
                                System.out.println("\n" + c.imprimirContato());
                            }
                        }
                        if (c != null && c instanceof Trabalho && ((Trabalho) c).getTipo().equals("Colega")) {
                            System.out.println("\n" + c.imprimirContato());
                        }
                    }
                    break;
                case 7:
                    do{
                        System.out.println("Qual indíce deseja imprimir?");
                        indice = sc.nextInt();
                        sc.nextLine();
                        System.out.println("\n" + contatos[indice].imprimirContato());
                    }while(indice < 0 || indice >= contatos.length || contatos[indice] == null);
                    break;
                case 8:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        }while(opcao != 8);
    }
}