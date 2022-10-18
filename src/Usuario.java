package src;

import java.util.ArrayList;

public class Usuario {
    private static int numUsuarios;
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

    public void addaluno(Aluno a){
        a.setUser(a);
        listaaluno.add(a);
    }

    public static void contaUsuarios(){
        numUsuarios=0;
        numUsuarios = listaaluno.size()+listaprof.size();
        System.out.println("O numero de usuarios é: "+numUsuarios);
    }
     public static void imprimeUsuarios(){
        ArrayList<Usuario>listaUsuario = new ArrayList<>();
        if(listaUsuario.size()>=0){
           for(int i=0; i<listaUsuario.size();i++){
            System.out.println("Dados do Usuario: ");
            System.out.println("Nome: " + listaUsuario.get(i).getNome());
            System.out.println("Matricula: " + listaUsuario.get(i).getMatricula());
           }
        }
        else{
            System.out.println("Não há usuarios cadastrados!");
        }   
     }




    
}
