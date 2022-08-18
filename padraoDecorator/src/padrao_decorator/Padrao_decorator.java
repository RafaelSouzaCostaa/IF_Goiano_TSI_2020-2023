/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package padrao_decorator;

import javax.swing.JOptionPane;

/**
 *
 * @author Rafael de Souza Costa
 */
public class Padrao_decorator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        I_Assinatura assinatura = null;

        boolean chaveMenu = true;
        while (chaveMenu) {
            String index = JOptionPane.showInputDialog(" 1 - Assinar\n"
                    + " 2 - Comprar pacote 1\n"
                    + " 3 - Comprar pacote 2\n"
                    + " 4 - Comprar pacote 3\n"
                    + " 5 - Comprar pacote 4\n"
                    + " 6 - Comprar pacote 5\n"
                    + " 7 - Sair");
            switch (index) {
                case "1":
                    assinatura = new AssinaturaBase();
                    assinatura.assinar();
                    break;
                case "2":
                    if (validarAssinatura(assinatura)) {
                        assinatura = new Pacote01(assinatura);
                        assinatura.assinar();
                    }
                    break;
                case "3":
                    if (validarAssinatura(assinatura)) {
                        assinatura = new Pacote02(assinatura);
                        assinatura.assinar();
                    }
                case "4":
                    if (validarAssinatura(assinatura)) {
                        assinatura = new Pacote03(assinatura);
                        assinatura.assinar();
                    }
                    break;
                case "5":
                    if (validarAssinatura(assinatura)) {
                        assinatura = new Pacote04(assinatura);
                        assinatura.assinar();
                    }
                    break;
                case "6":
                    if (validarAssinatura(assinatura)) {
                        assinatura = new Pacote05(assinatura);
                        assinatura.assinar();
                    }
                    break;
                case "7":
                    chaveMenu = false;
                    break;
                default:
            }
        }
    }

    public static boolean validarAssinatura(I_Assinatura assinaturaBase) {
        if (assinaturaBase == null) {
            JOptionPane.showMessageDialog(JOptionPane.getRootFrame(), "Realizar assinatura antes de comprar pacote");
            return false;
        }
        return true;
    }
}
