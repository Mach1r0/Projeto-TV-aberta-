package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Desenho;

public class Desenhodao {
	
	public void cadastrarPrograma() throws Exception{
		
		String sql = "inserir into filme (titulo, genero, resumo, horario, diretor, value (?,?,?,?,?) ";
		PreparedStatement pStatement = null;
		Connection connection = null;
		
		try {
		connection = new ConnectionMVC().getConnection();
		pStatement = connection.prepareStatement(sql);
		}
	} 
}
