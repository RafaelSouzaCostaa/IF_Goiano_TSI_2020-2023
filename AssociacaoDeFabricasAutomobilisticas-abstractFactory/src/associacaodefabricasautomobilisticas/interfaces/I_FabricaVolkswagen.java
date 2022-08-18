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
public interface I_FabricaVolkswagen extends I_FabricaDeVeiculos {
        
         String veiculosAtivosNome[] = {
                I_FabricaVolkswagen.NOME_GOLG4,
                I_FabricaVolkswagen.NOME_JETTA_GLI,
                I_FabricaVolkswagen.NOME_SAVEIRO
        };
        
        String MONTADORA_VOLKSWAGEN = "Volkswagen";

        String TIPO_GOLG4 = "Veiculo de Passeio";
        String NOME_GOLG4 = "Gol G4 1.0";
        String POTENCIA_GOLG4 = "Alcool 76 cv | Gasolina 72";
        String TRACAO_GOLG4 = "Dianteria";
        int CAPACIDADE_ACENTOS_GOLG4 = 5;
        String TIPO_COMBUSTIVEL_GOLG4 = "Flex";

        String TIPO_JETTA_GLI = "Veiculo de Passeio";
        String NOME_JETTA_GLI = "Jetta GLI 2.0T";
        String POTENCIA_JETTA_GLI = "230 cv";
        String TRACAO_JETTA_GLI = "Dianteria";
        int CAPACIDADE_ACENTOS_JETTA_GLI = 5;
        String TIPO_COMBUSTIVEL_JETTA_GLI = "Gasolina";

        String TIPO_SAVEIRO = "UItilitário Leve";
        String NOME_SAVEIRO = "Saveiro 1.6 MI";
        String POTENCIA_SAVEIRO = "Alcool 104 cv | Gasolina 101 cv";
        String TRACAO_SAVEIRO = "Dianteria";
        int CAPACIDADE_ACENTOS_SAVEIRO = 2;
        String TIPO_COMBUSTIVEL_SAVEIRO = "Flex";

        public Veiculo criarGolG4();

        public Veiculo criarJettaGLI();

        public Veiculo criarSaveiro();
}
