package com.mycompany.projeto.models;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author pedri
 */
public class Venda {
    private int idVenda;
    private float valorVenda;
    private Date dataVenda;
    private int idCliente;
    private ArrayList<ItemVenda> listaItens = new ArrayList<>();

    public Venda() {
    }
    
    public Venda(float valorVenda, Date dataVenda, int idCliente, ArrayList<ItemVenda> listaItens) {
        this.valorVenda = valorVenda;
        this.dataVenda = dataVenda;
        this.idCliente = idCliente;
        this.listaItens = listaItens;
    }

    public Venda(int idVenda, float valorVenda, Date dataVenda, int idCliente, ArrayList<ItemVenda> listaItens) {
        this.idVenda = idVenda;
        this.valorVenda = valorVenda;
        this.dataVenda = dataVenda;
        this.idCliente = idCliente;
        this.listaItens = listaItens;
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public float getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(float valorVenda) {
        this.valorVenda = valorVenda;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public ArrayList<ItemVenda> getListaItens() {
        return listaItens;
    }

    public void setListaItens(ArrayList<ItemVenda> listaItens) {
        this.listaItens = listaItens;
    }
}
