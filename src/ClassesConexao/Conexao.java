package ClassesConexao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
	
	public static Connection faz_conexao() throws SQLException {
		
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
<<<<<<< HEAD
		

		return DriverManager.getConnection("jdbc:mysql://localhost/pro4tech","root",".Bethinha19");
=======

		return DriverManager.getConnection("jdbc:mysql://localhost/pro4tech","root","Tobias*2004");
>>>>>>> 6d2b238d22040c26e21aff416c79d80e1f0bd418

			
		} catch (ClassNotFoundException e) {
			
			throw new SQLException(e.getException());
			
		}
		
	}

}
