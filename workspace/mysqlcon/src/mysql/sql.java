package mysql;
import java.sql.ResultSet;
import java.sql.SQLException;

public class sql {

	public static void main(String[] args) {
		
		con.conectar();
		/*Genero g=new Genero("nomeg2");
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
	
	/*Artista a=new Artista("nomea2",2);
	if(Artista.inserirArtista(a)!=0) {
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
	
	/*Album g1=new Album("nomeal2",2000,2);
	if(Album.inserirAlbum(g1)!=0) {
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
	
	/*Musica m=new Musica("nomem2",6,120,2);
	if(Musica.inserirMusica(m)!=0) {
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
	
	
	ResultSet res4 = con.relatorio();
	if(res4!=null) {
		try {
			while(res4.next()) {
				System.out.println("\nNome do Artista: "+res4.getString("nome_artista")+"\nNome do Genero: "+res4.getString("nome_genero")+"\nNome do Album: "+res4.getString("nome_album")+"\nAno da Musica: "+res4.getInt("ano")+"\nNome do Musica: "+res4.getString("nome_musica"));
			} 
			}catch (SQLException e) {
		System.out.println("Problema para exibir registros!");
			}
		}else{
			System.out.println("A pesquisa n�o retornou nenhum registro!");
		}
	}
}
	
