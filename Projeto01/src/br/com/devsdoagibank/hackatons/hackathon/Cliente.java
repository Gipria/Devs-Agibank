package br.com.devsdoagibank.hackatons.hackathon;

public class Cliente {

    private String nome;
    private String cpf;


    public Cliente(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome(){
        return nome;
    }

    public String getCpf(){
        return cpf;
    }

    protected void setNome(String nome){
        this.nome = nome;
    }

    protected void setCpf(String cpf){
        this.cpf = cpf;
    }
}
