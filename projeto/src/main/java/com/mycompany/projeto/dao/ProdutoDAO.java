package com.mycompany.projeto.dao;

/**
 *
 * @author pedri
 */
import com.mycompany.projeto.models.Produto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProdutoDAO {
    
    static String URL = "jdbc:mysql://localhost:3306/projeto";
    static String login = "root";
    static String senha = "Tennerpotter_1";
    
    
    public static boolean salvar(Produto obj){
        Connection conexao = null;
       boolean retorno = false;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection(URL, login, senha);
            
            PreparedStatement instrucaoSQL = conexao.prepareStatement(
                    "INSERT INTO Produto (codProduto, nomeProduto, qtdProduto, valorProduto) VALUES (?,?,?,?)"
            );
            
            instrucaoSQL.setInt(1, obj.getCodProduto());
            instrucaoSQL.setString(2, obj.getNomeProduto());
            instrucaoSQL.setInt(3, obj.getQtdProduto());
            instrucaoSQL.setFloat(4, obj.getValorProduto());
            
            int linhasAfetadas = instrucaoSQL.executeUpdate();
            
            if(linhasAfetadas>0){
                retorno=true;
            }
            
        } catch (ClassNotFoundException e){
            System.out.println("Driver não encontrado!");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            if(conexao!=null){
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
       return retorno;
    }
    
    public static ArrayList<Produto> listar(){
        ArrayList<Produto> listaRetorno = new ArrayList<>();
        Connection conexao = null;
        ResultSet rs = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection(URL, login, senha);
            
            PreparedStatement instrucaoSQL = conexao.prepareStatement(
                    "SELECT * FROM Produto"
            );
            
            rs = instrucaoSQL.executeQuery();
            
            if(rs !=null){
                while(rs.next()){
                    int id = rs.getInt("idProduto");
                    int codProduto = rs.getInt("codProduto");
                    int qtdProduto = rs.getInt("qtdProduto");
                    String nome = rs.getString("nomeProduto");
                    float valor = rs.getFloat("valorProduto");
                    
                    Produto item = new Produto(id, codProduto, nome, qtdProduto, valor);
                    listaRetorno.add(item);
                }
            }
            
        } catch (Exception e) {
            listaRetorno = null;
        } finally {
            if(conexao != null){
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (rs!=null){
                try {
                    rs.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return listaRetorno;
    }
    
    public static boolean alterar(Produto obj){
        Connection conexao = null;
       boolean retorno = false;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection(URL, login, senha);
            
            PreparedStatement instrucaoSQL = conexao.prepareStatement(
                    "UPDATE Produto SET codProduto=?, nomeProduto=?, valorProduto=?, qtdProduto=? WHERE idProduto = ?;"
            );
            instrucaoSQL.setInt(1, obj.getCodProduto());
            instrucaoSQL.setString(2, obj.getNomeProduto());
            instrucaoSQL.setFloat(3, obj.getValorProduto());
            instrucaoSQL.setInt(4, obj.getQtdProduto());
            instrucaoSQL.setInt(5, obj.getIdProduto());
            
            int linhasAfetadas = instrucaoSQL.executeUpdate();
            
            if(linhasAfetadas>0){
                retorno=true;
            }
            
        } catch (ClassNotFoundException e){
            System.out.println("Driver não encontrado!");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            if(conexao!=null){
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
       return retorno;
    }
    
    public static boolean excluir(int idExcluir){
        Connection conexao = null;
       boolean retorno = false;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection(URL, login, senha);
            
            PreparedStatement instrucaoSQL = conexao.prepareStatement(
                    "DELETE FROM Produto WHERE idProduto = ?;"
            );

            instrucaoSQL.setInt(1, idExcluir);
            
            int linhasAfetadas = instrucaoSQL.executeUpdate();
            
            if(linhasAfetadas>0){
                retorno=true;
            }
            
        } catch (ClassNotFoundException e){
            System.out.println("Driver não encontrado!");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            if(conexao!=null){
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
       return retorno;
    }
}
