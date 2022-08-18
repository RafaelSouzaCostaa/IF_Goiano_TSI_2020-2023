/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package associacaodefabricasautomobilisticas;

import associacaodefabricasautomobilisticas.fabricas.veiculos.Veiculo;
import java.util.ArrayList;

/**
 *
 * @author Rafael de Souza Costa
 */
public class BancoDeDados {
        private static ArrayList<Veiculo> veiculos = new ArrayList<>();
        
        static void setVeiculo(Veiculo veiculo){
                veiculos.add(veiculo);
        }
        
        static Veiculo getVeiculo(int index){
                return veiculos.get(index);
        }
        
        static ArrayList<Veiculo> getVeiculos(){
                return veiculos;
        }

        static ArrayList<Veiculo> getVeiculo(String nome){
                ArrayList<Veiculo> filtroVeiculos = new ArrayList<>();
                
                veiculos.forEach((Veiculo veiculo) -> {
                        if(veiculo.getNome() == nome){
                                filtroVeiculos.add(veiculo);
                        }
                });
                if(filtroVeiculos.isEmpty()){
                        return null;
                }
                return filtroVeiculos;
        }
}
