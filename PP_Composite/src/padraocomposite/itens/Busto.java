/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package padraocomposite.itens;

import padraocomposite.Componente;



/**
 *
 * @author Rafael de Souza Costa
 */
public class Busto implements Componente {

    private String nome = "Busto";
    private double valor = 10.0;

    @Override
    public void print() {
        System.out.println(nome + " R$ " + valor);
    }
    
    @Override
    public double getPrice() {
        return valor;
    }
    
    @Override
    public String getDados() {
        return (nome + " R$ " + valor);
    }
}
