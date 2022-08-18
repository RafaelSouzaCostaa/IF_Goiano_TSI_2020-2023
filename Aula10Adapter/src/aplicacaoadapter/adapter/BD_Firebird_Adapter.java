/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacaoadapter.adapter;

import aplicacaoadapter.BD_Firebird;

/**
 *
 * @author Rafael de Souza Costa
 */
public class BD_Firebird_Adapter implements I_TargetBancoDeDados {

    private BD_Firebird adaptada;

    public BD_Firebird_Adapter() {
        adaptada = new BD_Firebird();
    }

    @Override
    public BD_Firebird getBancoAdaptado() {
        return adaptada;
    }
}
