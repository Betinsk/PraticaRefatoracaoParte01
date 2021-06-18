package pkgRefatoracaoParte1;
import java.util.Scanner;
import java.util.Calendar;
public class Mensalidade {

    static Calendar calendario;
    static int quantidade = 3;
    
    
    public static void main(String[] arguments) {

    	 Scanner input = new Scanner(System.in);
    	
        double mensalidade = 0;
        double novaMensalidade = 0;
        int mes = 0;
        int mesAtual = 0;
      
        int contador = 1;
        while (contador <= quantidade) {
            System.out.println("\nValor da mensalidade: ");
            mensalidade = input.nextDouble();
            System.out.println("\nMês de referência: ");
            mes = input.nextInt();
            calendario = Calendar.getInstance();
            mesAtual = calendario.get(Calendar.MONTH) + 1;
            novaMensalidade = verificarValorMensalidade(mensalidade, novaMensalidade, mes, mesAtual);
            imprimirResultados(mensalidade, novaMensalidade, mes, mesAtual);
            contador++;
        }

        System.out.println("PROGRAMA FINALIZADO");
        input.close();
    }

    public static double verificarValorMensalidade(double mensalidade,
        	double novaMensalidade, int mes, int mesAtual) {
            if (mes < mesAtual)
                novaMensalidade = mensalidade * 1.10;
            else if (mes >= mesAtual)
                novaMensalidade = mensalidade;
            return novaMensalidade;
        }

        public static void imprimirResultados(double mensalidade, double novaMensalidade, int mes, int mesAtual) {
            System.out.println("RESULTADO");
            System.out.println("Mês Atual: " +mesAtual);
            System.out.println("Referência: " +mes);
            System.out.println("Mensalidade: " +mensalidade);
            System.out.println("Novo Valor: " +novaMensalidade);
        }

}