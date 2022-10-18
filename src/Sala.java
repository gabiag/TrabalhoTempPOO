package src;

import java.util.ArrayList;

public class Sala {
    //Atributos
    private int numSala;
    private char tipoSala;
    static ArrayList<SalaConvencional> listaconvencional;
    static ArrayList<SalaLaboratorio> listalaboratorio;



    //Getters

    
    public char gettipoSala(){
        return this.tipoSala;
    }
    public int getnumSala(){
        return this.numSala;
    }
    public static ArrayList<SalaConvencional> getListaconvencional() {
        return listaconvencional;
    }
    public static ArrayList<SalaLaboratorio> getListalaboratorio() {
        return listalaboratorio;
    }

    


    //Setters
    public void settipoSala(char tipoSala){
        this.tipoSala = tipoSala;
    }
    public void setnumSala(int numSala){
        this.numSala = numSala;
    }

    public Sala(){
        listaconvencional = new ArrayList<>();
        listalaboratorio = new ArrayList<>();
    }

    public Sala(char tipoSala, int numSala){
        settipoSala(tipoSala);
        setnumSala(numSala);
        listaconvencional = new ArrayList<>();
        listalaboratorio = new ArrayList<>();
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
            System.out.println("Numero da sala: " + listaconvencional.get(i).getnumSala());
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
            System.out.println("Numero da sala: " + listalaboratorio.get(i).getnumSala());
            System.out.println("Capacidade: " + listalaboratorio.get(i).getCapacidade());
           }

        }
        else{
            System.out.println("Não há laboratorios cadastrados!");
        }   
     }

    
    

    /*Metodo para adicionar reservas
    public boolean adicionarreserva(Usuario usuario, int dia){

        if(numReserva<maximoReserva){
            Reserva novareserva = new Reserva(usuario, numReserva, dia);
            reserva.add(novareserva);
            setnumReserva(reserva.size());
            return true;
        }
        return false;
    }*/
    

    


    

    
}
