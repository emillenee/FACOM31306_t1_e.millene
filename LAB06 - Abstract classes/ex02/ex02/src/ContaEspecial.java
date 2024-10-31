public class ContaEspecial extends ContaCorrente{
    private float limite;

    public ContaEspecial(float val, int num, int pwd, float limite) {
        super(val, num, pwd);
        this.limite = limite;
    }

    @Override
    public boolean debitaValor(float val, int pwd){
        if(pwd != senha){
            return false;
        }
        if(estado != 1){
            return false;
        }
        if(val <= 0){
            return false;
        }
        if(val > (saldo + limite)){
            return false;
        }

        saldo -= val;
        if(saldo < 0 && limite == 0){
            ContaCorrente contaComum = new ContaComum(saldo, numConta, senha);
        }

        return true;
    }
}
