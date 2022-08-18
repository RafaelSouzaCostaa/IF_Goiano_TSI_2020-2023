/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package associacaodefabricasautomobilisticas;

import associacaodefabricasautomobilisticas.fabricas.veiculos.Veiculo;
import associacaodefabricasautomobilisticas.interfaces.I_FabricaDeVeiculos;
import java.util.Scanner;

/**
 *
 * @author Rafael de Souza Costa
 */
public class Print {

        public static void opcoesDeVeiculos(I_FabricaDeVeiculos fabrica) {
                Scanner scanner = new Scanner(System.in);
                
                String[] veiculosAtivos = fabrica.getVeiculosAtivosNome();
                int qtdVeiculos = veiculosAtivos.length;

                for (int i = 0; i < qtdVeiculos; i++) {
                        System.out.println(i + " - " + veiculosAtivos[i]);
                }
                System.out.println((qtdVeiculos) + " - Sair");

                int veiculoEscolhido = scanner.nextInt();
                if (veiculoEscolhido < qtdVeiculos) {
                        Veiculo veiculoCriado = fabrica.criarVeiculo(veiculosAtivos[veiculoEscolhido]);
                        BancoDeDados.setVeiculo(veiculoCriado);
                        System.out.println("Veiculo Criado e Add ao Banco de Dados! \n");
                        
                        System.out.println("Especificacoes: "
                                + "\nMontadora: " + veiculoCriado.getMontadora()
                                + "\nTipo de Veiculo: " + veiculoCriado.getTipo()
                                + "\nNome: " + veiculoCriado.getNome()
                                + "\nTipo Combustivel: " + veiculoCriado.getTipoConbustivel()
                                + "\nPotencia: " + veiculoCriado.getPotencia()
                                + "\nTracao: " + veiculoCriado.getTracao()
                                + "\nCapacidade Passageiros: " + veiculoCriado.getCapAcentos() 
                                + "\nNumeracao Chassis: " + veiculoCriado.getNumeroChassis()
                                + "\n\n");
                } else {
                        System.out.println("Veiculo não criado!\n");
                }
        }
        
        public static void veiculosCriados(){
                
                BancoDeDados.getVeiculos().forEach((Veiculo veiculo) ->{
                        System.out.println("Montadora: " + veiculo.getMontadora() + " => " + veiculo.getNome());
                        return;
                });
                if(BancoDeDados.getVeiculos().isEmpty()){
                        System.err.println("Não a veiculos Cadastrados!\n");
                }else{
                        System.out.println("\n");
                }
        }
}
