/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package controle.de.matricula.interfaces;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;
import java.util.Random;

/**
 *
 * @author Rafael de Souza Costa
 */
public final class Disciplina implements IMatricula{
    private String nome;
    private String horario;
    private String indentificador;
    private Curso curso;

    private String typeMatricula = "-1";
    private String numeroMatricula;
    private boolean ativa = true;
    private Date dataMatricula = new Date();
    
    private ArrayList<String> cursosMatriculados;

    public Disciplina(String nome, String horario, Curso curso) {
        this.nome = nome;
        this.horario = horario;
        this.indentificador = this.nome + String.valueOf(new Random().nextInt());
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getIndentificador() {
        return indentificador;
    }

    public void setIndentificador(int indentificador) {
        this.indentificador = "D" + indentificador;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    
    @Override
    public String getTypeMatricula() {
        return typeMatricula;
    }

    @Override
    public void setTypeMatricula(String typeMatricula) {
        this.typeMatricula = typeMatricula;
    }

    @Override
    public String getNumeroMatricula() {
        return numeroMatricula;
    }

    @Override
    public boolean isAtiva() {
        return ativa;
    }

    @Override
    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }
    
    @Override
    public Date getDataMatricula() {
        return dataMatricula;
    }

    @Override
    public void setDataMatricula(Date dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    @Override
    public ArrayList<String> getDisciplinasMatriculadas(){return null;};

    @Override
    public void setDisciplinasMatriculadas(String disciplina){};
    
    @Override
    public boolean checkTheDisciplina(String disciplina){return false;};

    @Override
    public ArrayList<String> getCursosMatriculados() {
        return cursosMatriculados;
    }

    @Override
    public void setCursosMatriculados(String curso) {
        if(cursosMatriculados == null){
            this.cursosMatriculados = new ArrayList<>();
        }
        this.cursosMatriculados.add(curso);
    }
    
    @Override
    public boolean checkTheMateria(String curso){
        if(this.cursosMatriculados.contains(curso)){
            return true;
        }
        return false;
    }    
    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.nome);
        hash = 79 * hash + Objects.hashCode(this.horario);
        hash = 79 * hash + Objects.hashCode(this.indentificador);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Disciplina other = (Disciplina) obj;
        if (this.indentificador != other.indentificador) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }

        if (!Objects.equals(this.horario, other.horario)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Disciplina{" + "nome=" + nome  + ", horario=" + horario + ", indentificador=" + indentificador + '}';
    }
    
    
}
