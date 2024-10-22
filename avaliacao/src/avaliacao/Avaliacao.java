package avaliacao;

import java.util.Scanner;

/**
 *
 * @author kelvin
 */
public class Avaliacao {

    /**
     * @param args the command line arguments
     */
    Scanner entrada = new Scanner(System.in);
    String[] produto = new String[10];
    boolean[] consertado = new boolean[10];
    boolean[] entregue = new boolean[10];
    double[] precoConcerto = new double[10];
    int quantidadeDeProdutos = 0;
    String[] relatorio = new String[10];
    String[] produtoConsertado = new String[10];
    String[] listadeProdutos = new String[10];

    public void menuDeOpcoes() {
        System.out.println("__________MENU__________"
                + "\n tecle 1 para Receber Produto do cliente"
                + "\n tecle 2 para fazer o concerto"
                + "\n tecle 3 para entregar o produto ao cliente "
                + "\n tecle 4 para exibir o relatório completo de produtos"
                + "\n tecle 5 para exibir o relatório de produtos que ainda não foram consertados "
                + "\n tecle 6 para exibir o relatório de produtos consertados mas que ainda não foram retirados pelos clientes "
                + "\n tecle 7 para exibir o faturamento total da loja "
                + "\n tecle 8 se você quiser sair da aplicação: ");
    }

    public static void main(String[] args) {
        Avaliacao minhaClasse = new Avaliacao();
        Object Avaliacao;
        minhaClasse.equals(10);
        int opcao = 0;
        do {
            minhaClasse.menuDeOpcoes();
            opcao = minhaClasse.entrada.nextInt();
            switch (opcao) {
                case 0:
                    minhaClasse.CadastrarProdutoDoCliente();
                    break;
                case 1:
                    minhaClasse.FazeroConcerto();
                    break;
                default:
                    System.out.println("essa opção não existe");
            }
        } while (opcao != 8kik
    

    )
    }
      

    public void CadastrarProdutoDoCliente() {
        System.out.println("informe o produto que você deseja cadastrar");
        produto[quantidadeDeProdutos] = entrada.next();
        System.out.println("informe o valor do produto");
        produto[quantidadeDeProdutos] = entrada.next();
        System.out.println("informe a quantida de produtos ");
        produto[quantidadeDeProdutos] = entrada.next();
    }

    public void FazeroConcerto() {
        System.out.println("informe o produto que deseja concertar ");
        String produtoConsertado = entrada.next();
        for (int i = 0; i < quantidadeDeProdutos; i++) {
            if (produtoConsertado.equalsIgnoreCase(produto[quantidadeDeProdutos])) {
                System.out.println(" valor do conserto ");
            }
        }
    }

    public void entrega() {
        System.out.println("informe o produto entregue ");
        String produtoEntregue = entrada.next();
        for (int i = 0; i < entregue; i++) {
            if  {listadeProdutos
            
            }

        }

    }}
