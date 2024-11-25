/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.projeto.views;

import com.mycompany.projeto.dao.ClienteDAO;
import com.mycompany.projeto.dao.ProdutoDAO;
import com.mycompany.projeto.dao.RelatorioAnaliticoDAO;
import com.mycompany.projeto.dao.RelatorioSinteticoDAO;
import com.mycompany.projeto.dao.VendaDAO;
import com.mycompany.projeto.models.Cliente;
import com.mycompany.projeto.models.ItemVenda;
import com.mycompany.projeto.models.Produto;
import com.mycompany.projeto.models.RelatorioAnalitico;
import com.mycompany.projeto.models.RelatorioSintetico;
import com.mycompany.projeto.models.Venda;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aluno
 */
public class TelaPrincipal extends javax.swing.JFrame {

    Venda objVenda = new Venda();
    float valorTotal = 0;
    
    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        cboProdutos.removeAllItems();
        ArrayList<Produto> listaProdutos = ProdutoDAO.listar();
        for(Produto item : listaProdutos){
            cboProdutos.addItem(item);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        pnlVenda = new javax.swing.JPanel();
        lblCPF = new javax.swing.JLabel();
        txtCPF = new javax.swing.JFormattedTextField();
        btnBuscarCPF = new javax.swing.JButton();
        lblNomeCliente = new javax.swing.JLabel();
        cboProdutos = new javax.swing.JComboBox<Produto>();
        spnQtd = new javax.swing.JSpinner();
        btnAdicionar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVenda = new javax.swing.JTable();
        btnExcluir = new javax.swing.JButton();
        lblTextValorTotal = new javax.swing.JLabel();
        lblValorTotal = new javax.swing.JLabel();
        btnConfirmar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        pnlRelatorios = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblRelatorioSintetico = new javax.swing.JTable();
        btnPesquisar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lblValorTotalPeriodo = new javax.swing.JLabel();
        btnDetalhes = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblDetalhes = new javax.swing.JTable();
        jdcDataInicio = new com.toedter.calendar.JDateChooser();
        jdcDataTermino = new com.toedter.calendar.JDateChooser();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuProdutos = new javax.swing.JMenu();
        mnuCadastrarProdutos = new javax.swing.JMenuItem();
        mnuClientes = new javax.swing.JMenu();
        mnuCadastrarClientes = new javax.swing.JMenuItem();
        mnuSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        lblCPF.setText("CPF:");

        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCPFActionPerformed(evt);
            }
        });

        btnBuscarCPF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone_lupa.png"))); // NOI18N
        btnBuscarCPF.setText("Buscar");
        btnBuscarCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCPFActionPerformed(evt);
            }
        });

        cboProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboProdutosActionPerformed(evt);
            }
        });

        btnAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone_sim.png"))); // NOI18N
        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        tblVenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Produto", "Código", "Nome", "Qtd", "Vlr Unitário"
            }
        ));
        jScrollPane1.setViewportView(tblVenda);

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone_nao.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        lblTextValorTotal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTextValorTotal.setText("Valor Total:");

        lblValorTotal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblValorTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        btnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone_sim.png"))); // NOI18N
        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone_nao.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlVendaLayout = new javax.swing.GroupLayout(pnlVenda);
        pnlVenda.setLayout(pnlVendaLayout);
        pnlVendaLayout.setHorizontalGroup(
            pnlVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlVendaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlVendaLayout.createSequentialGroup()
                        .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 5, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlVendaLayout.createSequentialGroup()
                        .addGroup(pnlVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlVendaLayout.createSequentialGroup()
                                .addComponent(lblTextValorTotal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlVendaLayout.createSequentialGroup()
                                .addGroup(pnlVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(pnlVendaLayout.createSequentialGroup()
                                        .addComponent(lblCPF)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnBuscarCPF))
                                    .addComponent(cboProdutos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNomeCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(pnlVendaLayout.createSequentialGroup()
                                        .addComponent(spnQtd)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnAdicionar))))
                            .addComponent(jScrollPane1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir)))
                .addContainerGap())
        );
        pnlVendaLayout.setVerticalGroup(
            pnlVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlVendaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCPF)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarCPF)
                    .addComponent(lblNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdicionar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlVendaLayout.createSequentialGroup()
                        .addComponent(btnExcluir)
                        .addGap(0, 229, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTextValorTotal, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblValorTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirmar)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Vendas", pnlVenda);

        jLabel1.setText("Data de início:");

        jLabel2.setText("Data de término:");

        tblRelatorioSintetico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Data", "Cliente", "Valor Total"
            }
        ));
        jScrollPane2.setViewportView(tblRelatorioSintetico);

        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone_lupa.png"))); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Valor total:");

        btnDetalhes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone_lapis.png"))); // NOI18N
        btnDetalhes.setText("Detalhar");
        btnDetalhes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetalhesActionPerformed(evt);
            }
        });

        tblDetalhes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Qtd", "Vlr Unitario"
            }
        ));
        jScrollPane3.setViewportView(tblDetalhes);

        jdcDataInicio.setDateFormatString("dd/MM/yyyy");

        jdcDataTermino.setDateFormatString("dd/MM/yyyy");

        javax.swing.GroupLayout pnlRelatoriosLayout = new javax.swing.GroupLayout(pnlRelatorios);
        pnlRelatorios.setLayout(pnlRelatoriosLayout);
        pnlRelatoriosLayout.setHorizontalGroup(
            pnlRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRelatoriosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRelatoriosLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblValorTotalPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRelatoriosLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jdcDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jdcDataTermino, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDetalhes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlRelatoriosLayout.setVerticalGroup(
            pnlRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRelatoriosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(btnPesquisar))
                    .addComponent(jdcDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdcDataTermino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDetalhes)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(lblValorTotalPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Relatórios", pnlRelatorios);

        jMenu1.setText("Arquivo");

        mnuProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone_caixa.png"))); // NOI18N
        mnuProdutos.setText("Produtos");

        mnuCadastrarProdutos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        mnuCadastrarProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone_adicionar.png"))); // NOI18N
        mnuCadastrarProdutos.setText("Cadastrar");
        mnuCadastrarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCadastrarProdutosActionPerformed(evt);
            }
        });
        mnuProdutos.add(mnuCadastrarProdutos);

        jMenu1.add(mnuProdutos);

        mnuClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone_cliente.png"))); // NOI18N
        mnuClientes.setText("Clientes");

        mnuCadastrarClientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        mnuCadastrarClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone_adicionar.png"))); // NOI18N
        mnuCadastrarClientes.setText("Cadastrar");
        mnuCadastrarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCadastrarClientesActionPerformed(evt);
            }
        });
        mnuClientes.add(mnuCadastrarClientes);

        jMenu1.add(mnuClientes);

        mnuSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        mnuSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone_sair.png"))); // NOI18N
        mnuSair.setText("Sair");
        mnuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSairActionPerformed(evt);
            }
        });
        jMenu1.add(mnuSair);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuCadastrarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCadastrarProdutosActionPerformed
        TelaProdutos tela = new TelaProdutos();
        tela.setVisible(true);
    }//GEN-LAST:event_mnuCadastrarProdutosActionPerformed

    private void txtCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCPFActionPerformed

    private void btnBuscarCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCPFActionPerformed
        String cpf = txtCPF.getText();
        Cliente objRetorno = ClienteDAO.buscarPorCPF(cpf);
        if (objRetorno != null){
            lblNomeCliente.setText(objRetorno.getNomeCliente());
            objVenda.setIdCliente(objRetorno.getIdCliente());
        }
    }//GEN-LAST:event_btnBuscarCPFActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        txtCPF.setText("");
        lblNomeCliente.setText("");
        valorTotal = 0;
        lblValorTotal.setText("0.00");
        DefaultTableModel modeloVenda = (DefaultTableModel) tblVenda.getModel();
        modeloVenda.setRowCount(0);
        jdcDataInicio.setDate(null);
        jdcDataTermino.setDate(null);
        cboProdutos.setSelectedIndex(0);
        spnQtd.setValue(0);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        Date dataInicio = jdcDataInicio.getDate();
        Date dataTermino = jdcDataTermino.getDate();
        ArrayList<RelatorioSintetico> lista = RelatorioSinteticoDAO.listarPorPeriodo(dataInicio, dataTermino);
        DefaultTableModel modelo = (DefaultTableModel) tblRelatorioSintetico.getModel();
        modelo.setRowCount(0);
        for (RelatorioSintetico item:lista){
            modelo.addRow(new String[]{
                String.valueOf(item.getIdVenda()),
                String.valueOf(item.getDataVenda()),
                item.getNomeCliente(),
                String.valueOf(item.getValorVenda())
        });
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnDetalhesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetalhesActionPerformed
        int linhaSelecionada = tblRelatorioSintetico.getSelectedRow();
        if(linhaSelecionada>=0){
            DefaultTableModel modelo = (DefaultTableModel)tblRelatorioSintetico.getModel();
            int idVenda = Integer.parseInt(modelo.getValueAt(linhaSelecionada, 0).toString());
            ArrayList<RelatorioAnalitico> lista = RelatorioAnaliticoDAO.listarPorVenda(idVenda);
            DefaultTableModel modeloAnalitico = (DefaultTableModel)tblDetalhes.getModel();
            modeloAnalitico.setRowCount(0);
            for (RelatorioAnalitico item : lista){ 
                modeloAnalitico.addRow(new String[]{
                    item.getNomeProduto(),
                    String.valueOf(item.getQtdProduto()),
                    String.valueOf(item.getVlrUnitario())
                });
            }
        }
        
    }//GEN-LAST:event_btnDetalhesActionPerformed

    private void cboProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboProdutosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboProdutosActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        Produto produtoSelecionado = (Produto) cboProdutos.getSelectedItem();
        if(produtoSelecionado !=null){
           DefaultTableModel modelo = (DefaultTableModel)tblVenda.getModel();
           modelo.addRow(new String[]{
               String.valueOf(produtoSelecionado.getIdProduto()),
               String.valueOf(produtoSelecionado.getCodProduto()),
               produtoSelecionado.getNomeProduto(),
               String.valueOf(Integer.parseInt(spnQtd.getValue().toString())),
               String.valueOf(produtoSelecionado.getValorProduto())
           });
           float valorUnitario = produtoSelecionado.getValorProduto();
           int qtd = Integer.parseInt(spnQtd.getValue().toString());
           float valorLinha = valorUnitario * qtd;
           valorTotal += valorLinha;
           lblValorTotal.setText(String.valueOf(valorTotal));
        }
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) tblVenda.getModel();
        for(int i=0; i<modelo.getRowCount(); i++){
            ItemVenda novoItem = null;
            int idProduto = Integer.parseInt(modelo.getValueAt(i, 0).toString());
            int codProduto = Integer.parseInt(modelo.getValueAt(i, 1).toString());
            String nomeProduto = modelo.getValueAt(i, 2).toString();
            int qtdProduto = Integer.parseInt(modelo.getValueAt(i, 3).toString());
            float vlrUnitario = Float.parseFloat(modelo.getValueAt(i, 4).toString());
            
            novoItem = new ItemVenda(idProduto, qtdProduto, vlrUnitario);
            objVenda.getListaItens().add(novoItem);
        }
        objVenda.setValorVenda(Float.parseFloat(lblValorTotal.getText()));
        objVenda.setDataVenda(new Date());
        Cliente objRetorno = ClienteDAO.buscarPorCPF(txtCPF.getText());
        if (objRetorno != null){
            objVenda.setIdCliente(objRetorno.getIdCliente());
        }
        boolean retorno = VendaDAO.salvar(objVenda);
        if(retorno){
            JOptionPane.showMessageDialog(rootPane, "Venda realizada com sucesso!");
        }else{
            JOptionPane.showMessageDialog(rootPane, "Falha na venda!");
        }
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) tblVenda.getModel();
        int linhaSelecionada = tblVenda.getSelectedRow();
        if (linhaSelecionada != -1) {
            float valorLinha = Float.parseFloat(modelo.getValueAt(linhaSelecionada, 4).toString()) 
                * Integer.parseInt(modelo.getValueAt(linhaSelecionada, 3).toString());
        valorTotal -= valorLinha;
        lblValorTotal.setText(String.valueOf(valorTotal));
        modelo.removeRow(linhaSelecionada);
        }else {
            JOptionPane.showMessageDialog(this, "Por favor, selecione uma linha para excluir.");
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void mnuCadastrarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCadastrarClientesActionPerformed
        TelaClientes tela = new TelaClientes();
        tela.setVisible(true);
    }//GEN-LAST:event_mnuCadastrarClientesActionPerformed

    private void mnuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSairActionPerformed
         System.exit(0);
    }//GEN-LAST:event_mnuSairActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnBuscarCPF;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnDetalhes;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JComboBox<Produto> cboProdutos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private com.toedter.calendar.JDateChooser jdcDataInicio;
    private com.toedter.calendar.JDateChooser jdcDataTermino;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblNomeCliente;
    private javax.swing.JLabel lblTextValorTotal;
    private javax.swing.JLabel lblValorTotal;
    private javax.swing.JLabel lblValorTotalPeriodo;
    private javax.swing.JMenuItem mnuCadastrarClientes;
    private javax.swing.JMenuItem mnuCadastrarProdutos;
    private javax.swing.JMenu mnuClientes;
    private javax.swing.JMenu mnuProdutos;
    private javax.swing.JMenuItem mnuSair;
    private javax.swing.JPanel pnlRelatorios;
    private javax.swing.JPanel pnlVenda;
    private javax.swing.JSpinner spnQtd;
    private javax.swing.JTable tblDetalhes;
    private javax.swing.JTable tblRelatorioSintetico;
    private javax.swing.JTable tblVenda;
    private javax.swing.JFormattedTextField txtCPF;
    // End of variables declaration//GEN-END:variables
}
