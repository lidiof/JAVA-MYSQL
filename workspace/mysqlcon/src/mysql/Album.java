package mysql;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Album {
	private String nome;
	private int ano;
	private int artista_id;
	public Album(String nome, int ano, int artista_id){
		this.nome = nome;
		this.ano = ano;
		this.artista_id = artista_id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getArtista_id() {
		return artista_id;
	}
	public void setArtista_id(int artista_id) {
		this.artista_id = artista_id;
	}
	public static int inserirAlbum(Album a) {
		String inser = "INSERT INTO album VALUES (NULL,'"+a.getNome()+"',"+a.getAno()+","+a.getArtista_id()+");";
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
			return(st.executeQuery("SELECT * FROM album;"));
		} catch (SQLException e) {
			System.out.println("Problema na consulta � tabela pessoa!");
		}
		return(null);
	}

}
