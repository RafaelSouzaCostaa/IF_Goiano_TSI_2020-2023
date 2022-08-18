/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package aplicacaoadapter;

/**
 *
 * @author Rafael de Souza Costa
 */
public class A_BancoDados {
    public static String PARADOX = "Paradox";
    public static String FIREBIRD = "Firebird";
    public static String MYSQL = "MySQL";
    
    public String nomeBD;
    public boolean conectado = false;
    
    public String getNomeBD() {
        return nomeBD;
    }

    public void setNomeBD(String nomeBD) {
        this.nomeBD = nomeBD;
    }

    public boolean isConectado() {
        return conectado;
    }

    public void setConectado(boolean conectado) {
        this.conectado = conectado;
    }
}
