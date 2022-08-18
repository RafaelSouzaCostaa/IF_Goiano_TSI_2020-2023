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
public final class Curso implements IMatricula{
    private String nome;
    private String qtdPeriodo;
    private String horario;
    private String indentificador;
    
    private String typeMatricula = "-1";
    private String numeroMatricula;
    private boolean ativa = true;
    private Date dataMatricula = new Date();
    
    private ArrayList<String> disciplinasMatriculadas;
    private ArrayList<String> cursosMatriculados;
 
    public Curso(String nome, String qtdPeriodo, String horario) {
        this.nome = nome;
        this.qtdPeriodo = qtdPeriodo;
        this.horario = horario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getQtdPeriodo() {
        return qtdPeriodo;
    }

    public void setQtdPeriodo(String qtdPeriodo) {
        this.qtdPeriodo = qtdPeriodo;
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
        this.indentificador = "C" + indentificador;
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
    public ArrayList<String> getDisciplinasMatriculadas() {
        return disciplinasMatriculadas;
    }

    @Override
    public void setDisciplinasMatriculadas(String disciplina) {
        if(this.disciplinasMatriculadas == null){
            this.disciplinasMatriculadas = new ArrayList<>();
        }
        this.disciplinasMatriculadas.add(disciplina);
    }

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
    public boolean checkTheDisciplina(String disciplina){
        if(this.disciplinasMatriculadas.contains(disciplina)){
            return true;
        }
        return false;
    }
    
    @Override
    public boolean checkTheMateria(String curso){
        if(this.cursosMatriculados.contains(curso)){
            return true;
        }
        return false;
    }
}
