package ClassesConexao;

import java.util.Date;

import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

public class CadastroUsuario {
	private String email;
	private String senha;
	private String nome;
	private String cpf;
	private Date data_nasc;
	private String formaçao_acad;
	private String pretensao_salarial;
	private String cargo_interesse;
	private String experiencia_profissional;
	private String telefone;
	private String quemsoueu;
    private static final String Formato = "###.###.###-##";
	
	public CadastroUsuario() {
	}
	    
	public CadastroUsuario(String email, String senha, String nome, String cpf, Date data_nasc, String formaçao_acad, String pretensao_salarial,
		String cargo_interesse, String experiencia_profissional, String telefone, String quemsoueu, Boolean isCPF) {
	       this.email = email;
	       this.senha = senha;
	       this.nome = nome;
	       this.cpf = cpf;
	       this.data_nasc = data_nasc;
	       this.formaçao_acad = formaçao_acad;
	       this.pretensao_salarial = pretensao_salarial;
	       this.cargo_interesse = cargo_interesse;
	       this.experiencia_profissional = experiencia_profissional;
	       this.telefone = telefone;
	       this.quemsoueu = quemsoueu;     
	}
	    
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String C) {
		this.cpf = this.Format(C, false);
	}
	
	public Date getData_nasc() {
		return data_nasc;
	}
	
	public void setData_nasc(Date data_nasc) {
		this.data_nasc = data_nasc;
	}
	
	public String getFormaçao_acad() {
		return formaçao_acad;
	}
	
	public void setFormaçao_acad(String formaçao_acad) {
		this.formaçao_acad = formaçao_acad;
	}
	
	public String getPretensao_salarial() {
		return pretensao_salarial;
	}
	
	public void setPretensao_salarial(String pretensao_salarial) {
		this.pretensao_salarial = pretensao_salarial;
	}
	
	public String getCargo_interesse() {
		return cargo_interesse;
	}
	
	public void setCargo_interesse(String cargo_interesse) {
		this.cargo_interesse = cargo_interesse;
	}
	
	public String getExperiencia_profissional() {
		return experiencia_profissional;
	}
	
	public void setExperiencia_profissional(String experiencia_profissional) {
		this.experiencia_profissional = experiencia_profissional;
	}
	
	public String getTelefone() {
		return this.telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getQuemsoueu() {
		return this.quemsoueu;
	}
	
	public void setQuemsoueu(String quemsoueu) {
		this.quemsoueu = quemsoueu;
	}
	

	
	public boolean isCPF(){
	        
	        if (this.cpf.equals("00000000000") || 
	            this.cpf.equals("11111111111") || 
	            this.cpf.equals("22222222222") || 
	            this.cpf.equals("33333333333") ||
	            this.cpf.equals("44444444444") ||
	            this.cpf.equals("55555555555") ||
	            this.cpf.equals("66666666666") ||
	            this.cpf.equals("77777777777") ||
	            this.cpf.equals("88888888888") ||
	            this.cpf.equals("99999999999") ||
	            this.cpf.length() != 11)
	            return(false);
	        
	        char dig10, dig11; 
	        int sm, i, r, num, peso; 
	        try { 
	            sm = 0; 
	            peso = 10; 
	            for (i=0; i<9; i++) { 
	                num = (int)(this.cpf.charAt(i) - 48); 
	                sm = sm + (num * peso); 
	                peso = peso - 1;
	            } 
	            r = 11 - (sm % 11); 
	            if ((r == 10) || (r == 11)) 
	                dig10 = '0'; 
	            else 
	                dig10 = (char)(r + 48); 
	
	            sm = 0; 
	            peso = 11; 
	            for(i=0; i<10; i++) { 
	                num = (int)(this.cpf.charAt(i) - 48);
	                sm = sm + (num * peso); 
	                peso = peso - 1;
	            } 
	            r = 11 - (sm % 11); 
	            if ((r == 10) || (r == 11)) 
	                dig11 = '0'; 
	            else 
	                dig11 = (char)(r + 48); 
	
	            if ((dig10 == this.cpf.charAt(9)) && (dig11 == this.cpf.charAt(10))) 
	                return(true); 
	            else return(false);
	        } catch(Exception e) { 
	            return(false); 
	        } 
	    }
	    
	  private String Format(String C, boolean Mascara){
	        if(Mascara){
	            return(C.substring(0, 3) + "." + C.substring(3, 6) + "." +
	            C.substring(6, 9) + "-" + C.substring(9, 11));
	        }else{
	            C = C.replace(".","");
	            C = C.replace("-","");
	            return C;
	        }
	    }
	    
	    
	    public static DefaultFormatterFactory getFormat(){
	        try {
	            return new DefaultFormatterFactory(new MaskFormatter(Formato));
	        } catch (Exception e) {
	            return null;
	        }
	    }
}
