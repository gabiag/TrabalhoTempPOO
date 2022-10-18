package src;


public class Main {

    public static void main (String[] args){
        Usuario.addProfessor(new Professor("João Montadeon", 01, "POO"));
        Usuario.imprimeDadosProfessores();
        
        Usuario.addaluno(new Aluno("Mariana Gressi", 2, "Desenvolvimento de Sistemas"));
        Usuario.imprimeDadosAlunos();

        Sala.addLaboratorio(new SalaLaboratorio('C', 1, 15));
        Sala.imprimeDadosLaboratorios();

        Sala.addSala(new SalaConvencional('L', 2, 30));
        Sala.imprimeDadosSalaConvencional();

    

    }
}

