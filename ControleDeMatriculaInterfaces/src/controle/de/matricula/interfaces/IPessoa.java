/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package controle.de.matricula.interfaces;

/**
 *
 * @author Rafael de Souza Costa
 */
public interface IPessoa{
        
    public String getNome();

    public void setNome(String nome);

    public String getSobreNome();

    public void setSobreNome(String sobreNome);

    public int getIdade();

    public void setIdade(int idade);

    public String getEstadoCivil();

    public void setEstadoCivil(String estadoCivil);

    public String getDocumento();

    public void setDocumento(String documento);
}
