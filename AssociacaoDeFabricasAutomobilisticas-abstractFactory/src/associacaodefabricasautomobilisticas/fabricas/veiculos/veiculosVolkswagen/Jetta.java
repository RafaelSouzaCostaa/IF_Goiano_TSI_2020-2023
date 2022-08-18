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
public class Jetta extends Veiculo {

        public Jetta() {
                super(I_FabricaVolkswagen.TIPO_JETTA_GLI,
                        I_FabricaVolkswagen.NOME_JETTA_GLI,
                        I_FabricaVolkswagen.POTENCIA_JETTA_GLI,
                        I_FabricaVolkswagen.TRACAO_JETTA_GLI,
                        I_FabricaVolkswagen.CAPACIDADE_ACENTOS_JETTA_GLI,
                        I_FabricaVolkswagen.TIPO_COMBUSTIVEL_JETTA_GLI,
                        I_FabricaVolkswagen.MONTADORA_VOLKSWAGEN);
        }
}
