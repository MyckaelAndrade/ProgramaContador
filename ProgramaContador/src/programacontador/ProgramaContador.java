package programacontador;

import java.util.Scanner;

public class ProgramaContador {
    public static void main(String[] args) {
        //Estruturas de Repetição / Laços de Repetição
        //(do while, while, for)
        Scanner t = new Scanner(System.in);
        System.out.println("Quantidade: ");
        int c = t.nextInt();
        int i = 1;
        
        //(do while)
//        int i = 0;
//        do{
//            System.out.println(i);
//            i++;
//        }while(i < c);

        //(While)
        while(i <= c){ //Repetição com Teste Lógico no Início
            i++;
            if(i == 7 || i == 8){
                continue; //Muda o Fluxo do Laço, voltando ele para a condição
            }
            System.out.println(i);
        }
        
        //(for)
//        for(i; i < c+1; i++){ //Repetição com Teste Lógico no Início
//            System.out.println(i);
//       }
        
    }
    
}
