package controller;

import model.*;
import view.*;

import javax.swing.*;

public class CadastroController {

    public CadastroController(Janela j, TelaCadastro t, UsuarioDAO dao) {

        t.getBtVoltar().addActionListener(e -> j.mostrarTela("login"));

        t.getBtSalvar().addActionListener(e -> {

            Usuario u = new Usuario(
                t.getNome(),
                t.getCPF(),
                t.isAdmin(),
                0
            );

            dao.adicionarUsuario(u);
            JOptionPane.showMessageDialog(null, "Salvo!");
            j.mostrarTela("login");
        });
    }
}
