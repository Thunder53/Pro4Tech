<<<<<<< HEAD
package ClassesConexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public abstract class GenericData {
    private Connection connection;

    protected Connection getConnection() {
        return connection;
    }

    protected void save(String insertSql, Object...parametros) throws SQLException {
        PreparedStatement pstmt = 
			getConnection().prepareStatement(insertSql);

        for (int i = 0; i < parametros.length; i++) {
            pstmt.setObject(i+1, parametros[i]);
        }

        pstmt.execute();
        pstmt.close();
        connection.close();
    }

    protected void update(String updateSql, Object id, Object...parametros) throws SQLException {
        PreparedStatement pstmt = 
		getConnection().prepareStatement(updateSql);
			
        for (int i = 0; i < parametros.length; i++) {
            pstmt.setObject(i+1, parametros[i]);
        }
        pstmt.setObject(parametros.length + 1, id);
        pstmt.execute();
        pstmt.close();
        connection.close();
    }

    protected void delete(String deleteSql, Object...parametros) throws SQLException {
        PreparedStatement pstmt = 
		getConnection().prepareStatement(deleteSql);
			
        for (int i = 0; i < parametros.length; i++) {
            pstmt.setObject(i+1, parametros[i]);
        }

        pstmt.execute();
        pstmt.close();
        connection.close();
    }
}
=======
package ClassesConexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public abstract class GenericData {
    private Connection connection;

    protected GenericData() {
        this.connection = Conexao.getConnection();
    }

    protected Connection getConnection() {
        return connection;
    }

    protected void save(String insertSql, Object...parametros) throws SQLException {
        PreparedStatement pstmt = 
			getConnection().prepareStatement(insertSql);

        for (int i = 0; i < parametros.length; i++) {
            pstmt.setObject(i+1, parametros[i]);
        }

        pstmt.execute();
        pstmt.close();
        connection.close();
    }

    protected void update(String updateSql, Object id, Object...parametros) throws SQLException {
        PreparedStatement pstmt = 
		getConnection().prepareStatement(updateSql);
			
        for (int i = 0; i < parametros.length; i++) {
            pstmt.setObject(i+1, parametros[i]);
        }
        pstmt.setObject(parametros.length + 1, id);
        pstmt.execute();
        pstmt.close();
        connection.close();
    }

    protected void delete(String deleteSql, Object...parametros) throws SQLException {
        PreparedStatement pstmt = 
		getConnection().prepareStatement(deleteSql);
			
        for (int i = 0; i < parametros.length; i++) {
            pstmt.setObject(i+1, parametros[i]);
        }

        pstmt.execute();
        pstmt.close();
        connection.close();
    }
}
>>>>>>> d33735987c57a237b51304faf108e4102168269c
