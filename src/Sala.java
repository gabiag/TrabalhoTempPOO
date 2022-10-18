package src;

import java.util.ArrayList;

public class Sala {
    //Atributos
    private static int maximoReserva=20;
    public int numSala;
    public char tipoSala;
    private int numReserva;
    private ArrayList<Reserva> reserva = new ArrayList<>(maximoReserva);


    //Getters

    
    public char gettipoSala(){
        return this.tipoSala;
    }
    public int getnumSala(){
        return this.numSala;
    }
    public int getnumReserva(){
        return this.numReserva;
    }
    


    //Setters
    public void settipoSala(char tipoSala){
        this.tipoSala = tipoSala;
    }
    public void setnumSala(int numSala){
        this.numSala = numSala;
    }
    public void setnumReserva(int numReserva){
        this.numReserva = numReserva;
    }

    public Sala(char tipoSala, int numSala){
        settipoSala(tipoSala);
        setnumSala(numSala);
    }
    

    //Metodo para adicionar reservas
    public boolean adicionarreserva(Usuario usuario, int dia){

        if(numReserva<maximoReserva){
            Reserva novareserva = new Reserva(usuario, numReserva, dia);
            reserva.add(novareserva);
            setnumReserva(reserva.size());
            return true;
        }
        return false;
    }
    

    


    

    
}
