public class Empresa {
    public static void main(String[] args) {
        Chefe[] chefes = new Chefe[2];
        Vendedor[] vendedores = new Vendedor[2];
        Operario[] operarios = new Operario[2];
        Horista[] horistas = new Horista[2];

        chefes[0] = new Chefe("João Silva", "02/1996", 5000);
        chefes[1] = new Chefe("Maria Pereira", "01/1971", 6000);

        vendedores[0] = new Vendedor("Pedro Santos", "11/1987", 10, 1000);
        vendedores[1] = new Vendedor("Ana Costa", "05/2002", 12, 1500);

        operarios[0] = new Operario("Carlos Almeida", "01/2004", 20, 150);
        operarios[1] = new Operario("Bruna Oliveira", "09/1993", 18, 200);

        horistas[0] = new Horista("Luiz Lima", "08/1999", 15, 160);
        horistas[1] = new Horista("Fernanda Gomes", "02/2001", 18, 180);

        System.out.println("Salário do chefe João Silva: R$" + chefes[0].calcularSalario());
        System.out.println("Salário do vendedor Ana Costa: R$" + vendedores[1].calcularSalario());
        System.out.println("Salário do operário Carlos Almeida: R$" + operarios[0].calcularSalario());
        System.out.println("Salário do horista Fernanda Gomes: R$" + horistas[1].calcularSalario());
    }
}
