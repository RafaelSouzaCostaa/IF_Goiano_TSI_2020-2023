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
public class OvoAoLeite170g extends Ovo{

        public OvoAoLeite170g() {
                super(I_Fabrica_Lacta.NOME_AO_LAITE170g, 
                        I_Fabrica_Lacta.CARBOIDRATOS_AO_LAITE170g, 
                        I_Fabrica_Lacta.PROTEINAS_AO_LAITE170g, 
                        I_Fabrica_Lacta.GOLDURAS_TOTAIS_AO_LAITE170g, 
                        I_Fabrica_Lacta.COD_OVO_AO_LAITE170g);
        }

}
