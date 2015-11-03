package mysql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Musica {
	private String nome;
	private int nota;
	private int duracao;
	private int album_id;
	public Musica(String nome, int nota, int duracao, int album_id){
		this.nome = nome;
		this.nota = nota;
		this.duracao = duracao;
		this.album_id = album_id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public int getAlbum_id() {
		return album_id;
	}

	public void setAlbum_id(int album_id) {
		this.album_id = album_id;
	}
	public static int inserirMusica(Musica m) {
		String inser = "INSERT INTO musica VALUES (NULL,'"+m.getNome()+"',"+m.getNota()+","+m.getDuracao()+","+m.getAlbum_id()+");";
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
			return(st.executeQuery("SELECT * FROM musica;"));
		} catch (SQLException e) {
			System.out.println("Problema na consulta � tabela pessoa!");
		}
		return(null);
	}
}
