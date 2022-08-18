/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PadraoProxy;

/**
 *
 * @author Rafael de Souza Costa
 */
public class RealLogin implements I_Login {

    private String login;
    private String password;

    public RealLogin(String login, String password) {
        this.login = login;
        this.password = password;
    }

    @Override
    public void logar() {
        //code
        System.out.println("Logado com sucesso pelo realLogin: " + login);
    }
}
