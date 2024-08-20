public class atividade02_ManipulacaoVariavel {
    public static void main(String[] args) {

        //DADOS SOLICITADOS
        String Nomepessoa = "Cleiton";
        double Idadepessoa = 30;
        double SalarioMensal = 5000.00;
        int MesesTrabalhados = 8;
        int ProdutosComprados = 20;
        double Desconto = 2000.00;
        double produto = 200.00;


        //OPERAÇOES

        double SalarioAnual = 5000.00 * 12;
        double SalarioTrabalhado = SalarioMensal * MesesTrabalhados;
        double SalarioLiquido = SalarioAnual - Desconto;
        double MediadeGastos = ProdutosComprados * produto;

        //O QUE VAI APARECER

        System.out.println("Nome:" + Nomepessoa); System.out.println("Salario Anual Liquido é de: " + SalarioLiquido);



    }
}
