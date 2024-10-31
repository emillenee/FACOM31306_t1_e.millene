public class ContaComum extends ContaCorrente{
    public ContaComum(float val, int num, int pwd) {
        super(val, num, pwd);
    }

    @Override
    public boolean debitaValor(float val, int pwd){
        if(pwd != senha){
            return false;
        }
        if (estado != 1) {
            return false;
        }
        if(val <= 0){
            return false;
        }
        if(val > saldo){
            return false;
        }

        saldo -= val;
        if(saldo == 0){
            estado = 2;
        }

        return true;
    }
}
