public class ContaCorrente extends Conta {
    private double pagamentos;
    private double pix;
    private double cheque_especial;
    private double saques;
    protected static final double TARIFA_SAQUE = 6.50;
}


public ContaCorrente(double pagamentos, double pix, double cheque_especial, double saques){
    super(nome,cpf,email,endereco,renda_salarial);
    this.pagamentos = pagamentos;
    this.pix = pix;
    this.cheque_especial = cheque_especial;
    this.saques = saques;
}



public saques (double saques){
    if(saques > 4) {
        saldo -= TARIFA_SAQUE;
        System.out.println("Tarifa de saque de R$" + TARIFA_SAQUE + "aplicada.");
    }
    return true;
} else {
     System.out.println("Saldo insuficiente!");
     return false;
        }



