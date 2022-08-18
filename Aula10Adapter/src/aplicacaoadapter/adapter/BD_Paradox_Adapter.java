/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacaoadapter.adapter;

import aplicacaoadapter.BD_Paradox;

/**
 *
 * @author Rafael de Souza Costa
 */
public class BD_Paradox_Adapter implements I_TargetBancoDeDados{
    private BD_Paradox adaptada;

    public BD_Paradox_Adapter() {
        adaptada = new BD_Paradox();
    }
    
    @Override
    public BD_Paradox getBancoAdaptado() {
        return adaptada;
    }
}
