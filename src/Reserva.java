package src;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Reserva {

    private Usuario usuario;
    private int numReservaA;
    private Calendar Data;



    //Getters 

    public Usuario getUsuario(){
        return this.usuario;
    }
    public int getnumReservaA(){
        return this.numReservaA;
    }
    public Calendar getData(){
        return this.Data;
    }



    //Setters
    public void setUsuario(Usuario usuario){
        this.usuario = usuario;
    }
    public void setnumReservaA(int numReservaA){
        this.numReservaA = numReservaA;
    }
    public void setData(Calendar Data){
        this.Data = Data;
    }

    public Reserva(Usuario usuario, int numReservaA, int dia){
        Calendar Data = new GregorianCalendar(2022,Calendar.OCTOBER,dia,18,12);
        setUsuario(usuario);
        setnumReservaA(numReservaA);
        setData(Data);
    }

    



    
    
}
