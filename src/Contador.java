import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro: ");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite  o segundo parâmetro: ");
        int parametroDois = terminal.nextInt();
        
        terminal.close();

        try{

            contar(parametroUm, parametroDois);

        }catch(ParametrosInvalidosExeption e){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
        
    }

    public static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosExeption {

        if (parametroDois<parametroUm){

            throw new ParametrosInvalidosExeption();

        }else{

            int contagem = parametroDois - parametroUm;

            for (int contador = 1; contador <= contagem; contador ++)
            System.out.println("Imprimindo o número "+contador);
        }

       
    }
    
}