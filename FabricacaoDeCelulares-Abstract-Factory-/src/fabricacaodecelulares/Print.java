/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fabricacaodecelulares;

import fabricacaodecelulares.celulares.Celular;
import fabricacaodecelulares.interfaces.I_FabricasCelulares;
import java.util.Scanner;

/**
 *
 * @author Rafael de Souza Costa
 */
public class Print {

        public static void opcoesCelulares(I_FabricasCelulares fabrica) {
                Scanner scan = new Scanner(System.in);
                String[] modelos = fabrica.getModelosCelularAtivo();
                int qtdModelos = modelos.length;
                
                for(int i = 0; i < qtdModelos; i++){
                        System.out.println(i + " - " + modelos[i]);
                }
                System.out.println(qtdModelos + " - Sair");
                
                int modeloEscolhido = scan.nextInt();
                if(modeloEscolhido < qtdModelos){
                        Celular celular = fabrica.criarCelular(modelos[modeloEscolhido]);
                        System.out.println("\nCelular criado com sucesso!\n");
                        BancoDeDados.setCelularBD(celular);
                        return;
                }else{
                        System.out.println("\nCelular não Criado!\n");
                }
        }
        
        public static void printCelularesCriado(){
                BancoDeDados.getCelularesCriado().forEach((Celular celular) -> {
                        System.out.println("\nMarca: "+ celular.getMarca());
                        System.out.println("\nNome: " + celular.getNome());
                        System.out.println("\nMemoria Interna: " + celular.getMemoriaInterna());
                        System.out.println("\nMemoria RAM: " + celular.getMemoriaRAM());
                        System.out.println("\nCodigo MAC: " + celular.getCodigoMAC());
                });
                
               if(BancoDeDados.getSize() == 0){
                       System.out.println("\nNão a celulares cadastrados!\n");
               }
        }
}
