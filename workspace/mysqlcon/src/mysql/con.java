package mysql;

//import mysql.sql;
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
			return(st.executeQuery("select artista.nome as nome_artista,genero.nome as nome_genero,album.nome as nome_album,album.ano,musica.nome as nome_musica from artista,genero,album,musica where genero.id=artista.genero_id && artista.id=album.artista_id && album.id=musica.album_id order by album.id;"));
		} catch (SQLException e) {
			System.out.println("Problema na consulta � tabela pessoa!");
		}
		return(null);
	}
}
