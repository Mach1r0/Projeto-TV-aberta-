package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Filme;

public class FilmeDAO {
	
	public void cadastrarPrograma(Filme filme) throws Exception{
		
		String sql = "inserir into desenho (titulo, genero, resumo, horario, idademin, value (?,?,?,?,?) ";
		PreparedStatement pStatement = null;
		Connection connection = null;
		
		try {
		connection = new ConnectionMVC().getConnection();
		pStatement = connection.prepareStatement(sql);
		pStatement.setString(1, filme.getTitulo());
		pStatement.setString(2, filme.getTitulo());
		pStatement.setString(3, filme.getTitulo());
		pStatement.setString(4, filme.getTitulo());
		pStatement.setString(5, filme.getTitulo());
		pStatement.execute();
		}catch(SQLException e){
			throw new ExceptionDAO("Erro ao cadastrar o filme: " + e);		
		}
		finally {
			try {
				if(pStatement != null) {pStatement.close();};
			}catch(SQLException e) {
				throw new ExceptionDAO("Erro ao fechar o Statement: " + e);		
			}
			try {
				if (connection != null) {connection.close();}
			}
			catch(SQLException e) {
				throw new ExceptionDAO("Erro ao cadastrar o Filme: " + e);			
			}
		}
	} 
}
