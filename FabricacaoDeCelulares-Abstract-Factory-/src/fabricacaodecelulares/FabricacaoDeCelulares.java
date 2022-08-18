/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fabricacaodecelulares;

import fabricacaodecelulares.fabrica.FabricaApple;
import fabricacaodecelulares.fabrica.FabricaXiaomi;
import fabricacaodecelulares.interfaces.I_FabricasCelulares;
import java.util.Scanner;

/**
 *
 * @author Rafael de Souza Costa
 */
public class FabricacaoDeCelulares {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        I_FabricasCelulares apple = new FabricaApple();
        I_FabricasCelulares xiaomi = new FabricaXiaomi();

        int menuPrincipal = -1;
        while (menuPrincipal != 3) {
            System.out.println("\nMenu Principal"
                    + "\n1 - Criar Celular"
                    + "\n2 - Celulares Criado"
                    + "\n3 - Sair");
            menuPrincipal = scan.nextInt();

            if (menuPrincipal == 1) {
                int menuMarcas = -1;
                while (menuMarcas != 2) {
                    System.out.println("Escolha uma Marca"
                            + "\n1 - Apple"
                            + "\n2 - Xiaomi");

                    menuMarcas = scan.nextInt();
                    switch (menuMarcas) {
                        case 1:
                            Print.opcoesCelulares(apple);
                            break;
                        case 2:
                            Print.opcoesCelulares(xiaomi);
                            break;
                    }
                    break;
                }
            } else if (menuPrincipal == 2) {
                Print.printCelularesCriado();
            }
        }
    }
}
