/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package associacaodefabricasautomobilisticas.fabricas.veiculos.veiculosFord;

import associacaodefabricasautomobilisticas.fabricas.veiculos.Veiculo;
import associacaodefabricasautomobilisticas.interfaces.I_FabricaFord;

/**
 *
 * @author Rafael de Souza Costa
 */
public class Fiesta extends Veiculo{

        public Fiesta() {
                super(I_FabricaFord.TIPO_FIAT_FIESTA, 
                        I_FabricaFord.NOME_FIAT_FIESTA, 
                        I_FabricaFord.POTENCIA_FIAT_FIESTA, 
                        I_FabricaFord.TRACAO_FIAT_FIESTA, 
                        I_FabricaFord.CAPACIDADE_ACENTOS_FIAT_FIESTA, 
                        I_FabricaFord.TIPO_COMBUSTIVEL_FIAT_FIESTA, 
                        I_FabricaFord.MONTADORA_FORD);
        }
}
