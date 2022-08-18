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
public class AstraSedan extends Veiculo {

        public AstraSedan() {
                super(I_FabricaChevrolet.TIPO_ASTRA_SEDAN,
                        I_FabricaChevrolet.NOME_ASTRA_SEDAN,
                        I_FabricaChevrolet.POTENCIA_ASTRA_SEDAN,
                        I_FabricaChevrolet.TRACAO_ASTRA_SEDAN,
                        I_FabricaChevrolet.CAPACIDADE_ACENTOS_ASTRA_SEDAN,
                        I_FabricaChevrolet.TIPO_COMBUSTIVEL_ASTRA_SEDAN,
                        I_FabricaChevrolet.MONTADORA_CHEVROLET);
        }
}
