/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package pp_factory_method;

/**
 *
 * @author Rafael de Souza Costa
 */
public class PP_Factory_Method {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            
        I_FactoryPessoa fabrica = new ConcretFactoryPessoa();
        
        Pessoa pessoa;
        
        pessoa = fabrica.getPessoa("Rafael", "m");
        
        System.out.println("Nome: " + pessoa.nome + " Sexo: " + pessoa.sexo);
        
        pessoa = fabrica.getPessoa("Nathalia", "F");
        
        System.out.println("Nome: " + pessoa.nome + " Sexo: " + pessoa.sexo);
    }

}
