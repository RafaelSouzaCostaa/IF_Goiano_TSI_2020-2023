/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package padraocomposite;

/**
 *
 * @author Rafael de Souza Costa
 */
public class Cliente {

    public static int BRONZE = 3;
    public static int PRATA = 5;
    public static int OURO = 7;
    public static int PLATINA = 10;

    public int typeClient = BRONZE;

    public Cliente(String nome, int typeClient) {
        this.typeClient = typeClient;
    }

    public int getTypeClient() {
        return typeClient;
    }

    public void setTypeClient(int typeClient) {
        this.typeClient = typeClient;
    }

}
