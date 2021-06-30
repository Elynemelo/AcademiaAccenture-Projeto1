package exJava;

public class Aluno  extends Pessoa{ //Cria��o da classe Aluno estendendo de Pessoa
    private Curso curso;

    public Aluno(String nome, String cpf, int idade, Curso curso) { //ctor com par�metros
        super(nome, cpf, idade);
        this.curso = curso;
    }

    public Aluno(String nome, String cpf) {
        super(nome, cpf);
    }

    public Aluno() {
    }


    public Curso getCurso() {

        return curso;
    }

    public void setCurso(Curso curso) {

        this.curso = curso;
    }
}
