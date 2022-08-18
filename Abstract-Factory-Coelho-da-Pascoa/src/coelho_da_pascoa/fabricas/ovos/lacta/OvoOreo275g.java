/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package coelho_da_pascoa.fabricas.ovos.lacta;

import coelho_da_pascoa.fabricas.ovos.Ovo;
import interfaces.I_Fabrica_Lacta;

/**
 *
 * @author Rafael de Souza Costa
 */
public class OvoOreo275g extends Ovo{

        public OvoOreo275g() {
                super(I_Fabrica_Lacta.NOME_OREO275G, 
                        I_Fabrica_Lacta.CARBOIDRATOS_OREO275G, 
                        I_Fabrica_Lacta.PROTEINAS_OREO275G, 
                        I_Fabrica_Lacta.GOLDURAS_TOTAIS_OREO275G, 
                        I_Fabrica_Lacta.COD_OVO_OREO275G);
        }

}
