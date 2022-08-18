/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package padrao_decorator;

import javax.swing.JOptionPane;
import padrao_decorator.I_Assinatura;
import padrao_decorator.AssinaturaDecorator;

/**
 *
 * @author Rafael de Souza Costa
 */
public class Pacote04 extends AssinaturaDecorator {

    public Pacote04(I_Assinatura assinatura) {
        super(assinatura);
        super.setValor(49.99);
    }

    @Override
    public void assinar() {
        assinatura.assinar();
        JOptionPane.showMessageDialog(JOptionPane.getRootFrame(), "Pacote 04 Contratado R$ " + super.getValor());
    }
}
