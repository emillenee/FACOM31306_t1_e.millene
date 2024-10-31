public class UsaBanco {
    public static void main(String[] args){
        ContaEspecial c1 = new ContaEspecial(1000, 123, 4567, 500);
        ContaEspecial c2 = new ContaEspecial(2000, 124, 7890, 1000);

        System.out.println("Saldo inicial conta 1: " + c1.getSaldo(4567));
        System.out.println("Saldo inicial conta 2: " + c2.getSaldo(7890));

        if(c1.debitaValor(1200, 4567)){
            System.out.println("Débito de R$1200 da conta 1 realizado");
        }else{
            System.out.println("Não foi possível realizar o débito de R$1200 da conta 1");
        }

        if(c2.debitaValor(3100, 7890)){
            System.out.println("Débito de R$3100 da conta 2 realizado");
        }else{
            System.out.println("Não foi possível realizar o débito de R$3100 da conta 2");
        }

        System.out.println("Saldo final conta1: " + c1.getSaldo(4567));
        System.out.println("Saldo final conta2: " + c2.getSaldo(7890));
    }
}
