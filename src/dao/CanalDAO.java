package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
            throw new ExceptionDAO("Erro ao cadastrar canal" +e );
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
        }}
    
	public ArrayList <Canal> listarCanais(String nome) throws ExceptionDAO{
    	String sql = "select * from canal where nome like'%" + nome + "%' order by nome;";
    	Connection connection = null;
    	PreparedStatement pStatement = null;
    	ArrayList <Canal> canais = null;
    	
    	try {
    		connection = new ConnectionMVC().getConnection();
    		pStatement = connection.prepareStatement(sql);
    		ResultSet rs = pStatement.executeQuery();
    		
    		if (rs !=null) {
    			canais = new ArrayList<Canal>();
    			while(rs.next()) {
    				Canal canal = new Canal();
    				canal.setCodcanal(rs.getInt("Codcanal"));
    				canal.setNome (rs.getString("Nome"));
    				canais.add(canal);
    			}
    		}
    	}catch(SQLException e){
    		throw new ExceptionDAO("Erro ao consultar atores: " + e );
    	}finally {
    		try {
    			if(pStatement != null) {pStatement.close();}
    		}catch(final SQLException e){
        		throw new ExceptionDAO("Erro ao consultar o Statement: " + e );
    	}
    	try {
    			if(connection != null) {connection.close();}
    		}catch(final SQLException e){
        		throw new ExceptionDAO("Erro ao consultar a fechar a conexão: " + e );
    	}
		return canais;}
     }
    	  public void alterarCanal(Canal canal) throws Exception{
    		    String sql = "Update canal set nome =?  where codCanal =?";
    		    PreparedStatement pStatement = null;
    		    Connection connection = null;

    		    try {
    		        connection = new ConnectionMVC().getConnection();
    		        pStatement = connection.prepareStatement(sql);
    		        pStatement.setString(1, canal.getNome());
    		        pStatement.setInt(2, canal.getCodcanal());
    		        pStatement.execute();
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
    		        }}
    	  public void excluirCanal(Canal canal) throws Exception{
    		    String sql = "Delete from Canal where codCanal = ?";
    		    PreparedStatement pStatement = null;
    		    Connection connection = null;

    		    try {
    		        connection = new ConnectionMVC().getConnection();
    		        pStatement = connection.prepareStatement(sql);
    		        pStatement.setInt(1, canal.getCodcanal());
    		        pStatement.execute();
    		        }catch (SQLException e) {
    		            throw new ExceptionDAO("Erro ao apagar canal" +e );
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
    		        }}
    		    
}
