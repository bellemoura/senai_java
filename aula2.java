import java.util.Scanner;

public class Aula2 {
 public static void main(String[] args){
  int n1 = 5;
  int n2 = 7;
  int s = n1 + n2;
  System.out.println("A soma de "+ n1 + " + " + n2 + " = " + s);

    
  Scanner scanner = new Scanner (System.in);
  
  System.out.print("1° número: ");
  int a = scanner.nextInt();
  System.out.print("2° número: ");
  int b = scanner.nextInt();

  int c = a + b;
  System.out.print("Soma: "+c);

  scanner.close();
 }
}