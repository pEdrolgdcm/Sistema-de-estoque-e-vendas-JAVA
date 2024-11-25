package com.mycompany.projeto.dao;

import static com.mycompany.projeto.dao.VendaDAO.URL;
import static com.mycompany.projeto.dao.VendaDAO.login;
import static com.mycompany.projeto.dao.VendaDAO.senha;
import com.mycompany.projeto.models.RelatorioSintetico;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author pedri
 */
public class RelatorioSinteticoDAO {
    static String URL = "jdbc:mysql://localhost:3306/projeto";
    static String login = "root";
    static String senha = "Tennerpotter_1";
    
    public static ArrayList<RelatorioSintetico> listarPorPeriodo(Date dtInicio, Date dtTermino){
        Connection conexao = null;
        ResultSet rs = null;
        ArrayList<RelatorioSintetico>listaRetorno = new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection(URL, login, senha);
            
            String sql = "SELECT Venda.idVenda, Venda.idCLiente, Cliente.nomeCliente, Venda.dataVenda, Venda.valorVenda FROM Venda INNER JOIN Cliente ON Venda.idCLiente = Cliente.idCliente WHERE dataVenda BETWEEN ? AND ?";
            
            PreparedStatement comandoSQL = conexao.prepareStatement(sql);
            comandoSQL.setDate(1, new java.sql.Date(dtInicio.getTime()));
            comandoSQL.setDate(2, new java.sql.Date(dtTermino.getTime()));
            rs = comandoSQL.executeQuery();
            if (rs!=null){
                while(rs.next()){
                    RelatorioSintetico item = null;
                    int idVenda = rs.getInt("idVenda");
                    int idCliente = rs.getInt("idCliente");
                    String nomeCliente = rs.getString("nomeCliente");
                    Date dataVenda = rs.getDate("dataVenda");
                    float valorVenda = rs.getFloat("valorVenda");

                    item = new RelatorioSintetico(idVenda, dataVenda, idCliente, nomeCliente, valorVenda);

                    listaRetorno.add(item);
                }
            }
        } catch (Exception e) {
            listaRetorno = null;
        }
        return listaRetorno;
    }
}
