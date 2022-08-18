/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package associacaodefabricasautomobilisticas.fabricas.veiculos.veiculosChevrolet;

import associacaodefabricasautomobilisticas.interfaces.I_FabricaChevrolet;
import associacaodefabricasautomobilisticas.fabricas.veiculos.Veiculo;

/**
 *
 * @author Rafael de Souza Costa
 */
public class Silverado extends Veiculo {

        public Silverado() {
                super(I_FabricaChevrolet.TIPO_SILVERADO,
                        I_FabricaChevrolet.NOME_SILVERADO,
                        I_FabricaChevrolet.POTENCIA_SILVERADO,
                        I_FabricaChevrolet.TRACAO_SILVERADO,
                        I_FabricaChevrolet.CAPACIDADE_ACENTOS_SILVERADO,
                        I_FabricaChevrolet.TIPO_COMBUSTIVEL_SILVERADO,
                        I_FabricaChevrolet.MONTADORA_CHEVROLET);
        }

}
