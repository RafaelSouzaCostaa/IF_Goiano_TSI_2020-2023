/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package coelho_da_pascoa.fabricas.ovos.garoto;

import coelho_da_pascoa.fabricas.ovos.Ovo;
import interfaces.I_Fabrica_Garoto;

/**
 *
 * @author Rafael de Souza Costa
 */
public class OvoBatomAoLeite172g extends Ovo{

        public OvoBatomAoLeite172g() {
                super(I_Fabrica_Garoto.NOME_BATON_AO_LEITE172G, 
                        I_Fabrica_Garoto.CARBOIDRATOS_BATON_AO_LEITE172G, 
                        I_Fabrica_Garoto.PROTEINAS_BATON_AO_LEITE172G, 
                        I_Fabrica_Garoto.GOLDURAS_TOTAIS_BATON_AO_LEITE172G, 
                        I_Fabrica_Garoto.COD_OVO_BATON_AO_LEITE172G);
        }

}
