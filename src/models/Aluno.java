package models;

public class Aluno {
    private String nomeAluno;
    private int idadeAluno;
    private String matriculaAluno;

    public Aluno(String nome, int idade, String matricula) {
        this.nomeAluno = nome;
        this.idadeAluno = idade;
        this.matriculaAluno = matricula;
    }

    public String getNome() {
        return nomeAluno;
    }

    public int getIdade() {
        return idadeAluno;
    }

    public String getMatricula() {
        return matriculaAluno;
    }

    @Override
    public String toString() {
        return "Aluno: " + nomeAluno + ", Idade: " + idadeAluno + ", Matrícula: " + matriculaAluno;
    }

}
