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
public class Corsa extends Veiculo {

        public Corsa() {
                super(I_FabricaChevrolet.TIPO_CORSA,
                        I_FabricaChevrolet.NOME_CORSA,
                        I_FabricaChevrolet.POTENCIA_CORSA,
                        I_FabricaChevrolet.TRACAO_CORSA,
                        I_FabricaChevrolet.CAPACIDADE_ACENTOS_CORSA,
                        I_FabricaChevrolet.TIPO_COMBUSTIVEL_CORSA,
                        I_FabricaChevrolet.MONTADORA_CHEVROLET);
        }

}
