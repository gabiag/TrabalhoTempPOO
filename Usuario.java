package src;

import java.util.ArrayList;

public class Usuario{
    private char tipoUsuario;
    private String Nome;
    private int Matricula;
    private ArrayList <Professor> listaprof;
    private ArrayList<Aluno> listaaluno;


    //Getters
    public char getTipoUsuario() {
        return tipoUsuario;
    }
    public String getNome(){
        return this.Nome;
    }
    public int getMatricula(){
        return this.Matricula;
    }
    public ArrayList<Professor> getListaprof() {
        return listaprof;
    }
    public ArrayList<Aluno> getListaaluno() {
        return listaaluno;
    }


    //Setters
    public void setTipoUsuario(char tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
    public void setNome(String Nome){
        this.Nome=Nome;
    }
    public void setMatricula(int Matricula){
        this.Matricula=Matricula;
    }

    public Usuario(){
        listaprof=new ArrayList<>();
        listaaluno = new ArrayList<>();

    }
    
    public Usuario(String Nome, int Matricula){
        this.setNome(Nome);
        this.setMatricula(Matricula);
        listaprof=new ArrayList<>();
        listaaluno = new ArrayList<>();
    }

    public  void addProfessor(Professor p){
        p.setUser(p);
        this.listaprof.add(p);
        
    }

    public void addaluno(Aluno a){
        a.setUser(a);
        this.listaaluno.add(a);
    }

    public void imprimeDadosAlunos(){

        if(this.listaaluno.size()>0){
           for(int i=0; i<listaaluno.size();i++){
            System.out.println("Dados do Aluno: ");
            System.out.println("Nome: " + listaaluno.get(i).getNome());
            System.out.println("Matricula: " + listaaluno.get(i).getMatricula());
            System.out.println("Curso: " + listaaluno.get(i).getcurso());
           }

        }
        else{
            System.out.println("Não há alunos cadastrados!");
        }   
     }
    
     public  void imprimeDadosProfessores(){

        if(this.listaprof.size()>0){
           for(int i=0; i<listaprof.size();i++){
            System.out.println("Dados do Professor: ");
            System.out.println("Nome: " + listaprof.get(i).getNome());
            System.out.println("Matricula: " + listaprof.get(i).getMatricula());
            System.out.println("Disciplina Ministrada: " + listaprof.get(i).getDisciplina());
           }

        }
        else{
            System.out.println("Não há professores cadastrados!");
        }   
     }

    public void addProfessorLista(){
        addProfessor(new Professor("João Montadeon", 01, "POO"));
        addProfessor(new Professor("Leandro Maia", 2, "AEDS"));
        addProfessor(new Professor("Marcio Fantini", 3, "Banco de Dados"));
    }

    public void addAlunoLista(){
        addaluno(new Aluno("Mariana Gressi", 4, "Desenvolvimento de Sistemas"));
        addaluno(new Aluno("Gabriella Aguiar", 5, "Desenvolvimento de Sistemas"));
        addaluno(new Aluno("Wallace Freitas", 6, "Desenvolvimento de Sistemas"));
        addaluno(new Aluno("Jeferson Constantino", 7, "Biotecnologia"));
        addaluno(new Aluno("Raphael Menezes", 8, "Biotecnologia"));
        addaluno(new Aluno("Pedro Nunes", 9, "Biotecnologia"));
    }
}