/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package associacaodefabricasautomobilisticas.fabricas.veiculos;

import java.util.Objects;
import java.util.Random;

/**
 *
 * @author Rafael de Souza Costa
 */
public abstract class Veiculo {
        private String tipo;
        private String nome;
        private String potencia;
        private String tracao;
        private int capAcentos;
        private String tipoConbustivel;
        private String montadora;
        private long numeroChassis =  new Random().nextLong();

        public Veiculo(String tipo, String nome, String potencia, String tracao, int capAcentos, String tipoConbustivel, String montadora) {
                this.tipo = tipo;
                this.nome = nome;
                this.potencia = potencia;
                this.tracao = tracao;
                this.capAcentos = capAcentos;
                this.tipoConbustivel = tipoConbustivel;
                this.montadora = montadora;
        }

        public String getTipo() {
                return tipo;
        }

        public void setTipo(String tipo) {
                this.tipo = tipo;
        }

        public String getNome() {
                return nome;
        }

        public void setNome(String nome) {
                this.nome = nome;
        }

        public String getPotencia() {
                return potencia;
        }

        public void setPotencia(String potencia) {
                this.potencia = potencia;
        }

        public String getTracao() {
                return tracao;
        }

        public void setTracao(String tracao) {
                this.tracao = tracao;
        }

        public int getCapAcentos() {
                return capAcentos;
        }

        public void setCapAcentos(int capAcentos) {
                this.capAcentos = capAcentos;
        }

        public String getTipoConbustivel() {
                return tipoConbustivel;
        }

        public void setTipoConbustivel(String tipoConbustivel) {
                this.tipoConbustivel = tipoConbustivel;
        }

        public String getMontadora() {
                return montadora;
        }

        public void setMontadora(String montadora) {
                this.montadora = montadora;
        }

        public long getNumeroChassis() {
                return numeroChassis;
        }

        @Override
        public int hashCode() {
                int hash = 5;
                hash = 41 * hash + Objects.hashCode(this.tipo);
                hash = 41 * hash + Objects.hashCode(this.nome);
                hash = 41 * hash + Objects.hashCode(this.potencia);
                hash = 41 * hash + Objects.hashCode(this.tracao);
                hash = 41 * hash + this.capAcentos;
                hash = 41 * hash + Objects.hashCode(this.tipoConbustivel);
                hash = 41 * hash + Objects.hashCode(this.montadora);
                hash = 41 * hash + (int) (this.numeroChassis ^ (this.numeroChassis >>> 32));
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
                final Veiculo other = (Veiculo) obj;
                if (this.capAcentos != other.capAcentos) {
                        return false;
                }
                if (this.numeroChassis != other.numeroChassis) {
                        return false;
                }
                if (!Objects.equals(this.tipo, other.tipo)) {
                        return false;
                }
                if (!Objects.equals(this.nome, other.nome)) {
                        return false;
                }
                if (!Objects.equals(this.potencia, other.potencia)) {
                        return false;
                }
                if (!Objects.equals(this.tracao, other.tracao)) {
                        return false;
                }
                if (!Objects.equals(this.tipoConbustivel, other.tipoConbustivel)) {
                        return false;
                }
                if (!Objects.equals(this.montadora, other.montadora)) {
                        return false;
                }
                return true;
        }

        @Override
        public String toString() {
                return "Veiculo{" + "tipo=" + tipo + ", nome=" + nome + ", potencia=" + potencia + ", tracao=" + tracao + ", capAcentos=" + capAcentos + ", tipoConbustivel=" + tipoConbustivel + ", montadora=" + montadora + ", numeroChassis=" + numeroChassis + '}';
        }

      
        
}
