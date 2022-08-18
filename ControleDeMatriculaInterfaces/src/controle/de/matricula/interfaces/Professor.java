/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package controle.de.matricula.interfaces;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Rafael de Souza Costa
 */
public final class Professor implements IPessoa, IMatricula{
    
    private String nivelDeFormacao;
    private ArrayList<Disciplina> disciplinas;
    private String nome;
    private String sobreNome;
    private int idade; 
    private String estadoCivil;
    private String documento;
    
    private String typeMatricula = "-1";
    private String numeroMatricula;
    private boolean ativa = true;
    private Date dataMatricula = new Date();
    
    private ArrayList<String> disciplinasMatriculadas;
    private ArrayList<String> cursosMatriculados;

    public Professor(String tipoMatricula, String nome, String sobreNome, int idade, String estadoCivil, String documento, String nivelFormacao) {
        this.nivelDeFormacao = nivelFormacao;
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.idade = idade;
        this.estadoCivil = estadoCivil;
        this.documento = documento;
    }

    public String getNivelDeFormacao() {
        return nivelDeFormacao;
    }

    public void setNivelDeFormacao(String nivelDeFormacao) {
        this.nivelDeFormacao = nivelDeFormacao;
    }
    
    public ArrayList<Disciplina> retreaveAllDiciplinas(){
        return disciplinas;
    }
    
    public Disciplina retreaveDiciplina(int index){
        return disciplinas.get(index);
    }
    
    public void setDiciplina(Disciplina disciplina){
        if(disciplinas == null){
            disciplinas = new ArrayList<>();
        }
        disciplinas.add(disciplina);
    }
    
    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getSobreNome() {
        return sobreNome;
    }

    @Override
    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    @Override
    public int getIdade() {
        return idade;
    }

    @Override
    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String getEstadoCivil() {
        return estadoCivil;
    }
    
    @Override
    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @Override
    public String getDocumento() {
        return documento;
    }

    @Override
    public void setDocumento(String documento) {
        this.documento = documento;
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
