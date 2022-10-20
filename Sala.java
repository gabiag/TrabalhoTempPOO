package src;

import java.util.ArrayList;
import java.util.Scanner;

public class Sala {
    //Atributos
    private static int maximoReserva =20;
    private static int numReserva =0;
    private int  numSala=1;
    private char tipoSala;
    private ArrayList<SalaConvencional> listaconvencional;
    private ArrayList<SalaLaboratorio> listalaboratorio;
    private ArrayList<Reserva>listareservac;
    private ArrayList<Reserva>listareserval;



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
    public ArrayList<SalaConvencional> getListaconvencional() {
        return listaconvencional;
    }
    public ArrayList<SalaLaboratorio> getListalaboratorio() {
        return listalaboratorio;
    }
    public ArrayList<Reserva> getListareservac() {
        return listareservac;
    }
    public ArrayList<Reserva> getListareserval() {
        return listareserval;
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
        listareservac = new ArrayList<>();
        listareserval = new ArrayList<>();
    }

    public Sala(char tipoSala, int numSala){
        settipoSala(tipoSala);
        setnumSala(numSala);
        listaconvencional = new ArrayList<>();
        listalaboratorio = new ArrayList<>();
        listareservac = new ArrayList<>();
        listareserval = new ArrayList<>();
    }

    private void setnumSala(int numSala2) {
    }
    public void addSala(SalaConvencional c){
        c.setSala(c);
        this.listaconvencional.add(c);
    }

    public void addLaboratorio(SalaLaboratorio l){
        l.setSala(l);
        this.listalaboratorio.add(l);
    }

    public void imprimeDadosSalaConvencional(){

        if(this.listaconvencional.size()>0){
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

     public  void imprimeDadosLaboratorios(){

        if(this.listalaboratorio.size()>0){
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

    
    public void addreserva(Reserva r){
    
        System.out.println("Qual tipo de sala você deseja reservar? Digite C para sala comum e L para laboratorio.");
        Scanner entrada = new Scanner(System.in);
        tipoSala=entrada.next().charAt(0);
        if(tipoSala=='C'){
            if(this.listareservac.size()<maximoReserva){
            r.setSala(r);
            listareservac.add(r);
            numReserva++;
            System.out.println("Sala Reservada!");
            }
        }
        if(tipoSala=='L'){

           if(this.listareserval.size()<maximoReserva){
            r.setSala(r);
            listareserval.add(numSala, r);
            numReserva++;
            System.out.println("Sala Reservada");
           }
        }
        if(tipoSala!='C' & tipoSala!='L'){
            System.out.println("Sala não identificada");
        }
        entrada.close();
    }

    public void imprimeReservassala(){

        if(this.listareservac.size()>0){
           for(int i=0; i<listareservac.size();i++){
            System.out.println("Reservas");
            listareservac.get(i).getData();
            System.out.println("Sala: " + listareservac.get(i).getNumSala()+ "Professor: "+listareservac.get(i).getProfessor().getNome()+"Data: "+listareservac.get(i).getData().getTime());
           }

        }
        else{
            System.out.println("Não há salas reservadas!");
        }   
     }
    
     public void imprimeReservaslab(){

        if(this.listareserval.size()>0){
           for(int i=0; i<listareserval.size();i++){
            System.out.println("Reservas");
            listareservac.get(i).getData();
            System.out.println("Sala: " + listareserval.get(i).getNumSala()+ "Professor: "+listareserval.get(i).getProfessor().getNome()+"Data: "+listareserval.get(i).getData().getTime());
           }

        }
        else{
            System.out.println("Não há laboratorios reservados!");
        }   
     }

    public void addLabLista(){
        addLaboratorio(new SalaLaboratorio('L', 1, 15));
        addLaboratorio(new SalaLaboratorio('L', 2, 15));
        imprimeDadosLaboratorios();
    }
    
    public void addSalaLista(){
        addSala(new SalaConvencional('C', 3, 30));
        addSala(new SalaConvencional('C', 4, 30));
        imprimeDadosSalaConvencional();
    }

    

    
}