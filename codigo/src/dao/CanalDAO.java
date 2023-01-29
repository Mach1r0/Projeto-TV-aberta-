package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Canal;

public class CanalDAO {
    public void cadastrarCanal(Canal canal) throws Exception{
    String sql = "Insert into canal (nome) value (?)";
    PreparedStatement pStatement = null;
    Connection connection = null;

    try {
        connection = new ConnectionMVC().getConnection();
        pStatement = connection.prepareStatement(sql);
        pStatement.setString(1, canal.getNome());
        pStatement.execute();
        }catch (SQLException e) {
            throw new ExceptionDAO("Erro ao cadastrar ator" +e );
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

    
    }
    }
