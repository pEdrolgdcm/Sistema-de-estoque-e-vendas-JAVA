package com.mycompany.projeto.dao;

import static com.mycompany.projeto.dao.VendaDAO.URL;
import static com.mycompany.projeto.dao.VendaDAO.login;
import static com.mycompany.projeto.dao.VendaDAO.senha;
import com.mycompany.projeto.models.RelatorioAnalitico;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
/**
 *
 * @author pedri
 */
public class RelatorioAnaliticoDAO {
    static String URL = "jdbc:mysql://localhost:3306/projeto";
    static String login = "root";
    static String senha = "Tennerpotter_1";
    
    public static ArrayList<RelatorioAnalitico> listarPorVenda(int idVenda){
        Connection conexao = null;
        ResultSet rs = null;
        ArrayList<RelatorioAnalitico>listaRetorno = new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection(URL, login, senha);
            
            String sql = "SELECT ItemVenda.idProduto, Produto.nomeProduto, ItemVenda.vlrUnitario, ItemVenda.qtdProduto FROM ItemVenda INNER JOIN Produto ON ItemVenda.idProduto = Produto.idProduto WHERE idVenda = ?";
            
            PreparedStatement comandoSQL = conexao.prepareStatement(sql);
            comandoSQL.setInt(1, idVenda);
            rs = comandoSQL.executeQuery();
            if (rs!=null){
                while(rs.next()){
                    RelatorioAnalitico item = null;
                    String nomeProduto = rs.getString("nomeProduto");
                    float valorUnitario = rs.getFloat("vlrUnitario");
                    int qtdProduto = rs.getInt("qtdProduto");

                    item = new RelatorioAnalitico(nomeProduto, qtdProduto, valorUnitario);

                    listaRetorno.add(item);
                }
            }
        } catch (Exception e) {
            listaRetorno = null;
        }
        return listaRetorno;
    }
}
