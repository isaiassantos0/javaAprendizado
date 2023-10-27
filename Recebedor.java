import java.util.Scanner;
import java.util.ArrayList;

public class Recebedor {
   Scanner scan = new Scanner(System.in);
   ArrayList<Integer> numbers = new ArrayList<Integer>();



   public ArrayList<Integer> iniciador () {
        ArrayList<Integer> numbers = new ArrayList<Integer>();       

        System.out.print("DIGITE UM VALOR String: ");
        String tx =  scan.nextLine();
        int op = 0;
        switch(tx) { 
            case "sum":
                op = 1;
                break;
            case "sub":
                op = 2;
                break;
            default:
            System.out.println("Invalid operation");
            System.exit(0);
        }

        System.out.print("DIGITE O PRIMEIRO VALOR: ");
        Integer n1 = scan.nextInt();
        numbers.add(n1);
        System.out.print("DIGITE O SEGUNDO VALOR: ");
        Integer n2 = scan.nextInt();

        numbers.add(n2);
        numbers.add(op);

        return numbers;
   }
}