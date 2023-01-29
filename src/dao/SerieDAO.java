package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Serie; 


public class SerieDAO {
	public void cadastrarSerie(Serie serie) throws ExceptionDAO{
		String sql = "insert into serie (titulo, genero, horario, resumo, quantidadep) value (?,?,?,?,?)";
		PreparedStatement pStatement = null;
		Connection connection = null;
		
		try {
			connection = new ConnectionMVC().getConnection();
			pStatement = connection.prepareStatement(sql);
			pStatement.setString(1, serie.getTitulo());
			pStatement.setString(2, serie.getGenero());
			pStatement.setString(3, serie.getHorario());
			pStatement.setString(4, serie.getResumo());
			pStatement.setString(5, serie.getQuantidadep());
			pStatement.execute();
			
		} catch(SQLException e) {
			throw new ExceptionDAO("Erro ao cadastrar Serie: " + e);
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
