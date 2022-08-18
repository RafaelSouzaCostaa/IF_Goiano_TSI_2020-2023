/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package pp_factory_method;

/**
 *
 * @author Rafael de Souza Costa
 */
public class ConcretFactoryPessoa implements I_FactoryPessoa{

        @Override
        public Pessoa getPessoa(String nome, String sexo) {
                if(sexo.equals("f") || sexo.equals("F")){
                        return new Mulher(nome);
                }else if(sexo.equals("m") || sexo.equals("M")){
                        return new Homem(nome);
                }
                return null;
        }
}
