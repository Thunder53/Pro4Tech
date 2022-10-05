package ClassesConexao;

public class CadastroVaga {
	private String nome_vaga;
	private String carga_horaria;
	private String modelo;
	private String salario;
	private String responsavel;
	private String requisitos;
	private String escolaridade;
	private String soft_skills;
	private String hard_skills;
	
	public CadastroVaga(){
	}
	
	public CadastroVaga(String nome_vaga, String carga_horaria, String modelo, String salario, String responsavel, String requisitos, String escolaridade,
		String soft_skills, String hard_skills){
		this.nome_vaga = nome_vaga;
		this.carga_horaria = carga_horaria;
		this.modelo = modelo;
		this.salario = salario;
		this.responsavel = responsavel;
		this.requisitos = requisitos;
		this.escolaridade = escolaridade;
		this.soft_skills = soft_skills;
		this.hard_skills = hard_skills;
		
	}
	
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
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getSalario() {
		return salario;
	}
	
	public void setSalario(String salario) {
		this.salario = salario;
	}
	
	public String getResponsavel() {
		return responsavel;
	}
	
	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
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
	
	public String getSoft_skills() {
		return soft_skills;
	}
	
	public void setSoft_skills(String soft_skills) {
		this.soft_skills = soft_skills;
	}
	
	public String getHard_skills() {
		return hard_skills;
	}
	
	public void setHard_skills(String hard_skills) {
		this.hard_skills = hard_skills;
	}

	
}
