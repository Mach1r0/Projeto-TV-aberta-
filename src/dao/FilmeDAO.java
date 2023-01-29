package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Filme;
	

public class FilmeDAO {
	PreparedStatement pStatement = null;
	Connection connection = null;
	Filme filme = new Filme();

	public void filmeCadastro(Filme filme) throws ExceptionDAO{
		String sql = "insert into filme (titulo, genero, horario, resumo, diretor) value (?,?,?,?,?)";
		
		try {
			connection = new ConnectionMVC().getConnection();
			pStatement = connection.prepareStatement(sql);
			pStatement.setString(1, filme.getTitulo());
			pStatement.setString(2, filme.getGenero());
			pStatement.setString(3, filme.getHorario());
			pStatement.setString(4, filme.getResumo());
			pStatement.setString(5, filme.getDiretor());
			pStatement.execute();
			
		} catch(SQLException e) {
			throw new ExceptionDAO("Erro ao cadastrar Filme: " + e);
		}finally {
			try {
				if(pStatement != null) {pStatement.close();}
			} catch (SQLException e) {
				throw new ExceptionDAO("Erro ao fechar o Statement: "+ e);
			} try {
				if(connection != null) {connection.close();}
			} catch (SQLException e) {
				throw new ExceptionDAO("Erro ao fechar conexão: " + e);
			}
		}
	}
	public ArrayList<Filme> listarFilmes(String titulo) throws ExceptionDAO{
		String sql = "select * from filme where titulo '%"+ titulo +"%' titulo by titulo";
		Connection connection = null;
		PreparedStatement pStatemente = null;
		ArrayList<Filme> filmes = null;
		
		try{
			 connection = new ConnectionMVC().getConnection();
			 pStatemente = connection.prepareStatement(sql);
			 ResultSet rs = pStatemente.executeQuery();
		if(rs !=null) {
			filmes = new ArrayList<Filme>();
			while (rs.next()) {
				filme.setCodFilme(rs.getInt("CodFilme"));
				filme.setTitulo(rs.getString("Titulo"));
				filme.setGenero(rs.getString("Genero"));
				filme.setHorario(rs.getString("Horario"));
				filme.setResumo(rs.getString("Resumo"));
				filme.setDiretor(rs.getString("Diretor"));
				filmes.add(filme);
			}
		} 
		}catch (SQLException e) {
            throw new ExceptionDAO("Erro ao alterar Canal" +e );
        }finally {
            try {
                if (pStatement != null) {pStatement.close();}
            }catch(SQLException e) {
                throw new ExceptionDAO("Erro ao fechar o Statement"+e);
                }
            try {
                if(connection != null) {connection.close();}
            }catch(SQLException e) {
                throw new ExceptionDAO("Erro ao fechar a conexão:"+e);
            }
        
	}
		return filmes;
		}
	
	}
