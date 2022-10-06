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
	   String url = "jdbc:mysql://localhost/teste1";
	   String user = "root";
	   String password = "Tobias*2004";
	   
	public ArrayList <String>vagas() {
        ArrayList <String> vg = new ArrayList <String>();
		System.out.println("teste");

		try {
			con = DriverManager.getConnection(url, user, password);
			System.out.println("teste");

    		System.out.println("teste");
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
}



