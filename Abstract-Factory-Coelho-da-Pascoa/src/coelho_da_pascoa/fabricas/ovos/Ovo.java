/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package coelho_da_pascoa.fabricas.ovos;

import java.util.Objects;

/**
 *
 * @author Rafael de Souza Costa
 */
public abstract class Ovo {
        private String nome;
        private String carboidratos;
        private String proteinas;
        private String gordurasTotais;
        private String codigo;

        public Ovo(String nome, String carboidratos, String proteinas, String gordurasTotais, String codigo) {
                this.nome = nome;
                this.carboidratos = carboidratos;
                this.proteinas = proteinas;
                this.gordurasTotais = gordurasTotais;
                this.codigo = codigo;
        }

        public String getNome() {
                return nome;
        }

        public void setNome(String nome) {
                this.nome = nome;
        }

        public String getCarboidratos() {
                return carboidratos;
        }

        public void setCarboidratos(String carboidratos) {
                this.carboidratos = carboidratos;
        }

        public String getProteinas() {
                return proteinas;
        }

        public void setProteínas(String proteinas) {
                this.proteinas = proteinas;
        }

        public String getGordurasTotais() {
                return gordurasTotais;
        }

        public void setGordurasTotais(String gordurasTotais) {
                this.gordurasTotais = gordurasTotais;
        }

        public String getCodigo() {
                return codigo;
        }

        public void setCodigo(String codigo) {
                this.codigo = codigo;
        }

        @Override
        public String toString() {
                return "Ovo{" + "nome=" + nome + ", carboidratos=" + carboidratos + ", proteinas=" + proteinas + ", gordurasTotais=" + gordurasTotais + ", codigo=" + codigo + '}';
        }

        @Override
        public int hashCode() {
                int hash = 7;
                hash = 37 * hash + Objects.hashCode(this.nome);
                hash = 37 * hash + Objects.hashCode(this.carboidratos);
                hash = 37 * hash + Objects.hashCode(this.proteinas);
                hash = 37 * hash + Objects.hashCode(this.gordurasTotais);
                hash = 37 * hash + Objects.hashCode(this.codigo);
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
                final Ovo other = (Ovo) obj;
                if (!Objects.equals(this.nome, other.nome)) {
                        return false;
                }
                if (!Objects.equals(this.carboidratos, other.carboidratos)) {
                        return false;
                }
                if (!Objects.equals(this.proteinas, other.proteinas)) {
                        return false;
                }
                if (!Objects.equals(this.gordurasTotais, other.gordurasTotais)) {
                        return false;
                }
                if (!Objects.equals(this.codigo, other.codigo)) {
                        return false;
                }
                return true;
        }
}
