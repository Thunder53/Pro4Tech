package ClassesConexao;

public class InscricaoCandidato {
	
	private String id;
	private String avaliacao;
	private String status_vaga;
	private String feedback_geral;
	private String feedback_pontual;
	
	
	public InscricaoCandidato(){
	}
	
	public InscricaoCandidato(String id, String avaliacao, String status_vaga, String feedback_geral, String feedback_pontual){
		this.id = id;
		this.avaliacao = avaliacao;
		this.status_vaga = status_vaga;
		this.feedback_geral = feedback_geral;
		this.feedback_pontual = feedback_pontual;

		
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getAvaliacao() {
		return avaliacao;
	}
	
	public void setAvaliacao(String avaliacao) {
		this.avaliacao = avaliacao;
	}
	
	public String getStatus_vaga() {
		return status_vaga;
	}
	
	public void setStatus_vaga(String status_vaga) {
		this.status_vaga = status_vaga;
	}
	
	public String getFeedback_geral() {
		return feedback_geral;
	}
	
	public void setFeedback_geral(String feedback_geral) {
		this.feedback_geral = feedback_geral;
	}
	
	public String getFeedback_pontual() {
		return feedback_pontual;
	}
	
	public void setFeedback_pontual(String feedback_pontual) {
		this.feedback_pontual = feedback_pontual;
	}
	
	
}

