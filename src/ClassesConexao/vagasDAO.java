package ClassesConexao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.DriverManager;


import javax.swing.JOptionPane;

public class vagasDAO {
	private Connection con;
	private String carga_horaria;
		
	public String getCarga_horaria() {
		return carga_horaria;
	}
	   
	public void setCarga_horaria(String carga_horaria) {
		this.carga_horaria = carga_horaria;
	}

	ResultSet rs;
	   PreparedStatement ps;
	 //bd db4free.net
	   String url = "jdbc:mysql://localhost/pro4tech";
	   String user = "root";
	   String password = "39339533";



	public ArrayList <String>vagas() {
        ArrayList <String> vg = new ArrayList <String>();
		System.out.println("teste");

		try {
			con = DriverManager.getConnection(url, user, password);
            //Connection conn = Conexao.faz_conexao(); 
            ps = con.prepareStatement("SELECT nome_vaga FROM Vagas");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                vg.add(rs.getString("nome_vaga"));
            }
            rs.close();
            ps.close();
            con.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Ocorreu erro ao carregar a Combo Box", "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }
        return vg;
    }
	
	public ArrayList <String>candidato() {
        ArrayList <String> candidato = new ArrayList <String>();

		try {
			con = DriverManager.getConnection(url, user, password);
            ps = con.prepareStatement("SELECT * from candidato_vaga where nome_vaga = '" + Singleton.getInstance().nomeVaga + "'");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                candidato.add(rs.getString("cpf"));
            }
            rs.close();
            ps.close();
            con.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Ocorreu erro ao carregar a Combo Box", "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }
        return candidato;
    }
	 	  	
}





