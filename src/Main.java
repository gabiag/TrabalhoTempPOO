package src;


public class Main {

    public static void main (String[] args){
        Usuario.addProfessor(new Professor("João Montadeon", 01, "POO"));
        Usuario.addProfessor(new Professor("Leandro Maia", 2, "AEDS"));
        Usuario.addProfessor(new Professor("Marcio Fantini", 3, "Banco de Dados"));
        Usuario.imprimeDadosProfessores();
        
        Usuario.addaluno(new Aluno("Mariana Gressi", 4, "Desenvolvimento de Sistemas"));
        Usuario.addaluno(new Aluno("Gabriela Aguiar", 5, "Desenvolvimento de Sistemas"));
        Usuario.addaluno(new Aluno("Wallace Freitas", 6, "Desenvolvimento de Sistemas"));
        Usuario.addaluno(new Aluno("Jefferson Constantino", 7, "Biotecnologia"));
        Usuario.addaluno(new Aluno("Raphael Menezes", 8, "Biotecnologia"));
        Usuario.addaluno(new Aluno("Pedro Nunes", 9, "Biotecnologia"));
        Usuario.imprimeDadosAlunos();

        Sala.addLaboratorio(new SalaLaboratorio('L', 1, 15));
        Sala.addLaboratorio(new SalaLaboratorio('L', 2, 15));
        Sala.imprimeDadosLaboratorios();

        Sala.addSala(new SalaConvencional('C', 3, 30));
        Sala.addSala(new SalaConvencional('C', 4, 30));
        Sala.imprimeDadosSalaConvencional();

        Sala.addreserva(new Reserva(new Professor("Joao", 1,"POO"), 1, 1, 15));
        Sala.addreserva(new Reserva(new Professor("João", 1, "POO"), 1, 2, 15));
        Sala.imprimeDadosdasReservas();
    

    }
}

