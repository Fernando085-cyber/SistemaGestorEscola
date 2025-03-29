package models;

public class Professor {
    private String nomeProfessor;
    private int idadeProfessor;
    private String disciplinaProfessor;


    public Professor(String nome, int idadeProfessor, String disciplinaProfessor) {
        this.nomeProfessor = nome;
        this.idadeProfessor = idadeProfessor;
        this.disciplinaProfessor = disciplinaProfessor;
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public int getIdadeProfessor() {
        return idadeProfessor;
    }

    public String getDisciplinaProfessor() {
        return disciplinaProfessor;
    }

    @Override
    public String toString() {
        return "Professor: " + nomeProfessor + ", Idade: " + idadeProfessor + ", Disciplina: " + disciplinaProfessor;
    }
}
