package entities;

import java.sql.Date;

import entities.enums.Status;

public class Matricula {

	private Date dataMatricula;
	private Aluno aluno;
	private Disciplina disciplina;
	private Turma turma;
	private Status status;

	public Matricula(Aluno aluno, Disciplina disciplina, Turma turma) {

		this.dataMatricula = new Date(0);
		this.disciplina = disciplina;
		this.turma = turma;
		this.status = Status.MATRICULADO;
		this.aluno = aluno;
		this.aluno.adicionaDisciplinasMatriculada(this);
		
	}

	public Date getDataMatricula() {
		return dataMatricula;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public Turma getTurma() {
		return turma;
	}

	public Status getStatus() {
		return status;
	}

	public String toString() {
		return "Matricula [dataMatricula=" + dataMatricula + ", aluno=" + aluno + ", disciplina=" + disciplina
				+ ", turma=" + turma + ", status=" + status + "]";
	}

	public void Confirmar() {
		if (status == Status.MATRICULADO || status == Status.TRANCADO) {
			status = Status.CURSANDO;
		}
	}

	public void Trancar() {
		if (status == Status.CURSANDO) {
			status = status.TRANCADO;
		}
	}

	public void Aprovar() {
		if (status == Status.CURSANDO) {
			status = status.CONCLUIDO;
		}
	}

	public void Reprovar() {
		if (status == Status.CURSANDO) {
			status = status.REPROVADO;
		}
	}

}
