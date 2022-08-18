/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacao_singleton;

/**
 *
 * @author Rafael de Souza Costa
 */
public class Login_Singleton {

    private static Login_Singleton instance;
    private static boolean logado;
    private static Usuario usuario;

    private Login_Singleton() {
    }

    public static synchronized Login_Singleton getInstance() {
        if (instance == null) {
            instance = new Login_Singleton();
        }
        return instance;
    }

    public static boolean isLogado() {
        return logado;
    }

    public static boolean Logar(String login, String senha, Usuario user) {
        if (user.getLogin().equals(login) && user.getPassword().equals(senha)) {

            if (instance != null) {
                AutenticarLogin(user);
            }
            return true;
        }
        return false;
    }

    public static void AutenticarLogin(Usuario user) {
        logado = true;
        usuario = user;
    }

}
