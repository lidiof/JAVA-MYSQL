package mysql;
import mysql.sql;
import java.sql.*;

public class con {
	public static Connection conectar() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost/bibliotecamusical", "root", "123");
			return(c);
		} catch (ClassNotFoundException e) {
			System.out.println("Problema na configura��o do Driver do MySQL!");
		} catch (SQLException e) {
			System.out.println("Problema na conex�o com o banco de dados!  12");
		}
		return(null);
	}
	
	public static ResultSet relatorio() {
		Connection cone = conectar();
		Statement st;
		try {
			st = cone.createStatement();
			return(st.executeQuery("SELECT * FROM genero_musical;"));
		} catch (SQLException e) {
			System.out.println("Problema na consulta � tabela pessoa!");
		}
		return(null);
	}
}
