package br.unicesumar.aula.model;

public class Menu {

    public static void Menu(){

        Cabecalho();
        System.out.print(
                "MENU PRINCIPAL\n" +
                "1 - CADASTRO DE PRODUTOS\n" +
                "2 - MOVIMENTAÇÃO\n" +
                "3 - REAJUSTE DE PREÇOS\n" +
                "4 - RELATÓRIOS\n" +
                "0 - FINALIZAR\n" +
                "OPÇÃO: ");
    }
    public static void menuCadastroProduto(){
        Cabecalho();
        System.out.print(
                "CADASTRO DE PRODUTOS\n" +
                        "1 - INCLUSÃO\n" +
                        "2 - ALTERAÇÃO\n" +
                        "3 - CONSULTA\n" +
                        "4 - EXCLUSÃO\n" +
                        "0 - RETORNAR\n" +
                        "OPÇÃO: ");
    }
    public static void menuMovimentacaoProduto(){
        Cabecalho();
        System.out.print(
                "MOVIMENTAÇÃO\n" +
                "1 - ENTRADA\n" +
                "2 - SAIDA\n" +
                "0 - RETORNAR\n" +
                "OPÇÃO: ");
    }
    public static void Cabecalho(){
        System.out.println("*****************************************************");
        System.out.println("IMPORT COMPANY S/A.");
        System.out.println("SISTEMA DE CONTROLE DE ESTOQUE");
        System.out.println("*****************************************************");
    }
    public static void menuReajusteProduto(){
        Cabecalho();
        System.out.print(
                "MOVIMENTAÇÃO\n" +
                        "1 - REAJUSTE MAIOR POR PRODUTO\n" +
                        "2 - REAJUSTE MENOR POR PRODUTO\n" +
                        "3 - REAJUSTE MAIOR TODOS PRODUTO\n" +
                        "4 - REAJUSTE MENOR TODOS PRODUTO\n" +
                        "0 - RETORNAR\n" +
                        "OPÇÃO: ");
    }
}

