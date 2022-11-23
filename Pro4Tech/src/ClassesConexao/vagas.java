package ClassesConexao;

import java.sql.Connection;

public class vagas {
	private String nome_vaga ;
	private String carga_horaria;
	private String salario;
	private String requisitos;
	private String escolaridade;
	private String soft_skill;
	private String hard_skill;
	private String resposavel;
	
	
	public String getNome_vaga() {
		return nome_vaga;
	}
	public void setNome_vaga(String nome_vaga) {
		this.nome_vaga = nome_vaga;
	}
	public String getCarga_horaria() {
		return carga_horaria;
	}
	public void setCarga_horaria(String carga_horaria) {
		this.carga_horaria = carga_horaria;
	}
	public String getSalario() {
		return salario;
	}
	public void setSalario(String salario) {
		this.salario = salario;
	}
	public String getRequisitos() {
		return requisitos;
	}
	public void setRequisitos(String requisitos) {
		this.requisitos = requisitos;
	}
	public String getEscolaridade() {
		return escolaridade;
	}
	public void setEscolaridade(String escolaridade) {
		this.escolaridade = escolaridade;
	}
	public String getSoft_skill() {
		return soft_skill;
	}
	public void setSoft_skill(String soft_skill) {
		this.soft_skill = soft_skill;
	}
	public String getHard_skill() {
		return hard_skill;
	}
	public void setHard_skill(String hard_skill) {
		this.hard_skill = hard_skill;
	}
	public String getResposavel() {
		return resposavel;
	}
	public void setResposavel(String resposavel) {
		this.resposavel = resposavel;
	}
	public static void addItem(String string) {
		// TODO Auto-generated method stub
		
	}
	public static Connection getConnection() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
