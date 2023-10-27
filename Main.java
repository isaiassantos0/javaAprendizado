import java.util.Scanner;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    Recebedor in = new Recebedor();
    ArrayList<Integer> numbers = in.iniciador();

    Proj teste = new Proj(numbers.get(0), numbers.get(1), numbers.get(2));
  }
}

class Proj {
  private int n1;
  private int n2;
  private int op;

  public Proj(int n1, int n2, int op ) {
    this.n1 = n1;
    this.n2 = n2;
    this.op = op;
    defOp();
  }


  public int sum() {
    return n1 + n2;
  }

  private int sub() {
    return n1 - n2;
  }

  public void defOp() {

    if (op == 1) {
        System.out.print("Resultado: " + sum());  

      } else if (op == 2) {

        System.out.println("Resultado: " + sub());
      }   
  }
}