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
public class Strada extends Veiculo {

        public Strada() {
                super(I_FabricaFiat.TIPO_FIAT_STRADA_WORKING,
                        I_FabricaFiat.NOME_FIAT_STRADA_WORKING,
                        I_FabricaFiat.POTENCIA_FIAT_STRADA_WORKING,
                        I_FabricaFiat.TRACAO_FIAT_STRADA_WORKING,
                        I_FabricaFiat.CAPACIDADE_ACENTOS_FIAT_STRADA_WORKING,
                        I_FabricaFiat.TIPO_COMBUSTIVEL_FIAT_STRADA_WORKING,
                        I_FabricaFiat.MONTADORA_FIAT);
        }
}
