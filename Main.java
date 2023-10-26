import java.util.Scanner;


public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("DIGITE UM VALOR String: ");
    String operation = scan.nextLine();

    System.out.print("DIGITE O PRIMEIRO VALOR: ");
    int n1 = scan.nextInt();

    System.out.print("DIGITE O SEGUNDO VALOR: ");
    int n2 = scan.nextInt();

    Proj p = new Proj(n1, n2, operation);
  }
}

class Proj {
  private int n1;
  private int n2;
  public String op;
  public int resultado;

  public Proj(int n1, int n2, String op) {
    this.n1 = n1;
    this.n2 = n2;
    this.op = op;
    defOp();
  }

  public int sum() {
    return this.resultado = n1 + n2;
  }

  private int sub() {
    return n1 - n2;
  }

  public void defOp() {

    if (op.equals("sum")) {
        System.out.print("Resultado: " + sum());  

      } else if (op.equals("sub")) {

        System.out.println("Resultado: " + sub());
      } else {
        System.out.println("Invalid operation");
      }    
  }
}
import java.util.Scanner;


public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("DIGITE UM VALOR String: ");
    String operation = scan.nextLine();

    System.out.print("DIGITE O PRIMEIRO VALOR: ");
    int n1 = scan.nextInt();

    System.out.print("DIGITE O SEGUNDO VALOR: ");
    int n2 = scan.nextInt();

    Proj p = new Proj(n1, n2, operation);
  }
}

class Proj {
  private int n1;
  private int n2;
  public String op;
  public int resultado;

  public Proj(int n1, int n2, String op) {
    this.n1 = n1;
    this.n2 = n2;
    this.op = op;
    defOp();
  }

  public int sum() {
    return this.resultado = n1 + n2;
  }

  private int sub() {
    return n1 - n2;
  }

  public void defOp() {

    if (op.equals("sum")) {
        System.out.print("Resultado: " + sum());  

      } else if (op.equals("sub")) {

        System.out.println("Resultado: " + sub());
      } else {
        System.out.println("Invalid operation");
      }    
  }
}
