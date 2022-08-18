/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package padraocomposite;

import javax.swing.JOptionPane;

/**
 *
 * @author Rafael de Souza Costa
 */
public class PadraoComposite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        CompositeCaixa caixa = new CompositeCaixa();

        boolean chave = true;
        while (chave) {
            String index = JOptionPane.showInputDialog(" 1 - " + "BRONZE\n"
                                                    + " 2 - PRATA\n"
                                                    + " 3 - OURO\n"
                                                    + " 4 - PRATINA\n"
                                                    + " 5 - PRINT\n"
                                                    + " 6 - SAIR");

            switch (index) {
                case "1":
                    caixa.prepararItens(Cliente.BRONZE);
                    break;
                case "2":
                    caixa.prepararItens(Cliente.PRATA);
                    break;
                case "3":
                    caixa.prepararItens(Cliente.OURO);
                    break;
                case "4":
                    caixa.prepararItens(Cliente.PLATINA);
                    break;
                case "5":
                    caixa.print();
                    caixa = new CompositeCaixa();
                    break;
                case "6":
                    chave = false;
                    break;
                default:
                    
            }
        }
    }
}
