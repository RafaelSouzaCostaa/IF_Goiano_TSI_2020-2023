/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package associacaodefabricasautomobilisticas;

import associacaodefabricasautomobilisticas.fabricas.FabricaChevrolet;
import associacaodefabricasautomobilisticas.fabricas.FabricaFiat;
import associacaodefabricasautomobilisticas.fabricas.FabricaFord;
import associacaodefabricasautomobilisticas.fabricas.FabricaVolkswagen;
import associacaodefabricasautomobilisticas.interfaces.I_FabricaDeVeiculos;

import java.util.Scanner;

/**
 *
 * @author Rafael de Souza Costa
 */
public class AssociacaoDeFabricasAutomobilisticas {

        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                
                I_FabricaDeVeiculos fabricaVolkswagen = new FabricaVolkswagen();
                I_FabricaDeVeiculos fabricaFiat = new FabricaFiat();
                I_FabricaDeVeiculos fabricaChevrolet = new FabricaChevrolet();
                I_FabricaDeVeiculos fabricaFord = new FabricaFord();

                int indexMenuPrincipal = 0;
                while (indexMenuPrincipal != 3) {
                        System.out.println("Menu Principal"
                                + "\n1 - Criar Veiculo"
                                + "\n2 - Veiculos Criado"
                                + "\n3 - Sair");
                        indexMenuPrincipal = scanner.nextInt();
                        if (indexMenuPrincipal == 1) {
                                int indexMontadora = 0;
                                System.out.println("Escolha uma Montadora"
                                        + "\n1 - Fiat "
                                        + "\n2 - Chevrolet "
                                        + "\n3 - Volkswagen"
                                        + "\n4 - Ford");
                                indexMontadora = scanner.nextInt();

                                switch (indexMontadora) {
                                        case 1:
                                                Print.opcoesDeVeiculos(fabricaFiat);
                                                break;
                                        case 2:
                                                Print.opcoesDeVeiculos(fabricaChevrolet);
                                                break;
                                        case 3:
                                                Print.opcoesDeVeiculos(fabricaVolkswagen);
                                                break;
                                        case 4:
                                                Print.opcoesDeVeiculos(fabricaFord);
                                                break;
                                        default:
                                                break;
                                }
                        }else if(indexMenuPrincipal == 2){
                                Print.veiculosCriados();
                        }
                }
        }
}
