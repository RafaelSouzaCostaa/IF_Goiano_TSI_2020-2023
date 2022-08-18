/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package padraocomposite.itens;

import java.util.Objects;
import padraocomposite.Componente;

/**
 *
 * @author Rafael de Souza Costa
 */
public class Quadrinho implements Componente{
    
    private String nome ="Quadrinho";
    private double valor = 15.00;

    @Override
    public void print() {
        System.out.println(nome + " R$ " + valor);
    }
    
    @Override
    public double getPrice() {
        return valor;
    }

    public String getNome() {
        return nome;
    }
    
    @Override
    public String getDados() {
        return (nome + " R$ " + valor);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.nome);
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.valor) ^ (Double.doubleToLongBits(this.valor) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Quadrinho other = (Quadrinho) obj;
        if (Double.doubleToLongBits(this.valor) != Double.doubleToLongBits(other.valor)) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Quadrinho{" + "nome=" + nome + ", valor=" + valor + '}';
    }
    
    
}
