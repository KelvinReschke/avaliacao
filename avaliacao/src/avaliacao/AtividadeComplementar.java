//Você foi contratado para desenvolver uma aplicação para gerenciar uma competição de
//natação. O programa deve permitir cadastrar os atletas (nomes) que estão inscritos na
//competição. Para isso, você deve utilizar um vetor do tipo String. Além disso, o programa deve
//armazenar se o atleta completou a prova ou não (usando um vetor de boolean), o tempo que
//cada atleta levou para concluir a prova (em minutos, usando um vetor de double), e a
//quantidade de voltas completadas na piscina (usando um vetor de int).
//Menu de opções:
//Cadastrar atleta na competição;
//Registrar resultado de um atleta (completar prova, tempo de conclusão e voltas completadas);
//Exibir relatório completo dos atletas;
//Exibir relatório de atletas que completaram a prova;
//Exibir relatório de atletas que não completaram a prova;
//Exibir o atleta que concluiu a prova no menor tempo;
//EExibir o número total de voltas completadas por todos os atletas;
//Sair da aplicação.
//Requisitos:
//Cadastrar atleta: Ao cadastrar um atleta, você deve armazenar o nome no vetor e definir os
//valores de completouProva para false, o tempo para 0.0, e as voltas completadas para 0.
//Registrar resultado: Ao registrar o resultado de um atleta, você deve atualizar o status de
//completouProva para true ou false, o tempo de conclusão da prova (caso tenha completado), e
//o número de voltas completadas.
//package avaliacao;

import avaliacao.avaliaca2tenativa;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author kelvin
 */
public class AtividadeComplementar {

    Scanner entrada = new Scanner(System.in);
    String Atletas[] = new String[10];
    boolean[] provaCompleta = new boolean[10];
    double tempoProva[] = new double[10];
    int quantidadeDeVoltas = 0;
    int resultadoCompleto = 0;

    public static void main(String[] args) {
        AtividadeComplementar minhaClase = new AtividadeComplementar();
        int opcao = 0;
        do {
            opcao = minhaClase.menu();

            switch (opcao) {
                case 0:
                    minhaClase.menu();
                    break;
                case 1:
                    minhaClase.cadastrarAtletas();
                    break;
                case 2:
                    minhaClase.ResultadoAtleta();
                    break;
                case 3:
                    minhaClase.relatorioDosAtletasQCompletaramProva();
                    break;
                case 4:
                    minhaClase.relatorioDosAtletasNCompletaramProva();
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }

        } while (opcao != 8);

    }

    public int menu() {
        System.out.println("__________MENU__________"
                + "\n tecle 1 para cadastrar o Atleta na Competição"
                + "\n tecle 2 para Registrar resultado de um atleta (completar prova, tempo de conclusão e voltas completadas)"
                + "\n tecle 3 para Exibir relatório completo dos atletas; "
                + "\n tecle 4 para Exibir relatório de atletas que completaram a prova;"
                + "\n tecle 5 Exibir relatório de atletapara Exibir relatório de atletass que não completaram a prova; "
                + "\n tecle 6 para Exibir o atleta que concluiu a prova no menor tempo; "
                + "\n tecle 7 Exibir o número total de voltas completadas por todos os atletas; "
                + "\n tecle 8 se você quiser sair da aplicação: ");
        int opcaoMenu = entrada.nextInt();
        return opcaoMenu;
    }

    public void cadastrarAtletas() {
        System.out.println("informe o nome do competidor que deseja cadastrar: ");
        Atletas[resultadoCompleto] = entrada.next();
        tempoProva[resultadoCompleto] = 0;
        provaCompleta[resultadoCompleto] = false;
        quantidadeDeVoltas  =0 ;
    }

    public void ResultadoAtleta(){
         System.out.println("Insira o nome do atleta que vc deseja cadastrar o resultado: ");
        String Atleta = entrada.next();
        for (int i = 0; i < resultadoCompleto; i++) {
          if (Atleta.equals(tempoProva[i])){
                provaCompleta [i] = true;
                System.out.println("informe o resultado ");
                tempoProva[i] = entrada.nextDouble();
                resultadoCompleto++;
                      } else;
            
            System.out.println("Atleta não encontrado");
        }
    }
    public void relatorioDosAtletasQCompletaramProva() {
        System.out.println("~~~~~~RELATÓRIO DOS ATLETAS QUE COMPLETARAM A PROVA ~~~~~~");
        for (int i = 0; i < resultadoCompleto; i++) {
            System.out.println("o atleta " + Atletas[i]+" completou a prova");
        }
    }

    public void relatorioDosAtletasNCompletaramProva() {
        System.out.println("~~~~~~ RELATÓRIO DOS ATLETAS QUE NÃO COMPLETARAM A PROVA ~~~~~~");
        for (int i = 0; i < resultadoCompleto; i++) {
            if (provaCompleta[i]) {
                System.out.println("o atleta" + Atletas[i] + " não concluiu a prova");
            }
        }
    }
}

 