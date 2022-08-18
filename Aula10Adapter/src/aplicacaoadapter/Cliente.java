/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package aplicacaoadapter;

/**
 *
 * @author Rafael de Souza Costa
 */
public class Cliente {
    public static String GRATUITO = "User Gratuito";  
    public static String BASICO = "User Basico";
    public static String ULTIMATE = "User Ultimate";
    
    private String tipoCliente = GRATUITO;
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }
    
    public Cliente(String nome, String tipoCliente) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }    
}
