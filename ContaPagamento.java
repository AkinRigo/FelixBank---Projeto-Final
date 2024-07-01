public class ContaPagamento extends Conta{
    private double pagamentos;
    private double pix;
    private double cheque_especial;
    private double saques;
    private double transferencia;
    protected static final double TARIFA_SAQUE = 6.50;
}

public ContaPagamento(double pagamentos, double pix, double cheque_especial, double saques){
    super(nome,cpf,email,endereco,renda_salarial);
    this.pagamentos = pagamentos;
    this.pix = pix;
    this.cheque_especial = cheque_especial;
    this.saques = saques;
    this.transferencia = transferencia;
}

public transferencia (double transferencia){
    if(transferencia > 4.999){
        System.out.println("Limite de transferência diária excedido, tente novamente em 24 horas!");
    }
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