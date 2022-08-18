/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PadraoProxy;

/**
 *
 * @author Rafael de Souza Costa
 */
public class PadraoProxy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        I_Login login = new ProxyLogar("Rafael", "123");
        
        login.logar();

    }
}
