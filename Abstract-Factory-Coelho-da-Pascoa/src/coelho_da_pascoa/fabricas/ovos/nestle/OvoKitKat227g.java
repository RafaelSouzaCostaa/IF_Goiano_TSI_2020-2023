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
public class OvoKitKat227g extends Ovo{

        public OvoKitKat227g() {
                super(I_Fabrica_Nestle.NOME_KITKAT227G, 
                        I_Fabrica_Nestle.CARBOIDRATOS_KITKAT227G, 
                        I_Fabrica_Nestle.PROTEINAS_KITKAT227G, 
                        I_Fabrica_Nestle.GOLDURAS_TOTAIS_KITKAT227G, 
                        I_Fabrica_Nestle.COD_OVO_KITKAT227G);
        }

}
