/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package controle.de.matricula.interfaces;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author rafal
 */
public interface IMatricula {
    public String getTypeMatricula();

    public void setTypeMatricula(String typeMatricula);

    public String getNumeroMatricula();

    public boolean isAtiva();

    public void setAtiva(boolean ativa);
    
    public Date getDataMatricula();

    public void setDataMatricula(Date dataMatricula);

    public ArrayList<String> getDisciplinasMatriculadas();

    public void setDisciplinasMatriculadas(String disciplina);

    public ArrayList<String> getCursosMatriculados();

    public void setCursosMatriculados(String curso);
    
    public boolean checkTheDisciplina(String disciplina);
    
    public boolean checkTheMateria(String curso);
}
