/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package camisas_esportivas_de_times_factory_method;

import camisas_esportivas_de_times_factory_method.camisas.Camiseta;
import camisas_esportivas_de_times_factory_method.factory.ConcretFactoryDeCamisetas;
import camisas_esportivas_de_times_factory_method.factory.I_FabricasDeCamisetas;
import java.util.Scanner;

/**
 *
 * @author Rafael de Souza Costa
 */
public class Camisas_Esportivas_de_Times_Factory_Method {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        I_FabricasDeCamisetas fabrica = new ConcretFactoryDeCamisetas();
        Scanner scan = new Scanner(System.in);

        System.out.println("Times disponiveis: Brasil, Flamengo, Botafogo, Fluminense, Vasco"
                + "\nCom as seguintes fabricantes: Nike, Adidas, Puma, Umbro, Kappa\n\n\n");
        int indexMenuPrincipal = 0;
        while (indexMenuPrincipal != 4) {

            System.out.println("Menu Principal:"
                    + "\n1 - Criar Camiseta"
                    + "\n2 - Ver Camisetas Criadas"
                    + "\n3 - Deletar Camiseta"
                    + "\n4 - Sair\n\n");

            indexMenuPrincipal = scan.nextInt();
            scan = new Scanner(System.in);
            switch (indexMenuPrincipal) {
                case 1:
                    System.out.println("Digite o tamanho da camiseta (PP, P, M, G, GG): ");
                    String tamanhoCamisa = scan.nextLine();

                    System.out.println("\nDigite o nome do time ou da fabrica: ");
                    String camisetaCreat = scan.nextLine();

                    Camiseta camiseta = fabrica.getCamiseta(camisetaCreat, tamanhoCamisa);

                    if (camiseta == null) {
                        System.out.println("\nCamiseta não localizada! Verifique os dados inseridos!\n");
                    } else {
                        Banco_de_Dados.setCamisetas(camiseta);
                        System.out.println("\nCamiseta Criada e Salva no Banco de Dados!!!\n\n");
                    }
                    break;
                case 2:
                    Banco_de_Dados.getCamisetas().forEach((Camiseta camisa) -> {
                        System.out.println("\nFabricante: " + camisa.getFabricante() + "\nTime: " + camisa.getTime() + "\nTamanho: " + camisa.getTamanho() + "\n\n");
                    });
                    break;
                case 3:
                    int tamanhoBanco = Banco_de_Dados.getCamisetas().size();

                    if (tamanhoBanco != 0) {
                        for (int i = 0; i < tamanhoBanco; i++) {
                            Camiseta camisa = Banco_de_Dados.getCamiseta(i);
                            System.out.println("\n- - - - - - # " + i + " # - - - - - -" + "\n\nFabricante: " + camisa.getFabricante() + "\nTime: " + camisa.getTime() + "\nTamanho: " + camisa.getTamanho() + "\n\n");
                        }
                        System.out.println("\nDigite o index correspondente(#?#):\n");
                        scan = new Scanner(System.in);

                        int indexDeletar = scan.nextInt();
                        if (indexDeletar <= tamanhoBanco) {
                            Banco_de_Dados.deleteCamiseta(indexDeletar);
                            System.out.println("\nCamiseta deletada com sucesso!\n");

                        } else {
                            break;
                        }
                    } else {
                        System.out.println("\nCamisetas não localizadas!\n");
                    }
                    break;

            }
        }
    }
}
