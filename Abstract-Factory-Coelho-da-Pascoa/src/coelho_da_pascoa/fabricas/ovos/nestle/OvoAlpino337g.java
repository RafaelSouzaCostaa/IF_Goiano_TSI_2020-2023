/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package coelho_da_pascoa.fabricas.ovos.nestle;

import  coelho_da_pascoa.fabricas.ovos.Ovo;
import interfaces.I_Fabrica_Nestle;
/**
 *
 * @author Rafael de Souza Costa
 */
public class OvoAlpino337g extends Ovo{
        
        public OvoAlpino337g() {
                super(I_Fabrica_Nestle.NOME_ALPINO337G, 
                        I_Fabrica_Nestle.CARBOIDRATOS_ALPINO337G, 
                        I_Fabrica_Nestle.PROTEINAS_ALPINO337G, 
                        I_Fabrica_Nestle.GOLDURAS_TOTAIS_ALPINO337G, 
                        I_Fabrica_Nestle.COD_OVO_ALPINO337G);
        }
}
