/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package associacaodefabricasautomobilisticas.interfaces;

import associacaodefabricasautomobilisticas.fabricas.veiculos.Veiculo;

/**
 *
 * @author Rafael de Souza Costa
 */
public interface I_FabricaFiat extends I_FabricaDeVeiculos {
        
         String veiculosAtivosNome[] = {
                I_FabricaFiat.NOME_PALIO,
                I_FabricaFiat.NOME_FIAT_TORO_FREEDOM,
                I_FabricaFiat.NOME_FIAT_STRADA_WORKING,
        };

        String MONTADORA_FIAT = "Fiat";

        String TIPO_PALIO = "Veiculo de Passeio";
        String NOME_PALIO = "Palio 1.0 8V 2007";
        String POTENCIA_PALIO = "Alcool 66 cv | Gasolina 65";
        String TRACAO_PALIO = "Dianteria";
        int CAPACIDADE_ACENTOS_PALIO = 5;
        String TIPO_COMBUSTIVEL_PALIO = "Flex";

        String TIPO_FIAT_STRADA_WORKING = "Picape Pequena";
        String NOME_FIAT_STRADA_WORKING = "Fiat Strada Working 1.4";
        String POTENCIA_FIAT_STRADA_WORKING = "Alcool 86 cv | Gasolina 85";
        String TRACAO_FIAT_STRADA_WORKING = "Dianteria";
        int CAPACIDADE_ACENTOS_FIAT_STRADA_WORKING = 2;
        String TIPO_COMBUSTIVEL_FIAT_STRADA_WORKING = "Flex";

        String TIPO_FIAT_TORO_FREEDOM = "Picape";
        String NOME_FIAT_TORO_FREEDOM = "Fiat Toro Freedom 1.3 turbo";
        String POTENCIA_FIAT_TORO_FREEDOM = "Alcool 185,0 cv | Gasolina 180";
        String TRACAO_FIAT_TORO_FREEDOM = "Dianteria";
        int CAPACIDADE_ACENTOS_FIAT_TORO_FREEDOM = 5;
        String TIPO_COMBUSTIVEL_FIAT_TORO_FREEDOM = "Flex";

        public Veiculo criarPalio();

        public Veiculo criarFiatStradaWorking();

        public Veiculo criarFiatToroFreedom();

}
