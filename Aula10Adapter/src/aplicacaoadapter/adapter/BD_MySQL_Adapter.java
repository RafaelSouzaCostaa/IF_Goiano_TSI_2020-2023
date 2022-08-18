/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package aplicacaoadapter.adapter;

import aplicacaoadapter.BD_MySQL;

/**
 *
 * @author Rafael de Souza Costa
 */
public class BD_MySQL_Adapter implements I_TargetBancoDeDados{

    private BD_MySQL adaptada;

    public BD_MySQL_Adapter() {
        adaptada = new BD_MySQL();
    }
    
    @Override
    public BD_MySQL getBancoAdaptado() {
        return this.adaptada;
    }
}
