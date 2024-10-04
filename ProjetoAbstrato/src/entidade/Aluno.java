package entidade;

public class Aluno extends Pessoa{

    private int matricula;
    private String cursos;


    public Aluno(String nome, int idade) {
        super(nome, idade);
    }

    public Aluno(String nome, int idade, int matricula, String cursos) {
        super(nome, idade);
        this.matricula = matricula;
        this.cursos = cursos;

    }
    public void mostrarDados(){
        System.out.println(matricula+ '\n' + cursos+ '\n' +this.getNome()+ '\n' +this.getIdade());


    }



}
