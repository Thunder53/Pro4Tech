package ClassesConexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.DriverManager;


import javax.swing.JOptionPane;

public class vagasDAO {
	private Connection con;
		
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
		System.out.println("teste" + vg.get(0));
        return vg;
    }
	public static void main(String[] args) {
		vagasDAO c1 = new vagasDAO();
		System.out.println("teste" + c1.vagas().get(0));

	}
	
	public ArrayList <String>carga_horaria() {
        ArrayList <String> carga_horaria = new ArrayList <String>();
		System.out.println("teste");

		try {
			con = DriverManager.getConnection(url, user, password);
            //Connection conn = Conexao.faz_conexao(); 
            ps = con.prepareStatement("SELECT carga_horaria FROM Vagas WHERE nome_vagas = ''");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                carga_horaria.add(rs.getString("carga_horaria"));
            }
            rs.close();
            ps.close();
            con.close();
			}catch (Exception e) {
	            JOptionPane.showMessageDialog(null,
	                    "Ocorreu erro ao carregar a Combo Box", "Erro",
	                    JOptionPane.ERROR_MESSAGE);
	        }
			System.out.println("teste" + carga_horaria.get(0));
	        return carga_horaria;
	    }
	}





