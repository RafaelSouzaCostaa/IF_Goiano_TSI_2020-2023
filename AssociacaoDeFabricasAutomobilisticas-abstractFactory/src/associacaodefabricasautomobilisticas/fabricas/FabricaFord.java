/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package associacaodefabricasautomobilisticas.fabricas;

import associacaodefabricasautomobilisticas.fabricas.veiculos.Veiculo;
import associacaodefabricasautomobilisticas.fabricas.veiculos.veiculosFord.Fiesta;
import associacaodefabricasautomobilisticas.fabricas.veiculos.veiculosFord.Pampa;
import associacaodefabricasautomobilisticas.interfaces.I_FabricaFord;

/**
 *
 * @author Rafael de Souza Costa
 */
public class FabricaFord implements I_FabricaFord {

        @Override
        public Veiculo criarPampa() {
                return new Pampa();
        }

        @Override
        public Veiculo criarFiesta() {
                return new Fiesta();
        }

        @Override
        public String[] getVeiculosAtivosNome() {
                return veiculosAtivosNome;
        }

        @Override
        public Veiculo criarVeiculo(String I_Fabrica_nomeVeiculo) {
                switch (I_Fabrica_nomeVeiculo) {
                        case I_FabricaFord.NOME_PAMPA:
                                return criarPampa();
                        case I_FabricaFord.NOME_FIAT_FIESTA:
                                return criarFiesta();
                        default:
                                return null;
                }
        }
}
