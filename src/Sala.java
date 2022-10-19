package src;

import java.util.ArrayList;
import java.util.Calendar;

public class Sala {
    //Atributos
    private static int maximoReserva =20;
    private static int numReserva =1;
    private int  numSala;
    private char tipoSala;
    static ArrayList<SalaConvencional> listaconvencional;
    static ArrayList<SalaLaboratorio> listalaboratorio;
    static ArrayList<Reserva>listareserva;



    //Getters

    
    public char gettipoSala(){
        return this.tipoSala;
    }
    public int getNumReserva() {
        return numReserva;
    }
    public int getNumSala() {
        return numSala;
    }
    public static ArrayList<SalaConvencional> getListaconvencional() {
        return listaconvencional;
    }
    public static ArrayList<SalaLaboratorio> getListalaboratorio() {
        return listalaboratorio;
    }
    public static ArrayList<Reserva> getListareserva() {
        return listareserva;
    }
    


    //Setters
    public void settipoSala(char tipoSala){
        this.tipoSala = tipoSala;
    }
    public void setNumSala(int numSala) {
        this.numSala = numSala;
    }

    public Sala(){
        listaconvencional = new ArrayList<>();
        listalaboratorio = new ArrayList<>();
        listareserva = new ArrayList<>();
    }

    public Sala(char tipoSala, int numSala){
        settipoSala(tipoSala);
        setnumSala(numSala);
        listaconvencional = new ArrayList<>();
        listalaboratorio = new ArrayList<>();
        listareserva = new ArrayList<>();
    }

    private void setnumSala(int numSala2) {
    }
    public static void addSala(SalaConvencional c){
        c.setSala(c);
        listaconvencional.add(c);
    }

    public static void addLaboratorio(SalaLaboratorio l){
        l.setSala(l);
        listalaboratorio.add(l);
    }

    public static void imprimeDadosSalaConvencional(){

        if(listaconvencional.size()>0){
           for(int i=0; i<listaconvencional.size();i++){
            System.out.println("Dados da Sala: ");
            System.out.println("Numero da sala: " + listaconvencional.get(i).getNumSala());
            System.out.println("Capacidade: " + listaconvencional.get(i).getCapacidade());
           }

        }
        else{
            System.out.println("Não há salas convencionais cadastradas!");
        }   
     }

     public static void imprimeDadosLaboratorios(){

        if(listalaboratorio.size()>0){
           for(int i=0; i<listalaboratorio.size();i++){
            System.out.println("Dados da Sala: ");
            System.out.println("Numero da sala: " + listalaboratorio.get(i).getNumSala());
            System.out.println("Capacidade: " + listalaboratorio.get(i).getCapacidade());
           }

        }
        else{
            System.out.println("Não há laboratorios cadastrados!");
        }   
     }

    
    public static void addreserva(Reserva r){


        if(listareserva.size()<maximoReserva){
            r.setSala(r);
            listareserva.add(r);
            System.out.println("Sala Reservada");
        }
        else{
            System.out.println("Essa sala não está disponivel");
        }
    }

    public static void imprimeDadosdasReservas(){

        if(listareserva.size()>0){
           for(int i=0; i<listareserva.size();i++){
            System.out.println("Reservas");
            listareserva.get(i).getData();
            System.out.println("Sala: " + listareserva.get(i).getNumSala()+ "Professor: "+listareserva.get(i).getProfessor().getNome()+"Data: "+listareserva.get(i).getData().getTime());
           }

        }
        else{
            System.out.println("Não há reservas!");
        }   
     }
    

    


    

    
}
