package felixBank;

public class ClienteService {
    private String nome;
    private String cpf;
    private String email;
    private String endereço;
    private double renda_salarial;
}

public Conta (String nome, String cpf, String email, String endereco, double renda_salarial){
    this.nome = nome;
    this.cpf = cpf;
    this.email = email;
    this.endereco = endereco;
    this.renda_salarial = renda_salarial;
}

System.out.println("Para abrir uma nova conta preencha os seguintes dados:");
    System.out.println("Nome completo:");
    System.out.println("Cpf:");
    System.out.println("Email:");
    System.out.println("Endereço:");
    System.out.println("Renda salarial:");


