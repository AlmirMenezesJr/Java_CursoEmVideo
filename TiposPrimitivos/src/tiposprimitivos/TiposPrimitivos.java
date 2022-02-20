package tiposprimitivos;

import java.util.Scanner;


public class TiposPrimitivos {

    
    public static void main(String[] args) {
        /* int idade = 34;
        int idade2 = (int) 35;  //typecast
        Integer idade3 = new Integer(3);  // Wrapper Class
        
        float sal = 1825.54f;
        float sat2 = (float)1825.54;
        Float sat3 = new Float (1825.54);
        
        char letra = 'G';
        char letra2 = (char) 'G';
        Character letra3 = new Character ('G');
        
        boolean casado = false;
        boolean casado2 = (boolean)false;
        Boolean casado3 = new Boolean (false);
       */ 
       Scanner teclado = new Scanner(System.in);
       System.out.print("Digite o nome do aluno: ");
       String nome = teclado.nextLine(); 
       System.out.print("Digite a nota do aluno: ");
       float nota = teclado.nextFloat();
       // forma de impressão de dados no terminal
       System.out.print("A nota é " + nota + "\n");
       System.out.println("A nota é " + nota);
       System.out.printf("A sua nota de %s é %.2f. \n", nome, nota);
       System.out.format("A sua nota de %s é %.2f. \n", nome, nota);
       
       
    }
    
}
