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
public class Palio extends Veiculo {

        public Palio() {
                super(I_FabricaFiat.TIPO_PALIO,
                        I_FabricaFiat.NOME_PALIO,
                        I_FabricaFiat.POTENCIA_PALIO,
                        I_FabricaFiat.TRACAO_PALIO,
                        I_FabricaFiat.CAPACIDADE_ACENTOS_PALIO,
                        I_FabricaFiat.TIPO_COMBUSTIVEL_PALIO,
                        I_FabricaFiat.MONTADORA_FIAT);
        }

}
