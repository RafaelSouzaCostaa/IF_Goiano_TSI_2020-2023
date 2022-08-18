/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package controle.de.matricula.interfaces;

import controle.de.matricula.interfaces.Aluno;
import controle.de.matricula.interfaces.Curso;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Rafael de Souza Costa
 */
public final class Cadastro {
   
    private ArrayList<Curso> cursos;
    private ArrayList<Disciplina> disciplinas;
    private ArrayList<Professor> professores;
    private ArrayList<Aluno> alunos;

    public Cadastro() {
    }

    public ArrayList<Curso> getCursos() {
        if(cursos == null){
            cursos = new ArrayList<>();
        }
        return cursos;
    }
    
    public Curso getCursos(int index) {
        return cursos.get(index);
    }
    
    public void setCursos(Curso curso) {
        if(cursos == null){
            cursos = new ArrayList<>();
        }
        curso.setIndentificador(this.cursos.size());
        cursos.add(curso);
    }

    public ArrayList<Disciplina> getDisciplinas() {
        if(disciplinas == null){
            disciplinas = new ArrayList<>();
        }
        return disciplinas;
    }
    
    public Disciplina getDisciplina(int index) {
        return disciplinas.get(index);
    }
    
    public void setDisciplinas(Disciplina disciplina) {
        if(disciplinas == null){
            disciplinas = new ArrayList<>();
        }
        disciplina.setIndentificador(this.disciplinas.size());
        this.disciplinas.add(disciplina);
    }

    public ArrayList<Professor> getProfessores() {
        return professores;
    }
    
    public Professor getProfessor(int index){
        return professores.get(index);
    }

    public void setProfessor(Professor professor) {
        if(this.professores == null){
            this.professores = new ArrayList<>();
        }
        this.professores.add(professor);
    }
    
    public ArrayList<Aluno> getAlunos() {
        if(this.alunos == null){
            this.alunos = new ArrayList<>();
        }
        return alunos;
    }
    
    public Aluno getAluno(int index){
        return alunos.get(index);
    }

    public void setAluno(Aluno aluno) {
        if(this.alunos == null){
            this.alunos = new ArrayList<>();
        }
        this.alunos.add(aluno);
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.cursos);
        hash = 29 * hash + Objects.hashCode(this.disciplinas);
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
        final Cadastro other = (Cadastro) obj;
        if (!Objects.equals(this.cursos, other.cursos)) {
            return false;
        }
        if (!Objects.equals(this.disciplinas, other.disciplinas)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Cadastro{" + "cursos=" + cursos + ", disciplinas=" + disciplinas + '}';
    }
    
}
