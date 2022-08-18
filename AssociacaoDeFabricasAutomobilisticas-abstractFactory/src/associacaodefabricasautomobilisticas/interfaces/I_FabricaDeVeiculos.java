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
public interface I_FabricaDeVeiculos {
               
        public String[] getVeiculosAtivosNome();
        
        public Veiculo criarVeiculo(String I_Fabrica_nomeVeiculo);
}
