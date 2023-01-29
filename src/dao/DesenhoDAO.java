package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Desenho; 


public class DesenhoDAO {
	public void cadastrarDesenho(Desenho desenho) throws ExceptionDAO{
		String sql = "insert into desenho (titulo, genero, horario, resumo, idademin) value (?,?,?,?,?)";
		PreparedStatement pStatement = null;
		Connection connection = null;
		
		try {
			connection = new ConnectionMVC().getConnection();
			pStatement = connection.prepareStatement(sql);
			pStatement.setString(1, desenho.getTitulo());
			pStatement.setString(2, desenho.getGenero());
			pStatement.setString(3, desenho.getHorario());
			pStatement.setString(4, desenho.getResumo());
			pStatement.setString(5, desenho.getIdademin());
			pStatement.execute();
			
		} catch(SQLException e) {
			throw new ExceptionDAO("Erro ao cadastrar Desenho: " + e);
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

	}
