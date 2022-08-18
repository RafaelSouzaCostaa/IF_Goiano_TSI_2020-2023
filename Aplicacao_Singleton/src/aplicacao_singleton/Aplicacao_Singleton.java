/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aplicacao_singleton;

import javax.swing.JOptionPane;

/**
 *
 * @author Rafael de Souza Costa
 */
public class Aplicacao_Singleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Login_Singleton logado = null;
        Usuario usuario = new Usuario("rafael", "1234e5");

        while (true) {
            String login = JOptionPane.showInputDialog("login: ");
            String senha = JOptionPane.showInputDialog("password: ");
            boolean aux = true;
            do {
                String codigoAleatorio = CodigoAleatorio.getCodigoAleatorio();
                String codigoDigitado = JOptionPane.showInputDialog("Digite o codigo ao lado: " + codigoAleatorio);

                if (codigoAleatorio.equals(codigoDigitado)) {
                    aux = false;
                }
            } while (aux);

            logado = Login_Singleton.getInstance();

            if (logado.Logar(login, senha, usuario)) {
            } else {
                JOptionPane.showMessageDialog(JOptionPane.getRootFrame(), "Dado de login incorreto");
            }

            if (logado.isLogado()) {
                JOptionPane.showMessageDialog(JOptionPane.getRootFrame(), "Usuario " + usuario.getLogin() + " logado com sucess");
                break;
            }
        }
    }
}
