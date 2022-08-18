/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package coelho_da_pascoa;

import coelho_da_pascoa.fabricas.ovos.Ovo;

/**
 *
 * @author Rafael de Souza Costa
 */
public class print {
        
        static void dadosOvo(Ovo ovo){
                System.out.println("Codigo: " + ovo.getCodigo());
                System.out.println("Nome: " + ovo.getNome());
                System.out.println("Carboidratos: " + ovo.getCarboidratos());
                System.out.println("Proteinas: " + ovo.getProteinas());
                System.out.println("Gorduras Totais: " + ovo.getGordurasTotais());
                System.out.println("\n - - - - - - - - - - - - - - - - ## - - - - - - - - - - - - - - - -");
        }
}
