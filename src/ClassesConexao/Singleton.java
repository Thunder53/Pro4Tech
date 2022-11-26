package ClassesConexao;

public class Singleton {
	
	public String nomeUsuario;
	public String cpfUsuario;
	public String nomeFuncionario;
	public String nomeVaga;
	public String Candidato;
	public String CandidatoCPF;
	public String FuncionarioEMAIL;
	public int tempo;
	public int formacao;
	public int perfil;
	public int modelo;
	public int salario;
	
	private static Singleton instance;
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

}
