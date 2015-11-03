package mysql;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Genero {
	private String nome;
	public Genero(String nome){
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public static int inserirGenero(Genero g) {
		String inser = "INSERT INTO genero VALUES (NULL,'"+g.getNome()+"');";
		Connection cons = con.conectar();
		Statement st;
		try {
			st = cons.createStatement();
			return(st.executeUpdate(inser));
		} catch (SQLException e) {
			System.out.println("Problema na insercao");
		}
		return(0);
	}
	public static ResultSet relatorio() {
		Connection cone = con.conectar();
		Statement st;
		try {
			st = cone.createStatement();
			return(st.executeQuery("SELECT * FROM genero;"));
		} catch (SQLException e) {
			System.out.println("Problema na consulta � tabela pessoa!");
		}
		return(null);
	}

}
