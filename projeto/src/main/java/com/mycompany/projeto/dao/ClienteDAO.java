package com.mycompany.projeto.dao;

/**
 *
 * @author pedri
 */
import com.mycompany.projeto.models.Cliente;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
public class ClienteDAO {
    
    static String URL = "jdbc:mysql://localhost:3306/projeto";
    static String login = "root";
    static String senha = "Tennerpotter_1";
    
    
    public static boolean salvar(Cliente obj){
        Connection conexao = null;
       boolean retorno = false;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection(URL, login, senha);
            
            PreparedStatement instrucaoSQL = conexao.prepareStatement(
                    "INSERT INTO Cliente (nomeCliente, CPF, emailCliente) VALUES (?,?,?)"
            );
            
            instrucaoSQL.setString(1, obj.getNomeCliente());
            instrucaoSQL.setString(2, obj.getCPF());
            instrucaoSQL.setString(3, obj.getEmailCliente());
            
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
    
    public static ArrayList<Cliente> listar(){
        ArrayList<Cliente> listaRetorno = new ArrayList<>();
        Connection conexao = null;
        ResultSet rs = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection(URL, login, senha);
            
            PreparedStatement instrucaoSQL = conexao.prepareStatement(
                    "SELECT * FROM Cliente"
            );
            
            rs = instrucaoSQL.executeQuery();
            
            if(rs !=null){
                while(rs.next()){
                    int id = rs.getInt("idCliente");
                    String nome = rs.getString("nomeCliente");
                    String CPF = rs.getString("CPF");
                    String email = rs.getString("emailCliente");
                    
                    Cliente item = new Cliente(id, nome, email, CPF);
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
    
    public static Cliente buscarPorCPF(String cpfBuscar){
        Cliente retorno = null;
        Connection conexao = null;
        ResultSet rs = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection(URL, login, senha);
            
            PreparedStatement instrucaoSQL = conexao.prepareStatement(
                    "SELECT * FROM Cliente WHERE CPF = ?"
            );
        
            instrucaoSQL.setString(1, cpfBuscar);
            rs = instrucaoSQL.executeQuery();
            
            if(rs != null){
                while (rs.next()){
                    int id = rs.getInt("idCliente");
                    String nome = rs.getString("nomeCliente");
                    String cpf = rs.getString("CPF");
                    String email = rs.getString("emailCliente");
                    
                    retorno = new Cliente(id, nome, email, cpf);
                }
            }
            }catch(Exception e){
            retorno = null;
            }finally {
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
        return retorno;
    }
    
    public static boolean alterar(Cliente obj){
        Connection conexao = null;
       boolean retorno = false;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection(URL, login, senha);
            
            PreparedStatement instrucaoSQL = conexao.prepareStatement(
                    "UPDATE Cliente SET nomeCliente=?, emailCliente=? WHERE idCliente = ?;"
            );
            
            instrucaoSQL.setString(1, obj.getNomeCliente());
            instrucaoSQL.setString(2, obj.getEmailCliente());
            instrucaoSQL.setInt(3, obj.getIdCliente());
            
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
                    "DELETE FROM Cliente WHERE idCliente = ?;"
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
