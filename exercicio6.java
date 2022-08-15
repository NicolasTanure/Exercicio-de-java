import java.util.Scanner;


public class exercicio6 
{
  public static void main(String args[])
  {
    Scanner teclado=new Scanner(System.in);
    double Fahrenheit,Celsius;
    System.out.println("informe o Fahrenheit");
    Fahrenheit=teclado.nextDouble();
    Celsius=5.0/9*(Fahrenheit-32);
    System.out.println("resultado em Celsius:"+ Celsius);
}
}
