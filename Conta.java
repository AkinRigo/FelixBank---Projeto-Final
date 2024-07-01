public abstract class Conta {
    private String nome;
    private String cpf;
    private String email;
    private String endereco;
    private double renda_salarial;
}

public Conta (String nome, String cpf, String email, String endereco, double renda_salarial){
     this.nome = nome;
     this.cpf = cpf;
     this.email = email;
     this.endereco = endereco;
     this.renda_salarial = renda_salarial;
}


public abstract void pagamentos(double pagamentos);
public abstract void pix (double pix);
public abstract void saques (double saque);
public abstract void transferencia (double transferencia);

public String getNome()
{return nome;}

public String setNome()
{this.nome = nome;}

public String getCpf()
{return cpf;}

public String setCpf()
{this.cpf = cpf;}

public String getEmail()
{return email;}

public String setEmail()
{this.email = email;}

public String getEndereco()
{return endereco;}

public String setEndereco()
{this.endereco = endereco;}

public double getRenda_salarial()
{return renda_salarial;}

public double setRenda_salarial()
{this.renda_salarial = renda_salarial;}