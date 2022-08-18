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
public interface I_FabricaFord extends I_FabricaDeVeiculos{
          String veiculosAtivosNome[] = {
                  I_FabricaFord.NOME_PAMPA,
                  I_FabricaFord.NOME_FIAT_FIESTA
        };

        String MONTADORA_FORD = "Ford";

        String TIPO_PAMPA = "Veiculo Utilitario";
        String NOME_PAMPA = "Pampa1.6 8V";
        String POTENCIA_PAMPA = "104 cv";
        String TRACAO_PAMPA = "Dianteria";
        int CAPACIDADE_ACENTOS_PAMPA = 2;
        String TIPO_COMBUSTIVEL_PAMPA = "Gasolina";

        String TIPO_FIAT_FIESTA = "Veiculo de passeio";
        String NOME_FIAT_FIESTA = "Fiesta 1.6";
        String POTENCIA_FIAT_FIESTA = "86 cv";
        String TRACAO_FIAT_FIESTA = "Dianteria";
        int CAPACIDADE_ACENTOS_FIAT_FIESTA = 5;
        String TIPO_COMBUSTIVEL_FIAT_FIESTA = "Gasolina";

        public Veiculo criarPampa();
        public Veiculo criarFiesta();
}
