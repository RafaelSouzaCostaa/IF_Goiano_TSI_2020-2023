/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package fabricacaodecelulares;

import fabricacaodecelulares.celulares.Celular;
import java.util.ArrayList;

/**
 *
 * @author Rafael de Souza Costa
 */
public class BancoDeDados {
        private static ArrayList<Celular> celulares = new ArrayList<>();
        
        public static ArrayList<Celular> getCelularesCriado(){
                return celulares;
        }
        
        public static void setCelularBD(Celular celular){
                celulares.add(celular);
        }
        
        public static int getSize(){
                return celulares.size();
        }
}
