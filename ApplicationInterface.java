package felixBank;

public abstract class ApplicationInterface implements InterfaceFelix (){
     this.nome = nome;
     this.cpf = cpf;
     this.email = email;
     this.endereco = endereco;
     this.renda_salarial = renda_salarial;
     this.pagamentos = pagamentos;
     this.pix = pix;
     this.cheque_especial = cheque_especial;
     this.saques = saques;
     this.transferencia = transferecia;
}

    @Override
    public String getNome()
    {return nome;}

    @Override
    public String setNome()
    {this.nome = nome;}

    @Override
    public String getCpf()
    {return cpf;}

    @Override
    public String setCpf()
    {this.cpf = cpf;}

    @Override
    public String getEmail()
    {return email;}

    @Override
    public String setEmail()
    {this.email = email;}

    @Override
    public String getEndereco()
    {return endereco;}

    @Override
    public String setEndereco()
    {this.endereco = endereco;}

    @Override
    public double getRenda_salarial()
    {return renda_salarial;}

    @Override
    public double setRenda_salarial()
    {this.renda_salarial = renda_salarial;}


    @Override
    public double getPagamentos()
    {return pagamentos;}


    @Override
    public double setPagamentos()
    {this.pagamentos = pagamentos;}


    @Override
    public double getPix()
    {return pix;}


    @Override
    public double setPix()
    {this.pix = pix;}


    @Override
    public double getCheque_especial()
    {return cheque_especial;}

    @Override
    public double setCheque_especial()
    {this.cheque_especial = cheque_especial;}

    @Override
    public double getSaques()
    {return saques;}

    @Override
    public double setSaques()
    {this.saques = saques;}