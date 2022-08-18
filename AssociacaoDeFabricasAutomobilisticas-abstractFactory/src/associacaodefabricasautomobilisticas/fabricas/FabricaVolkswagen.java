/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package associacaodefabricasautomobilisticas.fabricas;

import associacaodefabricasautomobilisticas.interfaces.I_FabricaVolkswagen;
import associacaodefabricasautomobilisticas.fabricas.veiculos.Veiculo;
import associacaodefabricasautomobilisticas.fabricas.veiculos.veiculosVolkswagen.GolG4;
import associacaodefabricasautomobilisticas.fabricas.veiculos.veiculosVolkswagen.Jetta;
import associacaodefabricasautomobilisticas.fabricas.veiculos.veiculosVolkswagen.Saveiro;

/**
 *
 * @author Rafael de Souza Costa
 */
public class FabricaVolkswagen implements I_FabricaVolkswagen {

        @Override
        public Veiculo criarGolG4() {
                return new GolG4();
        }

        @Override
        public Veiculo criarJettaGLI() {
                return new Jetta();
        }

        @Override
        public Veiculo criarSaveiro() {
                return new Saveiro();
        }

        @Override
        public Veiculo criarVeiculo(String nome) {
                switch (nome) {
                        case I_FabricaVolkswagen.NOME_GOLG4:
                                return criarGolG4();
                        case I_FabricaVolkswagen.NOME_JETTA_GLI:
                                return criarJettaGLI();
                        case I_FabricaVolkswagen.NOME_SAVEIRO:
                                return criarSaveiro();
                        default:
                                return null;
                }
        }

         @Override
        public String[] getVeiculosAtivosNome() {
                return veiculosAtivosNome;
        }
}
