/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package chainofresponsability;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafael de Souza Costa
 */
public class ValidarPossuiNumero extends Validar{
    @Override
    public void processarRequisicao(Usuario user) {

        Pattern pattern = Pattern.compile("[0-9]{1,}");
        Matcher matcher = pattern.matcher(user.getPassword());

        if (matcher.find()) {
            setSucessor(new ValidarPossuiNumeroSequencial());
            sucessor.processarRequisicao(user);
        } else {
            JOptionPane.showMessageDialog(JOptionPane.getRootFrame(), "A senha deve possuir no minimo 1 numero");
        }
    }
}
