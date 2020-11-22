import java.util.Scanner;
public class index {
  public static void main(String[] args) {
    int a = 0;
    int b = 1;
    int quantidade;
    int fibo;
    int ant;
    Scanner input = new Scanner(System.in);

    
    System.out.print("Digite a quantidade de termos da sequencia de fibonacci: ");
    quantidade = input.nextInt();
    input.close(); 
    System.out.println("");
    System.out.println ("A sequencia é: ");
    for (fibo=1 ; fibo <= quantidade; fibo++){
    System.out.println(a + " ");    
    ant = a;   
    a = b + a;
    b = ant;
    }


  }
}