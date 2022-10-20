package src;

public class Aluno extends Usuario{
    //Atributos
    private String curso;
    private Usuario user;

    //Getters
    public String getcurso(){
        return this.curso;
    }
    public Usuario getUser() {
        return user;
    }


    //Setters
    public void setcurso(String curso){
        this.curso=curso;
    }
    public void setUser(Usuario user) {
        this.user = user;
    }

    public Aluno(String Nome, int Matricula, String curso){
        super(Nome, Matricula);
        this.setcurso(curso);
    }

    
}
