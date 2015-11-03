package mysql;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Artista {
	private String nome;
	private int genero_id;
	public Artista(String nome, int genero_id){
	 this.nome = nome;
	 this.genero_id = genero_id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getGenero_id() {
		return genero_id;
	}
	public void setGenero_id(int genero_id) {
		this.genero_id = genero_id;
	}
	public static int inserirArtista(Artista a) {
		String inser = "INSERT INTO artista VALUES (NULL,'"+a.getNome()+"',"+a.getGenero_id()+");";
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
			return(st.executeQuery("SELECT * FROM artista;"));
		} catch (SQLException e) {
			System.out.println("Problema na consulta � tabela pessoa!");
		}
		return(null);
	}

}
