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
public interface I_FabricaChevrolet extends I_FabricaDeVeiculos {
        
         String veiculosAtivosNome[] = {
                I_FabricaChevrolet.NOME_ASTRA_SEDAN,
                I_FabricaChevrolet.NOME_CORSA,
                I_FabricaChevrolet.NOME_SILVERADO,
        };        
             
        String MONTADORA_CHEVROLET = "Chevrolet";

        String TIPO_ASTRA_SEDAN = "Veiculo de Passeio";
        String NOME_ASTRA_SEDAN = "Astra Sedan 2.0 8V";
        String POTENCIA_ASTRA_SEDAN = "Alcool 140 cv | Gasolina 133";
        String TRACAO_ASTRA_SEDAN = "Dianteria";
        int CAPACIDADE_ACENTOS_ASTRA_SEDAN = 5;
        String TIPO_COMBUSTIVEL_ASTRA_SEDAN = "Flex";

        String TIPO_CORSA = "Veiculo de Passeio";
        String NOME_CORSA = "Corsa Classic 1.0 8V";
        String POTENCIA_CORSA = "Alcool 78 cv | Gasolina 77";
        String TRACAO_CORSA = "Dianteria";
        int CAPACIDADE_ACENTOS_CORSA = 5;
        String TIPO_COMBUSTIVEL_CORSA = "Flex";
        
        String TIPO_SILVERADO = "Picape";
        String NOME_SILVERADO = "Silverado GMC 3500 HD";
        String POTENCIA_SILVERADO = "6 Cilindros 4.8 18v Turbo 150cv";
        String TRACAO_SILVERADO = "Traseira";
        int CAPACIDADE_ACENTOS_SILVERADO = 3;
        String TIPO_COMBUSTIVEL_SILVERADO = "Diesel";
        
        public Veiculo criarAstraSedan();

        public Veiculo criarCorsa();

        public Veiculo criarSilverado();
}
