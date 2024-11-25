package com.mycompany.projeto;

import com.mycompany.projeto.views.TelaPrincipal;

public class Projeto {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            TelaPrincipal tela = new TelaPrincipal();
            tela.setVisible(true);
        });
    }
}
