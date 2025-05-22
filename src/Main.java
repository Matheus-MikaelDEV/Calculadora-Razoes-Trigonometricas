import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //definindo varíaveis
        double co, ca, hip, sen, cos, tg;
        String pco, pca, phip;

        //Explicação pro úsuario
        System.out.println("Esse programa ira ajudar com triângulos retângulos caso você não tenha algum dos lados e irá lhe dar as razões da trigonoemtria.");

        //Coletando se o úsuario possuí todos os dados
        System.out.println("Você possuí o cateto oposto para informar?(S ou s = sim/N ou n para não) ");
        pco = input.nextLine();
        System.out.println("Você possuí o cateto adjacente para informar?(S ou s = sim/N ou n para não) ");
        pca = input.nextLine();
        System.out.println("Você possuí a hipotenusa para informar?(S ou s = sim/N ou n para não) ");
        phip = input.nextLine();

        //pedir valor do co, ca, hip
        System.out.println("Qual o valor do cateto oposto?(0 caso não saber) ");
        co = input.nextDouble();
        System.out.println("Qual o valor do cateto adjacente?(0 caso não saber) ");
        ca = input.nextDouble();
        System.out.println("Qual o valor da hipotenusa?(0 caso não saber) ");
        hip = input.nextDouble();

        //Verificando o que o úsuario deu de dado e mostrando resultados
        if((pco.equals("s") || pco.equals("S")) && (phip.equals("s") || phip.equals("S")) && (pca.equals("s") || pca.equals("S"))) {
            System.out.println("Cateto oposto: "+co+"\nCateto adjacente: "+ca+"\nHipotenusa: "+hip);

            //calculo do sen, cos, tg
            sen = co / hip;
            cos = ca / hip;
            tg = co / ca;

            //mostrar seno, cosseno, e tangente
            System.out.println("\nSeno: "+sen+"\nCosseno: "+cos+"\nTangente: "+tg);
        }else if((pco.equals("s") || pco.equals("S")) && (phip.equals("n") || phip.equals("N")) && (pca.equals("s") || pca.equals("S"))) {
            //calculo da hipotenusa
            hip = Math.sqrt((co * co) + (ca * ca));

            System.out.println("Cateto oposto: "+co+"\nCateto adjacente: "+ca+"\nHipotenusa: "+hip);

            //calculo do sen, cos, tg
            sen = co / hip;
            cos = ca / hip;
            tg = co / ca;

            //mostrar seno, cosseno, e tangente
            System.out.println("\nSeno: "+sen+"\nCosseno: "+cos+"\nTangente: "+tg);
        }else if((pco.equals("n") || pco.equals("N")) && (phip.equals("s") || phip.equals("S")) && (pca.equals("s") || pca.equals("S")) && hip > ca) {
            //calculo do cateto oposto
            co = Math.sqrt((hip * hip) - (ca * ca));

            System.out.println("Cateto oposto: "+co+"\nCateto adjacente: "+ca+"\nHipotenusa: "+hip);

            //calculo do sen, cos, tg
            sen = co / hip;
            cos = ca / hip;
            tg = co / ca;

            //mostrar seno, cosseno, e tangente
            System.out.println("\nSeno: "+sen+"\nCosseno: "+cos+"\nTangente: "+tg);
        }else if((pco.equals("s") || pco.equals("S")) && (phip.equals("s") || phip.equals("S")) && (pca.equals("n") || pca.equals("N")) && hip > co) {
            //calculo do cateto adjacente
            ca = Math.sqrt((hip * hip) - (co * co));

            System.out.println("Cateto oposto: "+co+"\nCateto adjacente: "+ca+"\nHipotenusa: "+hip);

            //calculo do sen, cos, tg
            sen = co / hip;
            cos = ca / hip;
            tg = co / ca;

            //mostrar seno, cosseno, e tangente
            System.out.println("\nSeno: "+sen+"\nCosseno: "+cos+"\nTangente: "+tg);
        }else{
            System.out.println("Algo a qual você inseriu impossibilita de lhe entregar os dados.");
        }
    }
}