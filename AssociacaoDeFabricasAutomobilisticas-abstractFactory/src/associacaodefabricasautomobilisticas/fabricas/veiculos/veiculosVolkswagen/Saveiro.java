/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package associacaodefabricasautomobilisticas.fabricas.veiculos.veiculosVolkswagen;

import associacaodefabricasautomobilisticas.interfaces.I_FabricaVolkswagen;
import associacaodefabricasautomobilisticas.fabricas.veiculos.Veiculo;

/**
 *
 * @author Rafael de Souza Costa
 */
public class Saveiro extends Veiculo{

        public Saveiro() {
                super(I_FabricaVolkswagen.TIPO_SAVEIRO,
                        I_FabricaVolkswagen.NOME_SAVEIRO, 
                        I_FabricaVolkswagen.POTENCIA_SAVEIRO,
                        I_FabricaVolkswagen.TRACAO_SAVEIRO,
                        I_FabricaVolkswagen.CAPACIDADE_ACENTOS_SAVEIRO,
                        I_FabricaVolkswagen.TIPO_COMBUSTIVEL_SAVEIRO,
                        I_FabricaVolkswagen.MONTADORA_VOLKSWAGEN);
        }
}
