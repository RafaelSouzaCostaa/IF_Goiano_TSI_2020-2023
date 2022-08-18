/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package camisas_esportivas_de_times_factory_method.camisas;

import java.util.Objects;

/**
 *
 * @author Rafael de Souza Costa
 */
public abstract class Camiseta {

    private String fabricante;
    private String time;
    private String tamanho;

    public Camiseta(String fabricante, String time, String tamanho) {
        this.fabricante = fabricante;
        this.time = time;
        this.tamanho = tamanho.toUpperCase();
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.fabricante);
        hash = 23 * hash + Objects.hashCode(this.time);
        hash = 23 * hash + Objects.hashCode(this.tamanho);
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
        final Camiseta other = (Camiseta) obj;
        if (!Objects.equals(this.fabricante, other.fabricante)) {
            return false;
        }
        if (!Objects.equals(this.time, other.time)) {
            return false;
        }
        if (!Objects.equals(this.tamanho, other.tamanho)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Camiseta{" + "fabricante=" + fabricante + ", time=" + time + ", tamanho=" + tamanho + '}';
    }

}
