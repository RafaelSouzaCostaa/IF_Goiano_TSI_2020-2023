/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package associacaodefabricasautomobilisticas.fabricas.veiculos.veiculosVolkswagen;

import associacaodefabricasautomobilisticas.interfaces.I_FabricaVolkswagen;
import associacaodefabricasautomobilisticas.fabricas.veiculos.Veiculo;

/**
 *
 * @author Rafael de Souza Costa
 */
public class GolG4 extends Veiculo{

        public GolG4() {
                super(I_FabricaVolkswagen.TIPO_GOLG4,
                        I_FabricaVolkswagen.NOME_GOLG4, 
                        I_FabricaVolkswagen.POTENCIA_GOLG4,
                        I_FabricaVolkswagen.TRACAO_GOLG4,
                        I_FabricaVolkswagen.CAPACIDADE_ACENTOS_GOLG4,
                        I_FabricaVolkswagen.TIPO_COMBUSTIVEL_GOLG4,
                        I_FabricaVolkswagen.MONTADORA_VOLKSWAGEN);
        }

}
