public class Exercicio15 {
  public static void main (String []args) {
    int number = 2, factor = 112;
    while (factor > 1) {
      if (factor % number == 0) {
        System.out.printf(" %d ", number);
        factor /= number;
      } else {
        number++;
      }
    }
  }
}
