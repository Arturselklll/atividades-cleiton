public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        //tipodavariavel nomedavariavel = valordavariavel
        //String é um TEXTO
        String nome = "Artur";
        char sexo = 'M';

        // [] -> Diz que é um array
        // {} -> Indicar um objeto
        char[] textoChar = {'5'};

        //Guardar valores Reais
        double altura = 1.74;
        double peso = 90.0;
        float alturaPessoa2 = 1.80f;
        float alturaPessoa3 = 1.83f;

        //Guardar valores inteiros
        int numeroCasa = 20;
        Integer numeroAlunos = 75;
        Long numeroGolsDoBraitWaith = 3l;

        //Operadores aritmeticos
        // + para soma
        // - para subtração
        // * para multiplicação
        // / para divisão

        Integer soma = 5 + 5;
        Integer subtracao = 5 - 2;
        Integer multiplicar = 5 * 5;
        Integer dividir = 5/5;

        Integer resultadoSoma = soma + subtracao;
        Integer resultadoSubtrair = soma - subtracao;
        Integer resultadoMultiplicar = soma * subtracao;
        Integer resultadoDivisao = soma / subtracao;

        System.out.println("Valor da divisão é : " + resultadoDivisao);
        System.out.println("Valor da multiplicação é : " + resultadoMultiplicar);
        System.out.println("Valor da soma é : " + resultadoSoma);
        System.out.println("Valor da subtracao é : " + resultadoSubtrair);

    }
}