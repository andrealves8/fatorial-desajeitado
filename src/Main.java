import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); 

    int N = scanner.nextInt();
    int primeiroDaFila; 
    int segundoDaFila;
    int calculo = 0;
    int posMultDiv = 0;
    int posSoma = 0;
    int etapa = 1;
    int resultado = 0;
    int[] listaOperacoes = new int[N];
   
    List<Integer> lista = new LinkedList<>();
    // Guarda os números de N a 1;
    for (int index = N; index > 0; index--) {
        lista.add(index); 
    }

    // Calcula por etapas e guarda em um array
    while (!lista.isEmpty() && lista.size() > 1) {
        primeiroDaFila = lista.size();         
        segundoDaFila = lista.size() - 1;
 
        if(primeiroDaFila == lista.size() && etapa == 1) {
            listaOperacoes[posMultDiv] = primeiroDaFila * segundoDaFila;
            calculo = listaOperacoes[posMultDiv];
            lista.remove(0);             
            etapa = 2;   

        } else 

        if(primeiroDaFila == lista.size() && etapa == 2) {
            listaOperacoes[posMultDiv] = calculo / segundoDaFila;
            calculo = listaOperacoes[posMultDiv];             
            lista.remove(0);             
            etapa = 3;
            
        } else

        if(primeiroDaFila == lista.size() && etapa == 3) {
            calculo = calculo + segundoDaFila;
            listaOperacoes[posMultDiv + 1] = segundoDaFila;
            lista.remove(0);             
            etapa = 4;            
            posMultDiv++;
            
        } else

        if(primeiroDaFila == lista.size() && etapa == 4 && lista.iterator().hasNext()) {
            lista.remove(0);            
            posMultDiv++;            
            posSoma++;            
            etapa = 1;
                      
        }

        } // Fim do While
        
        resultado = listaOperacoes[0];

        for (int i = 0; i < listaOperacoes.length -1; i++) {
            
            if(listaOperacoes[i + 1] != 0) {
                resultado += listaOperacoes[i + 1];
                i++;
            }
            
            if(listaOperacoes[i + 1] != 0) {
                resultado -= listaOperacoes[i + 1];
            }

        }
        // Resultado Final
        System.out.println(resultado);
   
    }

        @Override
        public String toString() {
        return "Definitivo []";
        }
}
