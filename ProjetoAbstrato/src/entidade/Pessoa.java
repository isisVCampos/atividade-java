package entidade;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(java.lang.String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void mostrarDados(){
       System.out.println(nome+ '\n' +idade );
   }
}
