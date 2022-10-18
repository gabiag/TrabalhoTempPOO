package src;
public class Professor extends Usuario {
    //Atributos

    private String Disciplina;
    private Usuario user;

    //Getters

    public String getDisciplina(){
        return this.Disciplina;
    }
    public Usuario getUser() {
        return user;
    }
    
    //Setters

    public void setDisciplina(String Disciplina){
        this.Disciplina = Disciplina;
    }
    public void setUser(Usuario user) {
        this.user = user;
    }

    public Professor(String Nome, int Matricula,String Disciplina){
        super(Nome, Matricula);
        this.setDisciplina(Disciplina);
    }
    public Professor(){

    }


}