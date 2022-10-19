package src;

import java.util.ArrayList;

public class Usuario{
    private char tipoUsuario;
    private String Nome;
    private int Matricula;
    static ArrayList <Professor> listaprof;
    static ArrayList<Aluno> listaaluno;


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

    public static  void addProfessor(Professor p){
        p.setUser(p);
        listaprof.add(p);
        
    }

    public static void addaluno(Aluno a){
        a.setUser(a);
        listaaluno.add(a);
    }

    public static void imprimeDadosAlunos(){

        if(listaaluno.size()>0){
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
    
     public static void imprimeDadosProfessores(){

        if(listaprof.size()>0){
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




    
}
