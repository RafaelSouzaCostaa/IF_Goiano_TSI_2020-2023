/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package padraocomposite;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;
import padraocomposite.itens.Adesivo;
import padraocomposite.itens.Busto;
import padraocomposite.itens.Camiseta;
import padraocomposite.itens.Caneta;
import padraocomposite.itens.Chaveiro;
import padraocomposite.itens.Miniatura;
import padraocomposite.itens.Poster;
import padraocomposite.itens.Quadrinho;

/**
 *
 * @author Rafael de Souza Costa
 */
public class CompositeCaixa implements Componente {

    Object objs[] = {
        new Adesivo(),
        new Busto(),
        new Camiseta(),
        new Caneta(),
        new Chaveiro(),
        new Miniatura(),
        new Poster(),
        new Quadrinho()
    };

    private ArrayList<Componente> childCaixas = new ArrayList<Componente>();
    private double valorTotal = 0;

    public void print() {
        String msg = "";
        
        for(int i = 0; i < childCaixas.size(); i++){
            msg += childCaixas.get(i).getDados() + "\n";
        }    
        JOptionPane.showMessageDialog(JOptionPane.getRootFrame(), msg + "\n\nQtd: " + childCaixas.size() + " Valor: " + this.getPrice());
    }

    @Override
    public double getPrice() {
        valorTotal = 0;

        for (Componente caixa : childCaixas) {
            caixa.print();
            valorTotal += caixa.getPrice();
        }

        return valorTotal;
    }

    public void prepararItens(int typeCliente) {
        Random gerar = new Random();
        for (int i = 0; i < typeCliente; i++) {
            Componente aux = (Componente) objs[gerar.nextInt(objs.length)];
            this.add(aux);
        }
    }

    public void add(Componente componente) {
        childCaixas.add(componente);
    }

    public void remove(Componente componente) {
        childCaixas.remove(componente);
    }

    @Override
    public String getDados() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
