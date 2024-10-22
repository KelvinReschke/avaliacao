package avaliacao;

import java.util.Scanner;
// @author kelvin

public class avaliaca2tenativa {

    Scanner entrada = new Scanner(System.in);
    String produto[] = new String[10];
    boolean[] consertado = new boolean[10];
    boolean produtoEntregue[] = new boolean[10];
    double valorTotalDoConserto[] = new double[10];
    int listaDosProdutos = 0;
    double faturamento = 0;

    public static void main(String[] args) {
        avaliaca2tenativa minhaClase = new avaliaca2tenativa();
        int opcao = 0;
        do {
            opcao = minhaClase.menu();

            switch (opcao) {
                case 1:
                    minhaClase.cadastroDeProdutosRecebidos();
                    break;
                case 2:
                    minhaClase.Conserto();
                    break;
                case 3:
                    minhaClase.DevolucaoDoAparelho();
                    break;
                case 4:
    
           
            minhaClase.relatorioDosProdutos();
                    break;
                case 5:
                    minhaClase.ProdutosNaoConsertados();
                    break;
                case 6:
                    minhaClase.ProdutosNaoEntregues();
                    break;
                case 7:
                    minhaClase.faturamentoTotalDoAllan();
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }

        } while (opcao != 8);

    }

    public int menu() {
        System.out.println("__________MENU__________"
                + "\n tecle 1 para Receber Produto do cliente"
                + "\n tecle 2 para fazer o concerto"
                + "\n tecle 3 para entregar o produto ao cliente "
                + "\n tecle 4 para exibir o relatório completo de produtos"
                + "\n tecle 5 para exibir o relatório de produtos que ainda não foram consertados "
                + "\n tecle 6 para exibir o relatório de produtos consertados mas que ainda não foram retirados pelos clientes "
                + "\n tecle 7 para exibir o faturamento total da loja "
                + "\n tecle 8 se você quiser sair da aplicação: ");
        int opcaoMenu = entrada.nextInt();
        return opcaoMenu;
    }

    public void cadastroDeProdutosRecebidos() {

        System.out.println("informe o produto que deseja cadastrar: ");
        produto[listaDosProdutos] = entrada.next();
        consertado[listaDosProdutos] = false;
        produtoEntregue[listaDosProdutos] = false;
        listaDosProdutos++;

    }

    public void Conserto() {
        System.out.println("Insira qual produto quer consertar: ");
        String produtoConsertado = entrada.next();
        for (int i = 0; i < listaDosProdutos; i++) {
            if (produtoConsertado.equalsIgnoreCase(produto[i])) {
                consertado[i] = true;
                System.out.println("informe o valor do conserto ");
                valorTotalDoConserto[i] = entrada.nextDouble();
                return;
            }
            System.out.println("produto não encontrado");
        }
    }

    public void DevolucaoDoAparelho() {
        System.out.println("Insira o produto que você quer entregar: ");
        String produtoDevolvido = entrada.next();
        for (int i = 0; i < listaDosProdutos; i++) {
            if (produtoDevolvido.equalsIgnoreCase(produto[i])) {
                System.out.println("Devolução realizada com sucesso.");
                produtoEntregue[i] = true;
                return;
            }
            else { System.out.println("o produto não está cadastrado no sistema");
        }}
    }

    public void relatorioDosProdutos() {
        System.out.println("~~~~~~RELATÓRIO DE PRODUTOS ~~~~~~");
        for (int i = 0; i < listaDosProdutos; i++) {
            System.out.println("  " + produto[i]);
        }
    }

    public void ProdutosNaoConsertados() {
        System.out.println("~~~~~~ PRODUTOS NÃO CONSERTADOS ~~~~~~");
        for (int i = 0; i < listaDosProdutos; i++) {
            if (consertado[i]) {
                System.out.println("O seu produto " + produto[i] + " está consertado");
            } else {
                System.out.println("O seu produto " + produto[i] + " não está consertado");
            }
        }
    }

    public void ProdutosNaoEntregues() {
        for (int i = 0; i < listaDosProdutos; i++) {
            if ( consertado[i]&& produtoEntregue[i]) {
                System.out.println("O seu produto " + produto[i] + " foi entregue.");
            } else {
                System.out.println("O seu produto " + produto[i] + " não foi entregue.");
            }
        }
    }

    public void faturamentoTotalDoAllan() {

        for (int i = 0; i < listaDosProdutos; i++) {
            faturamento = valorTotalDoConserto[i] + faturamento;
            faturamento++;
        }
        System.out.println("O faturamento total da loja é de: " + faturamento);
    }
}
