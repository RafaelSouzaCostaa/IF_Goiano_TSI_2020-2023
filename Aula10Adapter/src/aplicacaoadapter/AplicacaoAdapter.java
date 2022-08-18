/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aplicacaoadapter;

import aplicacaoadapter.adapter.BD_Firebird_Adapter;
import aplicacaoadapter.adapter.BD_MySQL_Adapter;
import aplicacaoadapter.adapter.BD_Paradox_Adapter;
import aplicacaoadapter.adapter.I_TargetBancoDeDados;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafael de Souza Costa
 */
public class AplicacaoAdapter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        I_TargetBancoDeDados bancoDeDados = null;
        Cliente cliente = null;

        boolean indexMenu = true;
        while (indexMenu) {
            String index = JOptionPane.showInputDialog("1 - Criar Plano User \n2 - Conectar com banco\n3 - Ver Plano\n4 - Sair");

            switch (Integer.parseInt(index)) {
                case 1:
                    String indexPlano = JOptionPane.showInputDialog("Escolha o Plano: \n"
                            + "1 - " + Cliente.GRATUITO + "\n"
                            + "2 - " + Cliente.BASICO + "\n"
                            + "3 - " + Cliente.ULTIMATE + "\n");
                    String nomeUsuario = JOptionPane.showInputDialog("Nome usuario: \n");

                    if (indexPlano.equals("1")) {
                        bancoDeDados = new BD_Paradox_Adapter();
                        cliente = new Cliente(nomeUsuario, Cliente.GRATUITO);
                    }

                    if (indexPlano.equals("2")) {
                        bancoDeDados = new BD_Firebird_Adapter();
                        cliente = new Cliente(nomeUsuario, Cliente.BASICO);
                    }

                    if (indexPlano.equals("3")) {
                        bancoDeDados = new BD_MySQL_Adapter();
                        cliente = new Cliente(nomeUsuario, Cliente.ULTIMATE);
                    }
                    break;
                case 2:
                    if (bancoDeDados == null) {
                        JOptionPane.showMessageDialog(JOptionPane.getRootFrame(), "\nPor Favor criar um plano antes! ");
                    } else if (bancoDeDados.getBancoAdaptado().isConectado()) {
                        JOptionPane.showMessageDialog(JOptionPane.getRootFrame(), "\nBanco conectado!");
                    } else {
                        bancoDeDados.getBancoAdaptado().setConectado(true);
                        JOptionPane.showMessageDialog(JOptionPane.getRootFrame(), "\nBanco conectado com sucesso!");
                    }
                    break;
                case 3:
                    if (bancoDeDados.getBancoAdaptado() == null) {
                        JOptionPane.showMessageDialog(JOptionPane.getRootFrame(), "\nNão a plano Cadastrado!!!");
                    } else if (bancoDeDados.getBancoAdaptado().isConectado()) {
                        JOptionPane.showMessageDialog(JOptionPane.getRootFrame(), "\nBanco de Dados: "
                                + bancoDeDados.getBancoAdaptado().getNomeBD() + "\n"
                                + "Usuario: " + cliente.getNome() + "\n"
                                + "Plano: " + cliente.getTipoCliente());
                    } else {
                        JOptionPane.showMessageDialog(JOptionPane.getRootFrame(), "\nBanco não Conectado!");
                    }
                    break;
                case 4:
                    indexMenu = false;
                    break;
            }
        }
    }
}
