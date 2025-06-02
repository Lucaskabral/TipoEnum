package entities;

import java.util.List;
import java.util.Objects;
import java.util.ArrayList;
import java.time.LocalDate;

public class Aluno {

	private String cpf;
	private String nome;
	private List<Matricula> listaMatricula = new ArrayList<>();

	public Aluno(String cpf, String nome) {

		this.cpf = cpf;
		this.nome = nome;
	}

	public boolean adicionaDisciplinasMatriculada(Matricula matricula) {

		if (matricula != null && !listaMatricula.contains(matricula)) {
			listaMatricula.add(matricula);
			return true;
		}
		return false;
	}

	public boolean removerDisciplinasMatriculada(Matricula matricula) {

		if (matricula != null && listaMatricula.contains(matricula)) {
			listaMatricula.remove(matricula);
			return true;
		}
		return false;
	}

	public String getCpf() {
		return cpf;
	}

	public String getNome() {
		return nome;
	}

	public List<Matricula> getListaMatriculas(){
		return getListaMatriculas();
	}
	public void listarMatriculas() {
		if (listaMatricula.isEmpty()) {
			System.out.println("Aluno não tem matrícula!");
		}
		else {
			System.out.println("Aluno(a) : " + nome);
			for(Matricula m : listaMatricula) {
				System.out.println(m.toString());
			}
		}
	}
	
	public int hashCode() {
		return Objects.hash(cpf, nome);
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(cpf, other.cpf) && Objects.equals(nome, other.nome);
	}

	public String toString() {
		return "Aluno [cpf=" + cpf + ", nome=" + nome + "]";
	}
	
}
