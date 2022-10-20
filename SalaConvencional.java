package src;


public class SalaConvencional extends Sala {
    //Atributos
    private int Capacidade;
    private Sala sala;

    //Getters
    public int getCapacidade() {
        return Capacidade;
    }
    public Sala getSala() {
        return sala;
    }

    //Setters
    public void setCapacidade(int capacidade) {
        Capacidade = capacidade;
    }
    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public SalaConvencional(char tipoSala, int numSala, int Capacidade){
        super(tipoSala,numSala);
        setCapacidade(Capacidade); 
    }
    
}
