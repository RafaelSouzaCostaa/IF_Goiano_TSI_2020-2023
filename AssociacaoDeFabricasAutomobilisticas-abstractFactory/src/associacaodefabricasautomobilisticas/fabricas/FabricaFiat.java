/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package associacaodefabricasautomobilisticas.fabricas;

import associacaodefabricasautomobilisticas.interfaces.I_FabricaFiat;
import associacaodefabricasautomobilisticas.fabricas.veiculos.Veiculo;
import associacaodefabricasautomobilisticas.fabricas.veiculos.veiculosFiat.FiatToro;
import associacaodefabricasautomobilisticas.fabricas.veiculos.veiculosFiat.Palio;
import associacaodefabricasautomobilisticas.fabricas.veiculos.veiculosFiat.Strada;

/**
 *
 * @author Rafael de Souza Costa
 */
public class FabricaFiat implements I_FabricaFiat{

        @Override
        public Veiculo criarPalio() {
                return new Palio();
        }

        @Override
        public Veiculo criarFiatStradaWorking() {
                return new Strada();
        }

        @Override
        public Veiculo criarFiatToroFreedom() {
                return new FiatToro();
        }
        
        @Override
        public Veiculo criarVeiculo(String nome) {
                switch(nome){
                        case I_FabricaFiat.NOME_PALIO:
                                return criarPalio();
                        case I_FabricaFiat.NOME_FIAT_TORO_FREEDOM:
                                return criarFiatToroFreedom();
                        case I_FabricaFiat.NOME_FIAT_STRADA_WORKING:
                                return criarFiatStradaWorking();
                        default: return null;
                }
        }

         @Override
        public String[] getVeiculosAtivosNome() {
                return veiculosAtivosNome;
        }


}
