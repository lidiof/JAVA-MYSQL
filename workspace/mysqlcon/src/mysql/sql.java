package mysql;
import java.sql.ResultSet;
import java.sql.SQLException;

public class sql {

	public static void main(String[] args) {
		
		con.conectar();
		/*Genero g=new Genero("nomeg");
		if(Genero.inserirGenero(g)!=0) {
			System.out.println("Pessoa inserida com sucesso no banco!");
		} else {
			System.out.println("Erro na inser��o!");
		}*/
		
	ResultSet res = Genero.relatorio();
	if(res!=null) {
		try {
			while(res.next()) {
				System.out.println("Nome do Genero: "+res.getString("nome"));
			} 
			}catch (SQLException e) {
		System.out.println("Problema para exibir registros!");
	}
	}else{
	System.out.println("A pesquisa n�o retornou nenhum registro!");
	}
	
	Artista a=new Artista("nomeg",1);
	/*if(Artista.inserirArtista(a)!=0) {
		System.out.println("Pessoa inserida com sucesso no banco!");
	} else {
		System.out.println("Erro na inser��o!");
	}*/
	ResultSet res1 = Artista.relatorio();
	if(res1!=null) {
	try {
		while(res1.next()) {
			System.out.println("Nome do Artista: "+res1.getString("nome")+"  Codigo genero: "+res1.getInt("genero_id"));
		} 
		}catch (SQLException e) {
			System.out.println("Problema para exibir registros!");
		}
	}else{
		System.out.println("A pesquisa n�o retornou nenhum registro!");
	}
	
	Album g=new Album("nomeg",2000,1);
	/*if(Album.inserirAlbum(g)!=0) {
		System.out.println("Pessoa inserida com sucesso no banco!");
	} else {
		System.out.println("Erro na inser��o!");
	}*/
	ResultSet res2 = Album.relatorio();
	if(res2!=null) {
	try {
		while(res2.next()) {
			System.out.println("Nome do Album: "+res2.getString("nome")+" Ano do Album: "+res2.getInt("ano")+" Codigo artista: "+res2.getInt("artista_id"));
		} 
		}catch (SQLException e) {
			System.out.println("Problema para exibir registros!");
		}
	}else{
		System.out.println("A pesquisa n�o retornou nenhum registro!");
	}
	
	Musica m=new Musica("nomem",6,120,1);
	/*if(Musica.inserirMusica(m)!=0) {
		System.out.println("Pessoa inserida com sucesso no banco!");
	} else {
		System.out.println("Erro na inser��o!");
	}*/
	ResultSet res3 = Musica.relatorio();
	if(res3!=null) {
	try {
		while(res3.next()) {
			System.out.println("Nome do Musica: "+res3.getString("nome")+" Nota: "+res3.getInt("nota")+" Duracao: "+res3.getInt("duracao")+" Codigo Album:"+res3.getInt("album_id"));
		} 
		}catch (SQLException e) {
	System.out.println("Problema para exibir registros!");
		}
	}else{
		System.out.println("A pesquisa n�o retornou nenhum registro!");
	}

	}
}
	
