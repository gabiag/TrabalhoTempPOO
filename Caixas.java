package src;

import javax.swing.JOptionPane;


public class Caixas {

public void hello(){
    JOptionPane.showMessageDialog(null, 
                                          "Bem vindo ao sistema de reservas!",
                                            "INÍCIO",
                                            JOptionPane.PLAIN_MESSAGE);
                                        }

public void bye(){
    JOptionPane.showMessageDialog(null,
                                         "Até logo!",
                                           "SAIR", 
                                JOptionPane.DEFAULT_OPTION);
}

public void desejaVoltar(){
    int opcaoD;
    opcaoD = JOptionPane.showConfirmDialog(null, 
                                                   "Deseja voltar ao início?", 
                                                     null, 
                                                     JOptionPane.PLAIN_MESSAGE,
                                                     JOptionPane.YES_NO_OPTION);
     if(opcaoD == 0){
         inicio();;
     } else {
         bye();
     }

}

public void inicio(){
    String[] opcaoInicio = {/*"Cadastro",*/ "Visualização", "Reserva", "Sair"};
    String opcaoI;
    opcaoI = (String) JOptionPane.showInputDialog(null, 
                                                          "Selecione uma opção", 
                                                            "INÍCIO", 
                                                            JOptionPane.PLAIN_MESSAGE,  
                                                             null, 
                                                            opcaoInicio, 
                                            "");
    /*if(opcaoI == "Cadastro"){
        inicioCadastrar();
    } else */ if(opcaoI == "Visualização"){
        inicioVer();  
    } else if(opcaoI == "Reserva"){
        informaUsuario();

    } else if (opcaoI == "Sair"){
        int opcaoS;
       opcaoS = JOptionPane.showConfirmDialog(null, 
                                                      "Deseja sair do sistema de reservas?", 
                                                        "ATENÇÃO", 
                                                        JOptionPane.WARNING_MESSAGE,
                                                        JOptionPane.YES_NO_OPTION);
        if(opcaoS == 0){
            bye();
        } else {
            inicio();
        }
    }
}

/*public void inicioCadastrar(){
   
    String[] opcaoInicioCadastrar = {"Cadastrar professor", "Cadastrar aluno", "Cadastrar sala", "Voltar"};
    int opcaoC;
    opcaoC = JOptionPane.showOptionDialog(null, 
                                                  "Por favor, informe o cadastro que gostaria de realizar", 
                                                    "CADASTRO", 
                                                0, 
                                                JOptionPane.QUESTION_MESSAGE, 
                                                      null, 
                                                opcaoInicioCadastrar, 
                                              null);
    if(opcaoC == 0) {
        //funcao cadastrar prof

    } else if(opcaoC == 1){
        //função cadastrar aluno 
    } else if(opcaoC == 2) {
        //funcao cadastrar sala
    } else if (opcaoC == 3){
        inicio();
    }
}*/

public void inicioVer(){

    Sala salas = new Sala();  
    Usuario professores = new Usuario();
    Usuario user = new Usuario();
    String[] opcaoInicioVer = {"Ver professores", "Ver alunos", "Ver salas", "Voltar"};
    int opcao;
    opcao = JOptionPane.showOptionDialog(null, 
                                                "Por favor, selecione a opção que gostaria de visualizar",
                                                  "VISUALIZAR", 
                                             0, JOptionPane.QUESTION_MESSAGE, 
                                                   null, 
                                                        opcaoInicioVer, 
                                           null);
    if(opcao == 0){
        //funcao ver profs cadastrados
        professores.addProfessorLista();
        professores.imprimeDadosProfessores();
        desejaVoltar();;

    } else if (opcao == 1){
        //funcao ver alunos cadastrados
        user.addAlunoLista();
        user.imprimeDadosAlunos();
        desejaVoltar();

    } else if (opcao == 2){
        //funcao ver salas disponíveis
        salas.addLabLista();
        salas.addSalaLista();
        desejaVoltar();
    } else if (opcao == 3 ){
        inicio();
    }


}


public void informaUsuario(){
    
    Sala reservas = new Sala();
    String[] opcaoUSers = {"Professor", "Aluno"};
    int opcao;
    opcao = JOptionPane.showOptionDialog(null, 
                                                "Por favor, informe se é professor ou aluno",
                                                  "USUÁRIO", 
                                             0, JOptionPane.QUESTION_MESSAGE, 
                                                   null, 
                                                        opcaoUSers, 
                                           null);
    if(opcao == 0){
        JOptionPane.showMessageDialog(null,
                                              "Bem vindo professor!", 
                                                "BEM VINDO", 
                                            JOptionPane.PLAIN_MESSAGE);

    reservas.addreserva(new Reserva(new Professor("Joao", 1,"POO"), 15));
    reservas.imprimeReservassala();
    desejaVoltar();

    } else {

      opcao = JOptionPane.showConfirmDialog(null, 
                                                    "Deseja Visualizar a lista de reservas?", 
                                                      "VISUALIZAR", 
                                                      JOptionPane.YES_NO_OPTION);
        if(opcao == 0){
          //imprime a lista de reserva da sala
          reservas.imprimeReservaslab();
          reservas.imprimeReservassala();

        } else {
            opcao = JOptionPane.showConfirmDialog(null, 
                                                          "Deseja sair do sistema de reservas?", 
                                                            "ATENÇÃO",
                                                  JOptionPane.WARNING_MESSAGE, 
                                                  JOptionPane.YES_NO_OPTION);
        } if(opcao == 0){
            bye();
        } else {
            inicio();
        }
    
      
    }
} 
}
