/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controle.de.matricula.interfaces;

import java.util.Scanner;

/**
 *
 * @author rafal
 */
public class ControleDeMatriculaInterfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Cadastro cadastro = new Cadastro();      
       
        Scanner scanner = new Scanner(System.in); 
       
        System.out.println("########### Rafael de Souza Costa - 5° TSI ###########\n\n\n");

        int indexMenu = -1; 
        while(indexMenu != 0){
            System.out.println("1 - Curso \n2 - Disciplina \n3 - Professor \n4 - Aluno \n5 - Sair \n");
            indexMenu = scanner.nextInt();

            switch(indexMenu){
                case 1:
                    //Chamar Cadastro Curso
                    int indexCurso = -1;
                    while(indexCurso != 0){
                        System.out.println("\n1 - Cadastro Cursos \n2 - Lista Cursos \n3 - Voltar");
                             indexCurso = scanner.nextInt();
                             scanner = new Scanner(System.in);
                        switch(indexCurso){
                            case 1:                              
                                System.out.println("Nome: ");
                                    String nome = scanner.nextLine();
                                System.out.println("Quantidade de Periodo: "); 
                                    String qtdPeriodo = scanner.nextLine();
                                System.out.println("Turno: "); 
                                    String horario = scanner.nextLine();

                                cadastro.setCursos(new Curso(nome, qtdPeriodo, horario));
                            break;
                            case 2:
                                if(cadastro.getCursos().size() == 0){System.err.println("Cadatre um Curso Primeiro"); break;}
                                cadastro.getCursos().forEach((Curso curso) -> {
                                    System.out.println("# " + curso.getIndentificador() + "  =>  Nome: " + curso.getNome() + " Horario: " + curso.getHorario() + " Quantidade de Periodo: " + curso.getQtdPeriodo());
                                });
                            break;
                            case 3: 
                                indexCurso = 0;
                            break;
                        }
                    }
                break;
                case 2:
                    //Chamar Cadastro Disciplina
                    if(cadastro.getCursos().size() == 0){System.err.println("Cadatre um Curso Primeiro"); break;}
                    
                    int indexDisciplina = -1;
                    while(indexDisciplina != 0){
                        System.out.println("\n1 - Cadastro Disciplina \n2 - Lista Disciplinas \n3 - Voltar");
                        indexDisciplina = scanner.nextInt();
                        scanner = new Scanner(System.in);

                        switch(indexDisciplina){
                            case 1:                              
                                System.out.println("Nome: ");
                                    String nome = scanner.nextLine();
                                System.out.println("Horario: "); 
                                    String horarioDisciplina = scanner.nextLine();

                                System.out.println("Escolha o Curso: \n");

                                         cadastro.getCursos().forEach((Curso curso) -> {
                                         System.out.println("# " + curso.getIndentificador() + "  =>  Nome: " + curso.getNome() + " Horario: " + curso.getHorario() + " Quantidade de Periodo: " + curso.getQtdPeriodo());
                                     });
                                         String indexEscolhido = scanner.nextLine();

                                    for(int r = 0; r < cadastro.getCursos().size(); r++){
                                         Curso curso = cadastro.getCursos(r);

                                         if(indexEscolhido.equals(curso.getIndentificador())){
                                             cadastro.setDisciplinas(new Disciplina(nome, horarioDisciplina, curso));
                                             System.out.println("Disciplina Cadastrada Com Sucesso!");
                                             break;
                                         }
                                     }    
                                     //System.err.println("Não localizado o curso informado");

                            break;
                            case 2:
                                if(cadastro.getDisciplinas() != null && cadastro.getDisciplinas().size() > 0){
                                     cadastro.getDisciplinas().forEach((Disciplina disciplina) -> {
                                         System.out.println("# " + disciplina.getIndentificador() + " Nome: " + disciplina.getNome() + " Horario: " + disciplina.getHorario() + " Curso: " + disciplina.getCurso().getNome());
                                     });
                                }else{
                                    System.err.println("Não Possui Disciplinas Cadastradas!");
                                }                                                            

                            break;
                            case 3: 
                                indexDisciplina = 0;
                            break;
                        }            
                    }
                break;
                case 3:
                    //Chamar Cadastro Professor
                    if(NivelDeFormacao.retriaveAll().size() == 0){System.err.println("Cadatre um Nivel de Formacao Primeiro"); break;}
                    if(cadastro.getDisciplinas().size() == 0){System.err.println("Cadatre uma Disciplina Primeiro"); break;}
                    
                    int indexProfessor = -1;
                    while(indexProfessor != 0){
                        System.out.println("\n1 - Cadastro Professor \n2 - Lista Professores \n3 - Voltar");
                             indexProfessor = scanner.nextInt();
                             scanner = new Scanner(System.in);
                        switch(indexProfessor){
                            case 1:

                                 System.out.println("Nome: "); 
                                     String nome = scanner.nextLine();
                                 System.out.println("Sobrenome: ");
                                     String sobreNome = scanner.nextLine();
                                     scanner = new Scanner(System.in);
                                 System.out.println("Idade: ");
                                     int idade = scanner.nextInt();
                                     scanner = new Scanner(System.in);
                                 System.out.println("Estado Civil: ");
                                     String estadoCivil = scanner.nextLine();
                                 System.out.println("Documento: ");
                                     String documento = scanner.nextLine();
                                     scanner = new Scanner(System.in);
                                 System.out.println("Nivel de Formação: ");
                                     NivelDeFormacao.retriaveAll().forEach((String nivel) -> {
                                         System.out.println(nivel);
                                     });
                                 String nivel = NivelDeFormacao.retriave(scanner.nextInt());

                                 Professor prof = new Professor(TypesMatricula.PROFESSOR, nome, sobreNome, idade, estadoCivil, documento, nivel);
                                 System.out.println("Disciplinas: ");

                                 for(int i = 0; i < cadastro.getDisciplinas().size(); i++ ){
                                     System.out.println( i + " - " + cadastro.getDisciplina(i).getNome());
                                 }

                                 System.out.println("Informe o Index das Disciplinas: ");

                                 int indexEscolhaDisciplina = cadastro.getDisciplinas().size() + 1;
                                 while(indexEscolhaDisciplina != -1){
                                     int index = scanner.nextInt();
                                     scanner = new Scanner(System.in);

                                     if(index == -1){
                                         break;
                                     }
                                     Disciplina aux = cadastro.getDisciplina(index);
                                     prof.setDiciplina(aux);
                                     System.out.println(aux.getNome() + " - Cadastrada com Sucesso!");
                                     System.out.println("Selecione outra ou -1 para sair");
                                 }
                                 cadastro.setProfessor(prof);
                                 System.out.println("Professor Cadastrado!");
                            break;
                            case 2:
                                if(cadastro.getProfessores() != null && cadastro.getProfessores().size() > 0){
                                         cadastro.getProfessores().forEach((Professor professor) -> {
                                             System.out.println( "Nivel: " + professor.getNivelDeFormacao() + " =>  Nome: " + professor.getNome() + " " + professor.getSobreNome() + " Idade: " + professor.getIdade() + " Estado Civil: " + professor.getEstadoCivil());
                                         });
                                     }else{
                                         System.err.println("Não Possui Professor Cadastrado!");
                                     } 
                            break;
                            case 3: 
                                indexProfessor = 0;
                            break;
                        }
                    }
                break;
                case 4:
                    //Chamar Cadastro Aluno
                    if(cadastro.getCursos().size() == 0){System.err.println("Cadatre um Curso Primeiro"); break;}
                    if(cadastro.getDisciplinas().size() == 0){System.err.println("Cadatre uma Disciplina Primeiro"); break;}
                    
                    int indexAluno = -1;
                    while(indexAluno != 0){
                        System.out.println("1 - Cadastro Aluno \n2 - Listar Aluno \n3- Voltar");
                        indexAluno = scanner.nextInt();
                        scanner = new Scanner(System.in);

                        switch(indexAluno){
                            case 1:
                                //Cadastrar

                                System.out.println("Nome: ");
                                    String nome = scanner.nextLine();
                                System.out.println("Sobrenome: ");    
                                    String sobreNome = scanner.nextLine();
                                    scanner = new Scanner(System.in);
                                System.out.println("Idade: ");
                                    int idade = scanner.nextInt();
                                    scanner = new Scanner(System.in);
                                System.out.println("Estado Civil: ");
                                    String estadoCivil = scanner.nextLine();
                                System.out.println("Documento: "); 
                                    String documento = scanner.nextLine();
                                for(int i = 0; i < cadastro.getDisciplinas().size(); i++ ){
                                     System.out.println( i + " - " + cadastro.getDisciplina(i).getNome());
                                 }

                                Aluno aluno = new Aluno(TypesMatricula.ALUNO, nome, sobreNome, indexMenu, estadoCivil, documento);

                                System.out.println("Informe o Index das Disciplinas: ");

                                int indexEscolhaDisciplina = cadastro.getDisciplinas().size() + 1;
                                while(indexEscolhaDisciplina != -1){
                                    int index = scanner.nextInt();
                                    scanner = new Scanner(System.in);

                                    if(index == -1){
                                        break;
                                    }
                                    Disciplina aux = cadastro.getDisciplina(index);
                                    aluno.setDiciplina(aux);
                                    System.out.println(aux.getNome() + " - Cadastrada com Sucesso!");
                                    System.out.println("Selecione outra ou -1 para sair");                                
                                }
                                cadastro.setAluno(aluno);
                            break;
                            case 2:
                                //Listar alunos
                                if(cadastro.getAlunos().size() == 0){System.err.println("Cadatre um Aluno Primeiro"); break;}
                                cadastro.getAlunos().forEach((Aluno auxAluno) -> {
                                    System.out.println( "          Matricula: " + auxAluno.getNumeroMatricula() + " => " + "Nome: " + auxAluno.getNome() + " " + auxAluno.getSobreNome() + " Documento: " + auxAluno.getDocumento());
                                    System.out.println("          Cursos Matriculados: ");
                                    auxAluno.getCursos().forEach((Curso auxCurso) -> {
                                        System.out.println("          Matricula: " + auxCurso.getIndentificador() + " => Nome: " + auxCurso.getNome() + " Horario: " + auxCurso.getHorario());
                                    });
                                    System.out.println("          Disciplinas Matriculadas: ");
                                    auxAluno.getDiciplinas().forEach((Disciplina auxDisciplina) -> {
                                        System.out.println("          Matricula: " + auxDisciplina.getIndentificador() + " => Nome: " + auxDisciplina.getNome() + " Horario: " + auxDisciplina.getHorario() + " Curso: " + auxDisciplina.getCurso().getNome());
                                    });
                                });

                            break;
                            case 3:
                                //Voltar
                                indexAluno = 0;
                            break;
                        }
                    }
                break;
                case 5:
                    indexMenu = 0;
                break;
               
            }
        }
       
    }
}

