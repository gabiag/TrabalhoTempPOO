package src;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Reserva extends Sala{

    private Professor professor;
    private Sala sala;
    private int numSala;
    private int numReservaA;
    private Calendar Data;



    //Getters 

    public Professor getProfessor() {
        return professor;
    }
    public int getnumReservaA(){
        return this.numReservaA;
    }
    public Calendar getData(){
        return this.Data;
    }
    public int getNumSala() {
        return numSala;
    }
    public Sala getSala() {
        return sala;
    }




    //Setters
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    public void setnumReservaA(int numReservaA){
        this.numReservaA = numReservaA;
    }
    public void setData(Calendar Data){
        this.Data = Data;
    }
    public void setNumSala(int numSala) {
        this.numSala = numSala;
    }
    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Reserva(Professor professor, int dia){
        Calendar Data = new GregorianCalendar(2022,Calendar.OCTOBER,dia,18,12);
        setNumSala(numSala);
        setProfessor(professor);
        setnumReservaA(numReservaA);
        setData(Data);
    }


    
}
