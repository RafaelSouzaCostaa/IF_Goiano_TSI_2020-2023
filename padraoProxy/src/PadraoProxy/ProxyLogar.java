/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PadraoProxy;

/**
 *
 * @author Rafael de Souza Costa
 */
public class ProxyLogar implements I_Login {

    private RealLogin realLogin;
    private String login;
    private String password;

    public ProxyLogar(String login, String password) {
        this.login =  login;
        this.password = password;
    }
    
    public void carregarLogin(){
        if (realLogin == null) {
            realLogin = new RealLogin(this.login, this.password);
        }
       realLogin.logar();
    }
    
    @Override
    public void logar() {
       String login = "Rafael";
       String password = "123";
       
       if(this.login.equals(login) && this.password.equals(password)){
           System.out.println("Usuario permitido pelo proxy");
           this.carregarLogin();
       }else{
           System.out.println("Usuario não permitido pelo proxy");
       }
    }
}
