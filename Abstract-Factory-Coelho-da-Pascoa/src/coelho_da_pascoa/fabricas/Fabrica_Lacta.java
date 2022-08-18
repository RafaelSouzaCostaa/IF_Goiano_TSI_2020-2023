/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package coelho_da_pascoa.fabricas;

import coelho_da_pascoa.fabricas.ovos.Ovo;
import coelho_da_pascoa.fabricas.ovos.lacta.OvoSonhoDeValsa277g;
import coelho_da_pascoa.fabricas.ovos.lacta.OvoOreo275g;
import coelho_da_pascoa.fabricas.ovos.lacta.OvoAoLeite170g;
import interfaces.I_Fabrica_Lacta;

/**
 *
 * @author Rafael de Souza Costa
 */
public class Fabrica_Lacta extends Fabrica implements I_Fabrica_Lacta{

           @Override
        public OvoAoLeite170g criarOvoAoLeite170g() {
               return new OvoAoLeite170g();
        }

        @Override
        public OvoOreo275g criarOvoOreo275g() {
                return new OvoOreo275g();
        }

        @Override
        public OvoSonhoDeValsa277g criarOvoSonhoDeValsa277g() {
                return new OvoSonhoDeValsa277g();
        }

        @Override
        public Ovo criarOvo(String codigo) {
                switch(codigo){
                        case I_Fabrica_Lacta.COD_OVO_AO_LAITE170g:
                                return criarOvoAoLeite170g();
                        case I_Fabrica_Lacta.COD_OVO_OREO275G:
                                return criarOvoOreo275g();
                        case I_Fabrica_Lacta.COD_SONHO_DE_VALSA277G:
                                return criarOvoSonhoDeValsa277g();
                        default:
                                return null;
                }
        }

     

}
