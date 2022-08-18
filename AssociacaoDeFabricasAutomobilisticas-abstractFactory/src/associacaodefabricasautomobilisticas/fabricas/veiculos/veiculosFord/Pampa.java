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
public class Pampa extends Veiculo{

        public Pampa() {
                super(I_FabricaFord.TIPO_PAMPA, 
                        I_FabricaFord.NOME_PAMPA, 
                        I_FabricaFord.POTENCIA_PAMPA, 
                        I_FabricaFord.TRACAO_PAMPA, 
                        I_FabricaFord.CAPACIDADE_ACENTOS_PAMPA, 
                        I_FabricaFord.TIPO_COMBUSTIVEL_PAMPA, 
                        I_FabricaFord.MONTADORA_FORD);
        }
}
