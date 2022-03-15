import java.lang.Math;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    double liczba = 50;
    for (int i = 1; i <= 50; i++)
      {
        if( liczba % 2 != 0)
        {
          System.out.println(liczba);
          liczba++;
        }else
          liczba++;
        
      }

  }
}