/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package fabricacaodecelulares.celulares;

import java.util.Objects;
import java.util.Random;

/**
 *
 * @author Rafael de Souza Costa
 */
public abstract class Celular {
        private Random numberAleatorio = new Random();
        private String nome;
        private String memoriaRAM;
        private String memoriaInterna;
        private String marca;
        private String codigoMAC;

        public Celular(String nome, String memoriaRAM, String memoriaInterna, String marca) {
                this.nome = nome;
                this.memoriaRAM = memoriaRAM;
                this.memoriaInterna = memoriaInterna;
                this.marca = marca;
                this.codigoMAC = "C - "+String.valueOf((numberAleatorio.nextInt() * 100000)+1);
        }

        public String getNome() {
                return nome;
        }

        public void setNome(String nome) {
                this.nome = nome;
        }

        public String getMemoriaRAM() {
                return memoriaRAM;
        }

        public void setMemoriaRAM(String memoriaRAM) {
                this.memoriaRAM = memoriaRAM;
        }

        public String getMemoriaInterna() {
                return memoriaInterna;
        }

        public void setMemoriaInterna(String memoriaInterna) {
                this.memoriaInterna = memoriaInterna;
        }

        public String getMarca() {
                return marca;
        }

        public void setMarca(String marca) {
                this.marca = marca;
        }

        public String getCodigoMAC() {
                return codigoMAC;
        }

        public void setCodigoMAC(String codigoMAC) {
                this.codigoMAC = codigoMAC;
        }

        @Override
        public int hashCode() {
                int hash = 7;
                hash = 89 * hash + Objects.hashCode(this.nome);
                hash = 89 * hash + Objects.hashCode(this.memoriaRAM);
                hash = 89 * hash + Objects.hashCode(this.memoriaInterna);
                hash = 89 * hash + Objects.hashCode(this.marca);
                hash = 89 * hash + Objects.hashCode(this.codigoMAC);
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
                final Celular other = (Celular) obj;
                if (!Objects.equals(this.nome, other.nome)) {
                        return false;
                }
                if (!Objects.equals(this.memoriaRAM, other.memoriaRAM)) {
                        return false;
                }
                if (!Objects.equals(this.memoriaInterna, other.memoriaInterna)) {
                        return false;
                }
                if (!Objects.equals(this.marca, other.marca)) {
                        return false;
                }
                if (!Objects.equals(this.codigoMAC, other.codigoMAC)) {
                        return false;
                }
                return true;
        }

        @Override
        public String toString() {
                return "Celular{" + "nome=" + nome + ", memoriaRAM=" + memoriaRAM + ", memoriaInterna=" + memoriaInterna + ", marca=" + marca + ", codigoMAC=" + codigoMAC + '}';
        }        
}
