package java_maven;

public class Conta {
    private String nome; // Variável de instância

    // O construtor inicia nome com o nome do parâmetro
    public Conta(String nome) { // O nome do construtor é nome da classe
        this.nome = nome;   
    }

    // Método para definir o nome do objeto
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
} // Fim da classe Conta
