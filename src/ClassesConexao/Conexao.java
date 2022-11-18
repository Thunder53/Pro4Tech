package ClassesConexao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
	
	public static Connection faz_conexao() throws SQLException {
		
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
<<<<<<< HEAD
		return DriverManager.getConnection("jdbc:mysql://localhost/pro4tech","root","123456");
=======
		return DriverManager.getConnection("jdbc:mysql://localhost/pro4tech","root","Tobias*2004");
>>>>>>> 322a9936030b9c344c21c16d7e507bc9f2e2c06f
			
		} catch (ClassNotFoundException e) {
			
			throw new SQLException(e.getException());
			
		}
		
	}

}
