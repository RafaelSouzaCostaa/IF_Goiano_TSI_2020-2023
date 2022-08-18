/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package controle.de.matricula.interfaces;

import java.util.ArrayList;
import java.util.Date;


/**
 *
 * @author Rafael de Souza Costa
 */
public final class Aluno implements IPessoa, IMatricula{
    
    private ArrayList<Curso> cursos;
    private ArrayList<Disciplina> diciplinas;
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
    
    public Aluno(String tipoMatricula, String nome, String sobreNome, int idade, String estadoCivil, String documento) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.idade = idade;
        this.estadoCivil = estadoCivil;
        this.documento = documento;
        this.numeroMatricula = tipoMatricula + String.valueOf(new Date().getTime());
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }
    
    public Curso getCurso(int index) {
        return cursos.get(index);
    }
    
    public void setCurso(Curso curso) {
        if(cursos == null){
            cursos = new ArrayList<>();
        }
        this.cursos.add(curso);
    }

    public ArrayList<Disciplina> getDiciplinas() {
        return diciplinas;
    }
    
    public Disciplina getDiciplina(int index) {
        return diciplinas.get(index);
    }

    public void setDiciplina(Disciplina diciplina) {
        if(diciplinas == null){
            diciplinas = new ArrayList<>();
        }
        this.diciplinas.add(diciplina);
        
        setCurso(diciplina.getCurso());
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
        return this.disciplinasMatriculadas.contains(disciplina);
    }
    
    @Override
    public boolean checkTheMateria(String curso){
        return this.cursosMatriculados.contains(curso);
    }

}
