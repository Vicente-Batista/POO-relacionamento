package AulaEstudo.CursoPOO;

public class Carro {
    String cor;
    String placa;
    int portas;
    String tipo;
    Pessoa dono;

    public String getCor(){
        return cor;
    }
    public String getPlaca(){
        return placa;
    }
    public int getPortas(){
        return portas;
    }
    public String getTipo(){
        return tipo;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    public void setPlaca(String placa){
        this.placa = placa;
    }
    public void setPortas(int portas){
        this.portas = portas;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }  

    Pessoa getDono(){
        return dono;
    }
    void setDono(Pessoa dono){
        this.dono = dono;
    }
}

class Pessoa{
    String nome;
    int idade;

    String getNome(){
        return nome;
    }
    void setNome(String nome){
        this.nome = nome;
    }
    int getIdade(){
        return idade;
    }
    void setIdade(int idade){
        this.idade = idade;
    }
    
    }

