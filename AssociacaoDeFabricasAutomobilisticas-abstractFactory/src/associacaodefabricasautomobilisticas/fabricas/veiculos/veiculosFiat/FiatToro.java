/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package associacaodefabricasautomobilisticas.fabricas.veiculos.veiculosFiat;

import associacaodefabricasautomobilisticas.interfaces.I_FabricaFiat;
import associacaodefabricasautomobilisticas.fabricas.veiculos.Veiculo;

/**
 *
 * @author Rafael de Souza Costa
 */
public class FiatToro extends Veiculo {

        public FiatToro() {
               super(I_FabricaFiat.TIPO_FIAT_TORO_FREEDOM,
                        I_FabricaFiat.NOME_FIAT_TORO_FREEDOM,
                        I_FabricaFiat.POTENCIA_FIAT_TORO_FREEDOM,
                        I_FabricaFiat.TRACAO_FIAT_TORO_FREEDOM,
                        I_FabricaFiat.CAPACIDADE_ACENTOS_FIAT_TORO_FREEDOM,
                        I_FabricaFiat.TIPO_COMBUSTIVEL_FIAT_TORO_FREEDOM,
                        I_FabricaFiat.MONTADORA_FIAT);
        }

}
