
import models.*;

public static void main(String[] args) {
    Escola escola = new Escola("Escola Modelo");


    Aluno aluno1 = new Aluno("Carlos Silva", 15, "A123");
    Aluno aluno2 = new Aluno("Mariana Souza", 16, "A456");

    Professor professor1 = new Professor("Fernando", 22, "Java");
    Professor professor2 = new Professor("Ana costa", 35,"Matematica");

    escola.adicionarAluno(aluno1);
    escola.adicionarAluno(aluno2);
    escola.adicionarProfessor(professor1);
    escola.adicionarProfessor(professor2);

    escola.listarAlunos();
    escola.listarProfessores();

    System.out.println();

    Turma turma = new Turma("Java",2025,professor1);
    Disciplina disciplina = new Disciplina("Ti",80,professor1);
}


