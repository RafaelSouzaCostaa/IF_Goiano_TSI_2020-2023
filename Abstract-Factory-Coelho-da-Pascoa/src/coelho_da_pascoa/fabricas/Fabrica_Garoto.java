/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package coelho_da_pascoa.fabricas;

import coelho_da_pascoa.fabricas.ovos.Ovo;
import coelho_da_pascoa.fabricas.ovos.garoto.OvoBatomAoLeite172g;
import coelho_da_pascoa.fabricas.ovos.garoto.OvoCrocante215g;
import coelho_da_pascoa.fabricas.ovos.garoto.OvoTalento350g;
import interfaces.I_Fabrica_Garoto;

/**
 *
 * @author Rafael de Souza Costa
 */
public class Fabrica_Garoto extends Fabrica implements I_Fabrica_Garoto{

        @Override
        public OvoBatomAoLeite172g criarOvoBatomAoLeite172g() {
                return new OvoBatomAoLeite172g();
        }

        @Override
        public OvoCrocante215g criarOvoCrocante215g() {
                return new OvoCrocante215g();
        }

        @Override
        public OvoTalento350g criarOvoTalento350g() {
                return new OvoTalento350g();
        }
        
        @Override
        public Ovo criarOvo(String codigo) {
                switch(codigo){
                        case I_Fabrica_Garoto.COD_OVO_BATON_AO_LEITE172G:
                                return criarOvoBatomAoLeite172g();
                        case I_Fabrica_Garoto.COD_OVO_CROCANTE215G:
                                return criarOvoCrocante215g();
                        case I_Fabrica_Garoto.COD_OVO_TALENTO350G:
                                return criarOvoTalento350g();
                        default:
                                return null;
                }
        }

}
