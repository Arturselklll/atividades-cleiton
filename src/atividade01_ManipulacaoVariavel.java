public class atividade01_ManipulacaoVariavel {
    public static void main(String[] args){

        //DADOS DAS PESSOAS
        int IdadePessoa1 = 22;
        int IdadePessoa2 = 23;
        double AlturaPessoa = 1.75;
        String NomePessoa = "Artur";
        boolean Estudante = true;

        //SOMA DE IDADE
        //MULTIPLICACAO DA ALTURA

        Integer SomaIdade = IdadePessoa1 + IdadePessoa2;
        double Alturadobrada = AlturaPessoa * 2;

        //O QUE VAI APARECER PARA O USUARIOS
        System.out.println("Olá" + NomePessoa);
        System.out.println("Idade:" + IdadePessoa1);
        System.out.println("Altura:" + AlturaPessoa);
        System.out.println("Nome:" + NomePessoa);
        System.out.println("É Estudante" + Estudante);
        System.out.println("Soma das Idades:" + SomaIdade);
        System.out.println("Altura Dobrada" + Alturadobrada);

    }
}
