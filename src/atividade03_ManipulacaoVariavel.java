import java.text.DecimalFormat;

public class atividade03_ManipulacaoVariavel {
    public static void main(String[] args) {

        //DADOS
        String NomeProduto = "Tenis";
        double PrecoProduto = 100;
        double ProdutosComprados = 8;
        double Imposto = 0.80;
        double Lucro = 1.10;

        //OPERACOES
        double ValorTotal = PrecoProduto * ProdutosComprados;
        double TotalImposto = ValorTotal * Imposto;
        double VendaNecessaria = ValorTotal - TotalImposto;
        double PrecoSugerido = PrecoProduto * Lucro;

        System.out.println("Venda Necessaria para Lucros " + VendaNecessaria);

        DecimalFormat df = new DecimalFormat("###.00");
        System.out.println(df.format(TotalImposto));
        System.out.println(df.format(PrecoSugerido));

        System.out.println("Nome do Produto: " + NomeProduto);
        System.out.println("Valor total com Imposto: " +df.format(ValorTotal));
        System.out.println("Valor total com " +df.format(PrecoSugerido));

    }
}
