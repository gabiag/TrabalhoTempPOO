package src;


public class Main {

   
    public static void main (String[] args){
        Caixas caixasDialogo = new Caixas();

        caixasDialogo.hello();
        caixasDialogo.inicio();
        
        //alunos cadastrados
        //alterações em Usuario -> addAlunoLista() 
        /*
        Usuario alunos = new Usuario();
        alunos.addaluno(new Aluno("Mariana Gressi", 4, "Desenvolvimento de Sistemas"));
        alunos.addaluno(new Aluno("Gabriella Aguiar", 5, "Desenvolvimento de Sistemas"));
        alunos.addaluno(new Aluno("Wallace Freitas", 6, "Desenvolvimento de Sistemas"));
        alunos.addaluno(new Aluno("Jeferson Constantino", 7, "Biotecnologia"));
        alunos.addaluno(new Aluno("Raphael Menezes", 8, "Biotecnologia"));
        alunos.addaluno(new Aluno("Pedro Nunes", 9, "Biotecnologia"));
        */
     
        //labs cadastrados
        //alterações em Sala-> addLabLista() 
        /*
        Sala laboratorios = new Sala();
        laboratorios.addLaboratorio(new SalaLaboratorio('L', 1, 15));
        laboratorios.addLaboratorio(new SalaLaboratorio('L', 2, 15));
        laboratorios.imprimeDadosLaboratorios();
        */

        //salas convencionais cadastradas
        //alterações em Sala -> addSalaLista()
        /*
        Sala convencionais = new Sala();
        convencionais.addSala(new SalaConvencional('C', 3, 30));
        convencionais.addSala(new SalaConvencional('C', 4, 30));
        convencionais.imprimeDadosSalaConvencional();
        */
    }
}

